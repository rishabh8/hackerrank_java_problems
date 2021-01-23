package com;

import java.security.MessageDigest;
import java.util.Scanner;

public class Java_SH2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.reset();
            md.update(sc.nextLine().getBytes());
            for(byte i : md.digest()) {
                System.out.print(String.format("%02x", i));
            }
            System.out.println();
        }
        catch(Exception ex) {
        }
    }
}
