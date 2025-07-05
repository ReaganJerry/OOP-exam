/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ugandawordcounter;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class UgandaWordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a book description:");
        String description = scanner.nextLine();

        // Split the description into words
        String[] words = description.split("\\s+");

        int count = 0;

        // Count occurrences of "Uganda" (case-insensitive)
        for (String word : words) {
            if (word.equalsIgnoreCase("Uganda")) {
                count++;
            }
        }

        // Display the result
        System.out.println("The word 'Uganda' appears " + count + " time(s).");
    }
}