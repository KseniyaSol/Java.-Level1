package JavaCoreLesson2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("The result is: " + workWithArray());
    }

    public static int workWithArray(){
        System.out.println("Enter array 4x4 with strings");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cols:");
        int a = scanner.nextInt();
        System.out.println("Enter rows:");
        int b = scanner.nextInt();
        String[][] array = new String[a][b];
        int sum = 0;
        int ix = 0;
        int jx = 0;
        boolean sizeEx = false;
        try {
            if (a > 4 || b > 4) {
                sizeEx = true;
                throw new Exception("MyArraySizeException");
            }
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        System.out.println("Enter " + (i+1) + "x" + (j+1) + " element:");
                        array[i][j] = scanner.next();
                    }
                }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    ix = i;
                    jx = j;
                    sum += Integer.valueOf(array[i][j]);
                }
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            } catch (Exception e) {
            if (sizeEx){
                System.out.println("Array more than 4x4! - MyArraySizeException");
            }else {
                System.out.println("In " + (ix+1) + "x" + (jx+1) + " value is not number! - MyArrayDataException");
                sum = 0;
            }
        }
        return sum;
    }
}
