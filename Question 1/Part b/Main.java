class MathOperations {

    // Multiply 2 integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Multiply 3 integers
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

// Method Overriding
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Dog class overrides makeSound()
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof woof!");
    }
}

// Cat class overrides makeSound()
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow meow!");
    }
}

// Main Execution Class
public class Main {
    public static void main(String[] args) {

        //Method Overloading
        MathOperations math = new MathOperations();
        System.out.println("Multiply 2 numbers: " + math.multiply(3, 4));  
        System.out.println("Multiply 3 numbers: " + math.multiply(2, 3, 4));  

        //method
        Animal myDog = new Dog();  
        Animal myCat = new Cat();  

        //output
        myDog.makeSound();  
        myCat.makeSound();  
    }
}
