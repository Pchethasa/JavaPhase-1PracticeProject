package p1;

public class ConstructorImplement {
	public static void main(String[] args) {
        //default 
        Person defaultPerson = new Person();
        defaultPerson.display();
        
        // parameter
        Person parameterizedPerson = new Person("John", 25);
        parameterizedPerson.display();
        
    }
}

class Person {
    String name;
    int age;

    // Default constructor
    Person() {
    	System.out.println("Default Constructor");
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    Person(String name, int age) {
    	System.out.println("Parameter Constructor");
        this.name = name;
        this.age = age;
    }
    void display() {
    	System.out.println("Name : " + name);
    	System.out.println("Age : " + age);
    }
}



