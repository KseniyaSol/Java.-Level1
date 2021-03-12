package Lesson5;

import java.util.Random;

public class Bird extends Animal{
    private int tmpMaxLenghtForRun;
    private float tmpMaxHeightForJump;
    Random random = new Random();

    public Bird(String type, String color, int weight) {
        super(type, color, weight);
        tmpMaxLenghtForRun = random.nextInt(7);
        tmpMaxHeightForJump = random.nextFloat();
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
        System.out.println(type + " don't swim!");
    }
}
