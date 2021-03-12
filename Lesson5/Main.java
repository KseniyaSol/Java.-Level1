package Lesson5;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog("Dog", "Black", 12);
        Horse horse = new Horse("Horse", "White", 80);
        Bird bird = new Bird("Bird", "Blue", 1);
        Cat cat = new Cat("Cat", "Red", 8);
        Cat cat1 = new Cat("Cat", "Brown", 3);
        dog.run(500);
        dog.jump(0.51f);
        dog.swim(8);
        horse.run(1501);
        horse.jump(3);
        horse.swim(60);
        bird.run(5);
        bird.jump(0.21f);
        bird.swim(1);
        System.out.println("Cat's max lenght for run is: " + cat.getTmpMaxLenghtForRun() + " and max height for jump is: " + cat.getTmpMaxHeightForJump());
        System.out.println("Cat1's max lenght for run is: " + cat1.getTmpMaxLenghtForRun() + " and max height for jump is: " + cat1.getTmpMaxHeightForJump());
        cat.run(150);
        cat1.run(150);
        cat.jump(2);
        cat1.jump(2);
        cat.swim(1);
    }
}
