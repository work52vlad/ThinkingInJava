public class Exercise5 {

    public static void main(String[] args) {

        Dog pet = new Dog();

        pet.bark();
        pet.bark("Vladislav");

    }

}

class Dog {

    public void bark() {

        System.out.println("You're stupid");

    }

    public void bark(String name) {

        System.out.println(name + " is stupid");

    }

}
