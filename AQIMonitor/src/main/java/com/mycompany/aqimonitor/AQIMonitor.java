/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aqimonitor;

/**
 *
 * @author Admin
 */
public class AQIMonitor {
    public static void main(String[] args) {
        int[] aqiReadings = new int[30];
        Random rand = new Random();
        int hazardousDays = 0;

        // Generate random AQI readings and count hazardous days
        for (int i = 0; i < aqiReadings.length; i++) {
            aqiReadings[i] = rand.nextInt(300) + 1; // AQI between 1 and 300
            if (aqiReadings[i] > 200) {
                hazardousDays++;
            }
        }

        // Sort the readings to calculate the median
        Arrays.sort(aqiReadings);

        double median;
        int mid = aqiReadings.length / 2;
        if (aqiReadings.length % 2 == 0) {
            median = (aqiReadings[mid - 1] + aqiReadings[mid]) / 2.0;
        } else {
            median = aqiReadings[mid];
        }

        // Output results
        System.out.println("AQI Readings for 30 Days:");
        System.out.println(Arrays.toString(aqiReadings));
        System.out.println("Median AQI: " + median);
        System.out.println("Number of Hazardous Days (AQI > 200): " + hazardousDays);
    }
}

