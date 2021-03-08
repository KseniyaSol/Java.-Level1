package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args){
        drawMap(map);
        while (true){
            playerStep(map);
            drawMap(map);
            if (isDraw(map)){
                System.out.println("Draw!");
                break;
            }
            if (isWin(map, player)){
                System.out.println("Player win!");
                break;
            }
            compStep(map);
            drawMap(map);
            if (isDraw(map)){
                System.out.println("Draw!");
                break;
            }
            if (isWin(map, comp)){
                System.out.println("Computer win!");
                break;
            }
        }
    }

    public static char[][] map = {{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};
    public static char player = 'X';
    public static char comp = '0';
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void drawMap(char[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("|" + a[i][j]);
            }
            System.out.println("|");
        }
        System.out.println();
    }

    public static boolean isValidStep(int y, int x, char[][] a){
        return x >= 0 && x < a.length + 1 && y >= 0 && y < a[x].length + 1;
    }

    public static boolean isDraw(char[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == '_'){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isWin(char[][] a, char gamer){
        boolean result1 = true;
        boolean result2 = true;
        boolean result3 = true;
        boolean result4 = true;
        boolean result5 = true;
        boolean result6 = true;
        boolean result7 = true;
        boolean result8 = true;
        for (int i = 0; i < a.length; i++) {
            if (a[0][i] != gamer){
                result1 = false;
            }
            if (a[1][i] != gamer){
                result2 = false;
            }
            if (a[2][i] != gamer){
                result3 = false;
            }
            if (a[i][0] != gamer){
                result4 = false;
            }
            if (a[i][1] != gamer){
                result5 = false;
            }
            if (a[i][2] != gamer){
                result6 = false;
            }
            if (a[i][i] != gamer){
                result7 = false;
            }
            if (a[i][a[i].length - 1 - i] != gamer){
                result8 = false;
            }
        }
        if (!result1 && !result2 && !result3 && !result4 && !result5 && !result6 && !result7 && !result8){
            return false;
        }else {
            return true;
        }
    }

    public static void playerStep(char[][] a){
        int x;
        int y;
        do {
            System.out.println("Enter your coordinates X and Y:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
            if ((!isValidStep(y, x, map)) || (a[y][x] != '_')){
                System.out.println("Coordinates outside the map!");
            };
        }while ((!isValidStep(y, x, map)) || (a[y][x] != '_'));
        a[y][x] = player;
    }

    public static boolean compStep(char[][] a) {
        int x;
        int y;
        boolean step = false;
        do {
            if ((a[0][0] == 'X') && (a[0][1] == 'X') || (a[0][1] == 'X') && (a[0][2] == 'X') || (a[0][0] == 'X') && (a[0][2] == 'X')) {
                for (int i = 0; i < a.length; i++) {
                    if (a[0][i] == '_') {
                        a[0][i] = comp;
                        step = true;
                        return true;
                    }
                }
            }
            if ((a[1][0] == 'X') && (a[1][1] == 'X') || (a[1][1] == 'X') && (a[1][2] == 'X') || (a[1][0] == 'X') && (a[1][2] == 'X')) {
                    for (int i = 0; i < a.length; i++) {
                        if (a[1][i] == '_') {
                            a[1][i] = comp;
                            step = true;
                            return true;
                        }
                    }
                }
            if ((a[2][0] == 'X') && (a[2][1] == 'X') || (a[2][1] == 'X') && (a[2][2] == 'X') || (a[2][0] == 'X') && (a[2][2] == 'X')) {
                        for (int i = 0; i < a.length; i++) {
                            if (a[2][i] == '_') {
                                a[2][i] = comp;
                                step = true;
                                return true;
                            }
                        }
                    }
            if ((a[0][0] == 'X') && (a[1][0] == 'X') || (a[1][0] == 'X') && (a[2][0] == 'X') || (a[0][0] == 'X') && (a[2][0] == 'X')) {
                            for (int i = 0; i < a.length; i++) {
                                if (a[i][0] == '_') {
                                    a[i][0] = comp;
                                    step = true;
                                    return true;
                                }
                            }
                        }
            if ((a[0][1] == 'X') && (a[1][1] == 'X') || (a[1][1] == 'X') && (a[2][1] == 'X') || (a[0][1] == 'X') && (a[2][1] == 'X')) {
                                for (int i = 0; i < a.length; i++) {
                                    if (a[i][1] == '_') {
                                        a[i][1] = comp;
                                        step = true;
                                        return true;
                                    }
                                }
                            }
            if ((a[0][2] == 'X') && (a[1][2] == 'X') || (a[1][2] == 'X') && (a[2][2] == 'X') || (a[0][2] == 'X') && (a[2][2] == 'X')) {
                                    for (int i = 0; i < a.length; i++) {
                                        if (a[i][2] == '_') {
                                            a[i][2] = comp;
                                            step = true;
                                            return true;
                                        }
                                    }
                                }
            if ((a[0][0] == 'X') && (a[1][1] == 'X') || (a[1][1] == 'X') && (a[2][2] == 'X') || (a[0][0] == 'X') && (a[2][2] == 'X')) {
                                        for (int i = 0; i < a.length; i++) {
                                            if (a[i][i] == '_') {
                                                a[i][i] = comp;
                                                step = true;
                                                return true;
                                            }
                                        }
                                    }
            if ((a[2][0] == 'X') && (a[1][1] == 'X') || (a[1][1] == 'X') && (a[0][2] == 'X') || (a[2][0] == 'X') && (a[0][2] == 'X')) {
                                            for (int i = 0; i < a.length; i++) {
                                                if (a[i][a.length - 1 - i] == '_') {
                                                    a[i][a.length - 1 - i] = comp;
                                                    step = true;
                                                    return true;
                                                }
                                            }
                                        }

            if ((a[0][0] == '0') && (a[0][1] == '0') || (a[0][1] == '0') && (a[0][2] == '0') || (a[0][0] == '0') && (a[0][2] == '0')) {
                for (int i = 0; i < a.length; i++) {
                    if (a[0][i] == '_') {
                        a[0][i] = comp;
                        step = true;
                        return true;
                    }
                }
            }
            if ((a[1][0] == '0') && (a[1][1] == '0') || (a[1][1] == '0') && (a[1][2] == '0') || (a[1][0] == '0') && (a[1][2] == '0')) {
                for (int i = 0; i < a.length; i++) {
                    if (a[1][i] == '_') {
                        a[1][i] = comp;
                        step = true;
                        return true;
                    }
                }
            }
            if ((a[2][0] == '0') && (a[2][1] == '0') || (a[2][1] == '0') && (a[2][2] == '0') || (a[2][0] == '0') && (a[2][2] == '0')) {
                for (int i = 0; i < a.length; i++) {
                    if (a[2][i] == '_') {
                        a[2][i] = comp;
                        step = true;
                        return true;
                    }
                }
            }
            if ((a[0][0] == '0') && (a[1][0] == '0') || (a[1][0] == '0') && (a[2][0] == '0') || (a[0][0] == '0') && (a[2][0] == '0')) {
                for (int i = 0; i < a.length; i++) {
                    if (a[i][0] == '_') {
                        a[i][0] = comp;
                        step = true;
                        return true;
                    }
                }
            }
            if ((a[0][1] == '0') && (a[1][1] == '0') || (a[1][1] == '0') && (a[2][1] == '0') || (a[0][1] == '0') && (a[2][1] == '0')) {
                for (int i = 0; i < a.length; i++) {
                    if (a[i][1] == '_') {
                        a[i][1] = comp;
                        step = true;
                        return true;
                    }
                }
            }
            if ((a[0][2] == '0') && (a[1][2] == '0') || (a[1][2] == '0') && (a[2][2] == '0') || (a[0][2] == '0') && (a[2][2] == '0')) {
                for (int i = 0; i < a.length; i++) {
                    if (a[i][2] == '_') {
                        a[i][2] = comp;
                        step = true;
                        return true;
                    }
                }
            }
            if ((a[0][0] == '0') && (a[1][1] == '0') || (a[1][1] == '0') && (a[2][2] == '0') || (a[0][0] == '0') && (a[2][2] == '0')) {
                for (int i = 0; i < a.length; i++) {
                    if (a[i][i] == '_') {
                        a[i][i] = comp;
                        step = true;
                        return true;
                    }
                }
            }
            if ((a[2][0] == '0') && (a[1][1] == '0') || (a[1][1] == '0') && (a[0][2] == '0') || (a[2][0] == '0') && (a[0][2] == '0')) {
                for (int i = 0; i < a.length; i++) {
                    if (a[i][a.length - 1 - i] == '_') {
                        a[i][a.length - 1 - i] = comp;
                        step = true;
                        return true;
                    }
                }
            }
            if (step == false){
                do {
                    x = random.nextInt(a.length);
                    y = random.nextInt(a.length);
                } while (a[x][y] != '_');
                a[x][y] = comp;
                step = true;
                return true;
            }
        }while (step == false);
        return true;
    }
}
