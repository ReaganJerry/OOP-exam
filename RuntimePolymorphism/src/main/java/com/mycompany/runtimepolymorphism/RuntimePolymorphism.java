/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.runtimepolymorphism;

/**
 *
 * @author Admin
 */
// Base class
class TaxCategory {
    public double calculateVAT(double amount) {
        return 0.0; // Default implementation
    }
}

// Subclass for Retailer
class Retailer extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.18;
    }
}

// Subclass for Wholesaler
class Wholesaler extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.15;
    }
}

// Subclass for Importer
class Importer extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.10;
    }
}

// Main class to demonstrate runtime polymorphism
public class EFRISDemo {
    public static void main(String[] args) {
        // Create an array of TaxCategory references
        TaxCategory[] taxpayers = {
            new Retailer(),
            new Wholesaler(),
            new Importer()
        };

        // Corresponding transaction amounts
        double[] amounts = {1000.0, 2000.0, 3000.0};

        // Loop through and calculate VAT for each taxpayer
        for (int i = 0; i < taxpayers.length; i++) {
            double vat = taxpayers[i].calculateVAT(amounts[i]);
            System.out.println("VAT for transaction " + (i + 1) + ": UGX " + vat);
        }
    }
}

