package com.meetup.sink.mapper;

import com.meetup.sink.entity.Customers;
import com.meetup.sink.schema.CustomerFinal;
import org.springframework.stereotype.Component;


@Component
public class CustomerMapper {

    public Customers customerStreamToCustomerEntity(String key, CustomerFinal customerFinal) {
        Customers customers = new Customers();
        customers.setCustomerRef(key);
        customers.setEmail(customerFinal.getEMAIL().toString());
        customers.setFirstName(customerFinal.getFIRSTNAME().toString());
        customers.setLastName(customerFinal.getLASTNAME().toString());
        return customers;
    }
}
