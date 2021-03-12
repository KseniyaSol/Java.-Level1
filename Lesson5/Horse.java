package Lesson5;

import java.util.Random;

public class Horse extends Animal{
    private int tmpMaxLenghtForRun;
    private float tmpMaxHeightForJump;
    private int tmpMaxLenghtForSwim;
    Random random = new Random();

    public Horse(String type, String color, int weight) {
        super(type, color, weight);
        tmpMaxLenghtForRun = random.nextInt(2000);
        tmpMaxHeightForJump = random.nextInt(5);
        tmpMaxLenghtForSwim = random.nextInt(130);
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
