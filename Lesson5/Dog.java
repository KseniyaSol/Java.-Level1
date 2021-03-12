package Lesson5;

import java.util.Random;

public class Dog extends Animal{
    private int tmpMaxLenghtForRun;
    private float tmpMaxHeightForJump;
    private int tmpMaxLenghtForSwim;
    Random random = new Random();

    public Dog(String type, String color, int weight) {
        super(type, color, weight);
        tmpMaxLenghtForRun = random.nextInt(650);
        tmpMaxHeightForJump = random.nextFloat();
        tmpMaxLenghtForSwim = random.nextInt(13);
    }

    @Override
    void run(int lenght) {
        maxLenghtForRun = tmpMaxLenghtForRun;
        super.run(lenght);
    }

    @Override
    void jump(float height) {
        maxHeightForJump = tmpMaxHeightForJump;
        super.jump(height);
    }

    @Override
    void swim(int lenght) {
        maxLenghtForSwim = tmpMaxLenghtForSwim;
        super.swim(lenght);
    }
}
