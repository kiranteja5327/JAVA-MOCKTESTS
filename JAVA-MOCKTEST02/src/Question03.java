/*
 3. Create a class called Person with private properties like name, age, and address. Provide public getter and setter methods for these properties. Write a program that creates an instance of the Person class, s
  sets values for its properties using the setter methods, and displays the values using the getter methods.
 */
class Person {
    private String name;
    private int age;
    private String address;

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class Question03 {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Teja kiran");
        person.setAge(23);
        person.setAddress("west godavri dist "+","+"A.P");

        
        String name = person.getName();
        int age = person.getAge();
        String address = person.getAddress();

        
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

