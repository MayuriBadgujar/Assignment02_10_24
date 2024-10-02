
/*
Utilize an abstract class named Animal, featuring abstract methods sound() and move(),
 to design concrete subclasses such as Dog, Cat,

 and Bird that inherit from Animal and implement the necessary methods?
 */


abstract class Animal {

    abstract public void sound();
    abstract public void move();


}

class Dog extends Animal {
    public void sound() {
        System.out.println("The dog barks.....");
    }

    public void move() {
        System.out.println("The dog moves");
    }

    static class Cat extends Animal {
        public void sound() {
            System.out.println("The cat meuuuuuuuuuuuu.....");
        }

        public void move() {
            System.out.println("The cat moves");
        }


    }

    static class Bird extends Animal {
        public void sound() {
            System.out.println("The birds chirps:cucuuuuuuuuuuuuu.....");
        }

        public void move() {
            System.out.println("Birds flies in the sky!");
        }
    }

    public static class TestAnimal {
        public static void main(String[] args) {
            System.out.println("___________________Charlie______________");
            Dog charlie = new Dog();
            charlie.sound();
            charlie.move();

            System.out.println("___________________Cat_________________");
            Cat mau=new Cat();
            mau.sound();
            mau.move();

            System.out.println("------------------Bird___________________");
            Bird bird=new Bird();
            bird.sound();
            bird.move();
        }
    }
}
/*
___________________Charlie______________
The dog barks.....
The dog moves
___________________Cat_________________
The cat meuuuuuuuuuuuu.....
The cat moves
------------------Bird___________________
The birds chirps:cucuuuuuuuuuuuuu.....
Birds flies in the sky!
 */