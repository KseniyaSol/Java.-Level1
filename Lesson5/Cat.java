package Lesson5;

import java.util.Random;

public class Cat extends Animal{
    private int tmpMaxLenghtForRun;
    private int tmpMaxHeightForJump;
    Random random = new Random();

    public Cat(String type, String color, int weight) {
        super(type, color, weight);
        tmpMaxLenghtForRun = random.nextInt(300);
        tmpMaxHeightForJump = random.nextInt(3);
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

    public int getTmpMaxLenghtForRun() {
        return tmpMaxLenghtForRun;
    }

    public int getTmpMaxHeightForJump() {
        return tmpMaxHeightForJump;
    }
}
