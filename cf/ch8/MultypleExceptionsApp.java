package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultypleExceptionsApp {

    public static void main(String[] args) {
        File file = new File("C:/tmp/random.txt");

        try (Scanner in = new Scanner(file)) {
            int ch = System.in.read();
            int num = in.nextInt();
        }catch (FileNotFoundException e1) {
            e1.printStackTrace();
            System.err.println("Error. File not found");
        } catch (IOException e2) {
            e2.printStackTrace();
            System.err.println("Error, IO error");
        }catch (InputMismatchException e3) {
            e3.printStackTrace();
            System.out.println("Error. Input Mismatch Exception error");
        } catch (Exception e4) {
            e4.printStackTrace();
            System.out.println("Error. Generic Exception error");
        }
    }
}
