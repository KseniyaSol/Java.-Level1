package Lesson1;

public class Lesson1 {
    public static void main(String[] args){
        int a = 28;
        int b = 76;
        int c = 49;
        int d = 53;
        int e = 5;
        int f = 15;
        int g = -3;
        String h = "Kseniya";
        int j = 2021;
        System.out.println("Task 1 result: " +task1(a, b, c, d));
        System.out.println("Task 2 result: " +task2(e, f));
        task3(g);
        System.out.println("Task 4 result: " +task4(h));
        task5(j);
    }

    public static double task1(int value1, int value2, int value3, int value4){
        return (value1 * (value2 + (value3/value4)));
    }

    public static boolean task2(int value1, int value2){
        if ((value1 + value2 > 10) && (value1 + value2 <= 20)){
            return true;
        } else {
            return false;
        }
    }

    public static void task3(int value1){
        if (value1 < 0){
            System.out.println("Task 3 result: negative");
        }else{
            System.out.println("Task 3 result: positive");
        }
    }

    public static String task4(String value1){
        return ("Привет, " +value1 +"!");
    }

    public static void task5(double value1){
        if (((value1 % 4 == 0) && (value1 % 100 != 0)) || ((value1 % 400 == 0))){
            System.out.println("Task 5 result: leap");
        }else{
            System.out.println("Task 5 result: not leap");
        }
    }
}
