package Lesson6;

import java.io.*;
import java.util.Scanner;

public class Lesson6{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        try (FileInputStream fis = new FileInputStream("D:\\ProgramFiles\\JavaProgramms\\src\\Lesson6\\Maine_coon.txt");
             FileInputStream fin = new FileInputStream("D:\\ProgramFiles\\JavaProgramms\\src\\Lesson6\\Mops.txt");
             FileOutputStream fos = new FileOutputStream("D:\\ProgramFiles\\JavaProgramms\\src\\Lesson6\\Big.txt", true))
        {
            byte[] buffer = new byte[fis.available()];
            byte[] buffer1 = new byte[fin.available()];
            fis.read(buffer, 0, buffer.length);
            fos.write(buffer, 0, buffer.length);
            fos.write('\n');
            fos.write('\n');
            fin.read(buffer1, 0, buffer1.length);
            fos.write(buffer1, 0, buffer1.length);
            fis.close();
            fin.close();
            fos.flush();
            fos.close();
        } catch (IOException exception){
            System.err.println(exception.getMessage());
        }

        System.out.println("Enter word for search: ");
        String word1 = scanner.nextLine();
        BufferedReader br;
        String line = " ";
        boolean found = false;
        try
        {
            br = new BufferedReader(new FileReader("D:\\ProgramFiles\\JavaProgramms\\src\\Lesson6\\Maine_coon.txt"));
            try {
                while ((line = br.readLine()) != null){
                    String[] words = line.split(" ");
                    for (String word : words){
                        if (word.equals(word1)){
                            System.out.println("Word exists in file!");
                            found = true;
                            break;
                        }
                    }
                    if(found == false){
                        System.out.println("Word don't exists in file!");
                    }
                    br.close();
                }
            }catch (IOException exception) {
                System.err.println(exception.getMessage());
            }
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
