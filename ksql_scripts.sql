create stream generic_key_value_stream_raw with(value_avro_schema_full_name='com.meetup.sink.schema.GenericKeyValueRawStream', kafka_topic='customers.public.generic_key_value', value_format='avro');

create stream generic_key_value_raw_address_stream with(value_avro_schema_full_name='com.meetup.sink.schema.GenericKeyValueRawAddressStream', kafka_topic='customers.sink.generic_key_value_raw_address', value_format='avro') as select * from generic_key_value_stream_raw where id_type = 'Customers' and key_col in('Address Line 1','Address Line 2', 'city', 'state', 'zip') partition by id emit changes;

create table address_table_map with(value_avro_schema_full_name='com.meetup.sink.schema.AddressTableMap', kafka_topic='customers.sink.address_table_map', value_format='avro') as select id, as_map(collect_list(key_col), collect_list(key_val)) as address_map from generic_key_value_raw_address_stream group by id emit changes;

create stream customer_raw_stream(id varchar, first_name varchar, last_name varchar, email varchar) with (kafka_topic='customers.public.customers', value_format='avro');

create stream customer_final_stream with(value_avro_schema_full_name='com.meetup.sink.schema.CustomerFinal', kafka_topic='customers.sink.final.customer', value_format='avro') as select * from customer_raw_stream partition by id emit changes;

create stream CUSTOMER_TARGET_ID(customer_id varchar, id bigint) with (kafka_topic='customers.sink.target.id', value_format='avro');

create table customer_id_vs_target_id_table with(value_avro_schema_full_name='com.meetup.sink.schema.CustomerIdVsTargetIdTable', kafka_topic='customer_id_vs_target_id', value_format='avro') as select customer_id, latest_by_offset(id) as TARGET_ID from customer_target_id group by customer_id emit changes;

create table address_table_final with(value_avro_schema_full_name='com.meetup.sink.schema.AddressTableFinal', kafka_topic='customers.sink.address.table.final', value_format='avro') as select adr_map.id as customer_id,lookup.target_id as target_customer_id, adr_map.address_map['Address Line 1'] as ADDRESs_LINE_1, adr_map.address_map['Address Line 2'] as ADDRESS_LINE_2, adr_map.address_map['city'] as CITY, adr_map.address_map['state'] as STATE, adr_map.address_map['zip'] as ZIP from address_table_map as adr_map inner join customer_id_vs_target_id_table as lookup on adr_map.id = lookup.customer_id where ARRAY_LENGTH(MAP_KEYS(adr_map.address_map)) = 5 emit changes;

