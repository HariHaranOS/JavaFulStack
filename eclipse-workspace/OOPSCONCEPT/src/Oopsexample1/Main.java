package Oopsexample1;

class Dog {
    
    private String name;
    private int age;

    
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }

       public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Method to make the dog bark
    public void bark() {
        System.out.println(name + " says Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of the Dog class
        Dog dog1 = new Dog("Buddy", 3);
        Dog dog2 = new Dog("Max", 2);

        // Access and modify object properties
        dog1.bark();
        System.out.println(dog1.getName() + " is " + dog1.getAge() + " years old.");

        dog2.bark();
        System.out.println(dog2.getName() + " is " + dog2.getAge() + " years old.");

        // Modify age using setter method
        dog1.setAge(4);
        System.out.println(dog1.getName() + " is now " + dog1.getAge() + " years old.");
        
        // Attempt to set a negative age
        dog2.setAge(-1);

        // Modify name using setter method
        dog2.setName("Charlie");
        System.out.println("The second dog's name is now " + dog2.getName());
    }
}


	

