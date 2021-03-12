package Lesson5;

public abstract class Animal {
    protected int maxLenghtForRun;
    protected float maxHeightForJump;
    protected int maxLenghtForSwim;
    protected String type;
    protected String color;
    protected int weight;

    public Animal(String type, String color, int weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    void run(int lenght){
        if (lenght <= maxLenghtForRun){
            System.out.println(type + " run!");
        }else {
            System.out.println(type + " don't run!");
        }
    }

    void swim(int lenght){
        if (lenght <= maxLenghtForSwim){
            System.out.println(type + " swim!");
        }else {
            System.out.println(type + " don't swim!");
        }
    }

    void jump(float height){
        if (height <= maxHeightForJump){
            System.out.println(type + " jump!");
        }else {
            System.out.println(type + " don't jump!");
        }
    }
}
