package prototype_example.shallow_copy;

public class Student implements Cloneable { //implementing Cloneable doesnt give any methods, it only indicates class supports cloning 
    int id;
    String name;
    String phone;
    Address address;

    public Student(int id, String name, String phone, Address address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public Student clone(){
        return new Student(id, name, phone, address); //this is Shallow Copying, 'address' is not duplicated but referenced
    }
}

class Address{
    String city;
    String country;
    int pinCode;

    public Address(String city, String country, int pinCode) {
        this.city = city;
        this.country = country;
        this.pinCode = pinCode;
    }
}
