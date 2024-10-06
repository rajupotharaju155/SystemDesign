package prototype_example.deep_copy;

public class Start {
    public static void main(String[] args) {
        Address a1 = new Address("New york", "US", 1234);
        Student s1 = new Student(1, "John", "9876", a1);
        Student studentClone = s1.clone(); //clone

        System.out.println(studentClone); //memory address different from s1 because it is cloned (new object);

        System.out.println(s1.address.city);
        System.out.println(studentClone.address.city);
        s1.address.city="Mumbai"; 
        // when s1 address is updated, s2 address is NOT updated
        // This means changes to the inner objects in the copy will not affect the original object.
        System.out.println(s1.address.city);
        System.out.println(studentClone.address.city);
    }
}
