package prototype_example.deep_copy;

public class Student implements Cloneable { //implementing Cloneable doesnt give any methods, it only indicates class supports cloning 
    private int id;
    public String name;
    private String phone;
    // private String address;
    Address address;

    public Student(int id, String name, String phone, Address address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public Student clone(){
        Student clonesStudent = new Student(id, name, phone, address); //this is Shallow Copying
        clonesStudent.address = address.clone(); //this is deep copying
        return clonesStudent;
    }
}

class Address implements Cloneable{
    String city;
    String country;
    int pinCode;

    public Address(String city, String country, int pinCode) {
        this.city = city;
        this.country = country;
        this.pinCode = pinCode;
    }

    @Override
    public Address clone(){
        return new Address(city, country, pinCode);
    }
}
