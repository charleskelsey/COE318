/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *
 * @author charl
 */
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UserMain {
    public static void main(String[] args) {
        try (InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(in))
        {
            String line;
            int i = 1;
            while ((line = buffer.readLine()) != null) {
                String[] tokens = line.split("\\s");
                System.out.println(Arrays.toString(tokens));
                System.out.println(tokens[0].toUpperCase() + i + " " + tokens[1] + " " + tokens[2] + " " + tokens[3]);
                
                if (line.equals("end")) {
                    System.out.println("ALL DONE");
                    System.exit(0);
                } else if (line.equals("spice")) {
                    
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
