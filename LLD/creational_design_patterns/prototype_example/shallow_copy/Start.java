package prototype_example.shallow_copy;

public class Start {
    public static void main(String[] args) {
        Address a1 = new Address("New york", "US", 1234);
        Student s1 = new Student(1, "John", "9876", a1);
        Student s2 = s1; //copy
        Student studentClone = s1.clone(); //clone

        System.out.println(s2); //memory address same as s1, because it is references not clones
        System.out.println(studentClone); //memory address different from s1 because it is cloned (new object);

        System.out.println(s1.address.city);
        System.out.println(studentClone.address.city);
        s1.address.city="Mumbai"; 
        // when s1 address is updated, 
        // this means that the cloned object and the original object share references to the same objects in memory.
        System.out.println(s1.address.city);
        System.out.println(studentClone.address.city);
    }
}
