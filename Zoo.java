
interface Animal {
    void makeSound();
    void move();
}


class Bird implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }

    @Override
    public void move() {
        System.out.println("Fly");
    }
}


class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void move() {
        System.out.println("Run");
    }
}


public class Zoo {
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal dog = new Dog();

        bird.makeSound();
        bird.move();

        dog.makeSound();
        dog.move();
    }
}