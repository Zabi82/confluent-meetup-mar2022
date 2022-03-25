/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.meetup.sink.schema;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class CustomerIdLookupValue extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1823599091486001239L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CustomerIdLookupValue\",\"namespace\":\"com.meetup.sink.schema\",\"fields\":[{\"name\":\"CUSTOMER_ID\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"ID\",\"type\":[\"null\",\"int\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CustomerIdLookupValue> ENCODER =
      new BinaryMessageEncoder<CustomerIdLookupValue>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CustomerIdLookupValue> DECODER =
      new BinaryMessageDecoder<CustomerIdLookupValue>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CustomerIdLookupValue> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CustomerIdLookupValue> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CustomerIdLookupValue> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CustomerIdLookupValue>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CustomerIdLookupValue to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CustomerIdLookupValue from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CustomerIdLookupValue instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CustomerIdLookupValue fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence CUSTOMER_ID;
   private java.lang.Integer ID;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CustomerIdLookupValue() {}

  /**
   * All-args constructor.
   * @param CUSTOMER_ID The new value for CUSTOMER_ID
   * @param ID The new value for ID
   */
  public CustomerIdLookupValue(java.lang.CharSequence CUSTOMER_ID, java.lang.Integer ID) {
    this.CUSTOMER_ID = CUSTOMER_ID;
    this.ID = ID;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return CUSTOMER_ID;
    case 1: return ID;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: CUSTOMER_ID = (java.lang.CharSequence)value$; break;
    case 1: ID = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'CUSTOMER_ID' field.
   * @return The value of the 'CUSTOMER_ID' field.
   */
  public java.lang.CharSequence getCUSTOMERID() {
    return CUSTOMER_ID;
  }


  /**
   * Sets the value of the 'CUSTOMER_ID' field.
   * @param value the value to set.
   */
  public void setCUSTOMERID(java.lang.CharSequence value) {
    this.CUSTOMER_ID = value;
  }

  /**
   * Gets the value of the 'ID' field.
   * @return The value of the 'ID' field.
   */
  public java.lang.Integer getID() {
    return ID;
  }


  /**
   * Sets the value of the 'ID' field.
   * @param value the value to set.
   */
  public void setID(java.lang.Integer value) {
    this.ID = value;
  }

  /**
   * Creates a new CustomerIdLookupValue RecordBuilder.
   * @return A new CustomerIdLookupValue RecordBuilder
   */
  public static com.meetup.sink.schema.CustomerIdLookupValue.Builder newBuilder() {
    return new com.meetup.sink.schema.CustomerIdLookupValue.Builder();
  }

  /**
   * Creates a new CustomerIdLookupValue RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CustomerIdLookupValue RecordBuilder
   */
  public static com.meetup.sink.schema.CustomerIdLookupValue.Builder newBuilder(com.meetup.sink.schema.CustomerIdLookupValue.Builder other) {
    if (other == null) {
      return new com.meetup.sink.schema.CustomerIdLookupValue.Builder();
    } else {
      return new com.meetup.sink.schema.CustomerIdLookupValue.Builder(other);
    }
  }

  /**
   * Creates a new CustomerIdLookupValue RecordBuilder by copying an existing CustomerIdLookupValue instance.
   * @param other The existing instance to copy.
   * @return A new CustomerIdLookupValue RecordBuilder
   */
  public static com.meetup.sink.schema.CustomerIdLookupValue.Builder newBuilder(com.meetup.sink.schema.CustomerIdLookupValue other) {
    if (other == null) {
      return new com.meetup.sink.schema.CustomerIdLookupValue.Builder();
    } else {
      return new com.meetup.sink.schema.CustomerIdLookupValue.Builder(other);
    }
  }

  /**
   * RecordBuilder for CustomerIdLookupValue instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CustomerIdLookupValue>
    implements org.apache.avro.data.RecordBuilder<CustomerIdLookupValue> {

    private java.lang.CharSequence CUSTOMER_ID;
    private java.lang.Integer ID;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.meetup.sink.schema.CustomerIdLookupValue.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.CUSTOMER_ID)) {
        this.CUSTOMER_ID = data().deepCopy(fields()[0].schema(), other.CUSTOMER_ID);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.ID)) {
        this.ID = data().deepCopy(fields()[1].schema(), other.ID);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing CustomerIdLookupValue instance
     * @param other The existing instance to copy.
     */
    private Builder(com.meetup.sink.schema.CustomerIdLookupValue other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.CUSTOMER_ID)) {
        this.CUSTOMER_ID = data().deepCopy(fields()[0].schema(), other.CUSTOMER_ID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ID)) {
        this.ID = data().deepCopy(fields()[1].schema(), other.ID);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'CUSTOMER_ID' field.
      * @return The value.
      */
    public java.lang.CharSequence getCUSTOMERID() {
      return CUSTOMER_ID;
    }


    /**
      * Sets the value of the 'CUSTOMER_ID' field.
      * @param value The value of 'CUSTOMER_ID'.
      * @return This builder.
      */
    public com.meetup.sink.schema.CustomerIdLookupValue.Builder setCUSTOMERID(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.CUSTOMER_ID = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'CUSTOMER_ID' field has been set.
      * @return True if the 'CUSTOMER_ID' field has been set, false otherwise.
      */
    public boolean hasCUSTOMERID() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'CUSTOMER_ID' field.
      * @return This builder.
      */
    public com.meetup.sink.schema.CustomerIdLookupValue.Builder clearCUSTOMERID() {
      CUSTOMER_ID = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'ID' field.
      * @return The value.
      */
    public java.lang.Integer getID() {
      return ID;
    }


    /**
      * Sets the value of the 'ID' field.
      * @param value The value of 'ID'.
      * @return This builder.
      */
    public com.meetup.sink.schema.CustomerIdLookupValue.Builder setID(java.lang.Integer value) {
      validate(fields()[1], value);
      this.ID = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'ID' field has been set.
      * @return True if the 'ID' field has been set, false otherwise.
      */
    public boolean hasID() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'ID' field.
      * @return This builder.
      */
    public com.meetup.sink.schema.CustomerIdLookupValue.Builder clearID() {
      ID = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CustomerIdLookupValue build() {
      try {
        CustomerIdLookupValue record = new CustomerIdLookupValue();
        record.CUSTOMER_ID = fieldSetFlags()[0] ? this.CUSTOMER_ID : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.ID = fieldSetFlags()[1] ? this.ID : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CustomerIdLookupValue>
    WRITER$ = (org.apache.avro.io.DatumWriter<CustomerIdLookupValue>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CustomerIdLookupValue>
    READER$ = (org.apache.avro.io.DatumReader<CustomerIdLookupValue>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.CUSTOMER_ID == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.CUSTOMER_ID);
    }

    if (this.ID == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeInt(this.ID);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.CUSTOMER_ID = null;
      } else {
        this.CUSTOMER_ID = in.readString(this.CUSTOMER_ID instanceof Utf8 ? (Utf8)this.CUSTOMER_ID : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.ID = null;
      } else {
        this.ID = in.readInt();
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.CUSTOMER_ID = null;
          } else {
            this.CUSTOMER_ID = in.readString(this.CUSTOMER_ID instanceof Utf8 ? (Utf8)this.CUSTOMER_ID : null);
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.ID = null;
          } else {
            this.ID = in.readInt();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









