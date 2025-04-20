public class Animals {
    String name;
    int age;

    Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animals {
    Dog(String name, int age) {
        super(name, age);
    }
}

class Cat extends Animals {
    Cat(String name, int age) {
        super(name, age);
    }
}

class Check {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy", 12);
        Cat c = new Cat("Meow", 14);

        d.display();
        c.display();
    }
}
