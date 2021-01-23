package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaException {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int res = x/y;
            System.out.println( res );
        }
        catch(InputMismatchException ex){ System.out.println(ex.getClass().getName());}
        catch(ArithmeticException ex) {System.out.println(ex.getClass());}
    }
}
