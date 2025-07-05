/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.two.c;

/**
 *
 * @author Admin
 */
public class TwoC {
String input = "aNiMaLs";
String title = "Animals";

// Method 1: equalsIgnoreCase()
if (input.equalsIgnoreCase(title)) {
    System.out.println("Match found!");
}

// Method 2: toLowerCase()
if (input.toLowerCase().equals(title.toLowerCase())) {
    System.out.println("Match found!");
}
    
