package Lesson2;

public class Lesson2 {
    public static void main(String[] args){
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] array2 = new int[8];
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] array4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] array5 = {{0, 0, 0, 0, 0},{0, 0, 0, 0, 0},{0, 0, 0, 0, 0},{0, 0, 0, 0, 0},{0, 0, 0, 0, 0}};
        int[] array6 = {1, 2, 3, 4, 5};
        int n = -2;
        replaceArray1(array1);
        writeToArray2(array2);
        multiplicationArray3(array3);
        minAndMaxElementInArray(array4);
        diagonalArray(array5);
        moveArray(array6, n);
    }

    public static void replaceArray1(int[] a){
        System.out.print("Task1 Result: ");
        for (int i = 0; i < a.length; i++){
            if (a[i] == 0){
                a[i] = 1;
            }else{
                a[i] = 0;
            }
            System.out.print(a[i] + " ");
        }
    }

    public static void writeToArray2(int[] a){
        int b = -2;
        System.out.print("\n"+"Task2 Result: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = b += 3;
            System.out.print(a[i] + " ");
        }
    }

    public static void multiplicationArray3(int[] a){
        System.out.print("\n"+"Task3 Result: ");
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6){
                a[i] *= 2;
            }
            System.out.print(a[i] + " ");
        }
    }

    public static void minAndMaxElementInArray(int[] a){           //применила сортировку пузырьком
        int b, c=1;
        System.out.print("\n"+"Task4 Result: ");
        do {
            c = 0;
            for (int i = 0; i < a.length - 1; i++) {

                if (a[i] > a[i + 1]) {
                    b = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = b;
                    c = 1;
                }
            }
        }while (c != 0);
        System.out.print("Min = " + a[0] + " ");
        System.out.print("Max = " + a[a.length - 1] + " ");
    }

    public static void diagonalArray(int[][] a){
        int b = 0;
        System.out.print("\n"+"Task5 Result:"+"\n");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j){a[i][j] = 1;};
                if (b % 4 == 0){a[i][j] = 1;};
                b++;
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void moveArray(int[] a, int b){
        int c;
        System.out.print("\n"+"Task6+7 Result: ");
        if (b != 0) {
            if (b > 0) {
                for (int i = 0; i < b; i++) {
                    c = a[0];
                    a[0] = a[a.length - 1];
                    for (int j = 1; j < a.length - 1; j++) {
                        a[a.length - j] = a[a.length - j - 1];
                    }
                    a[1] = c;
                }
            } else {
                for (int i = 0; i > b; i--) {
                    c = a[a.length - 1];
                    a[a.length - 1] = a[0];
                    for (int j = 1; j < a.length - 1; j++) {
                        a[j - 1] = a[j];
                    }
                    a[a.length - 2] = c;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
