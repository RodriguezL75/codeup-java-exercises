//implementor
public class PersonTester {

    //Create a main method on the class that creates a new Person object and tests the above methods.
//Main Method
//    big "P" represents the class; small p represents an item/object(two items cannot have the same name) in a class
//    new Person copies the values of Person constructor in Person.java

    public static void main(String[] args) {
        Person person =  new Person();
        person.setName("Lisa");
        person.sayHello();
        System.out.println(person.getName());

        Person employee = new Person();
        employee.setName("Phillip");
        employee.sayHello();

//implementing the following in the MAIN
        Person person1 =  new Person();
        person1.setName("John");

        Person person2 =  new Person();
        person2.setName("John");

        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);


    }

}
