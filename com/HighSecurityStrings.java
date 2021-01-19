package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class HighSecurityStrings {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String password = bufferedReader.readLine();

        int weight_a = Integer.parseInt(bufferedReader.readLine().trim());

        int strength = Result.getStrength(password, weight_a);

        bufferedWriter.write(String.valueOf(strength));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Result {

    /*
     * Complete the 'getStrength' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING password
     *  2. INTEGER weight_a
     */

    public static int getStrength(String password, int weight_a) {
    	return 0;
    }

}
