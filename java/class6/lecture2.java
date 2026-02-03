// continution part is there in lecture3.java
// serializable interface is implemented to make object serializable.
// transient keyword is used to skip the field during serialization.
// serializable interface is a marker interface (it has no methods to implement).
// when an object is serialized, all fields marked as transient are not included in the serialized representation.
// this is useful for sensitive information or fields that can be derived and do not need to be stored.

import java.io.Serializable;

public class lecture2 implements Serializable {
    private String id;
    transient private String name;

    public lecture2(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}