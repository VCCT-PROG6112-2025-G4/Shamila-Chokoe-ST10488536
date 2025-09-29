/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question2;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;

public class main {

public class RunReport {
    private static final String[] BATSMEN = {"Jacques Kallis", "Hashim Amla", "AB de Villiers"};
    private static final String[] STADIUMS = {"Kingsmead", "St Georges", "Wanderers"};
    private static int[][] runs = new int[3][3]; // 2D array to store runs

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input runs (using the sample data as default for simplicity)
        inputRuns();

        // Generate and display the report
        generateReport();

        // Calculate and display highest runs per stadium
        displayHighestRunsPerStadium();

        scanner.close();
    }

    private static void inputRuns() {
        // Sample data from the table
        runs[0][0] = 5000;
        // Jacques Kallis at Kingsmead
        runs[0][1] = 3500;
        // Jacques Kallis at St Georges
        runs[0][2] = 6200;
        // Jacques Kallis at Wanderers
        runs[1][0] = 3800;
        // Hashim Amla at Kingsmead
        runs[1][1] = 3700;
        // Hashim Amla at St Georges
        runs[1][2] = 5000; 
// Hashim Amla at Wanderers
        runs[2][0] = 4200;
        // AB de Villiers at Kingsmead
        runs[2][1] = 3900;
        // AB de Villiers at St Georges
        runs[2][2] = 5200; 
// AB de Villiers at Wanderers
    }

    private static void generateReport() {
        System.out.println("RUNS SCORED REPORT");
        for (int i = 0; i < 3; i++) {
            int totalRuns = 0;
            for (int j = 0; j < 3; j++) {
                System.out.println(BATSMEN[i] + " at " + STADIUMS[j] + ": " + runs[i][j]);
                totalRuns += runs[i][j];
            }
            System.out.println(BATSMEN[i] + " Total Runs: " + totalRuns);
            System.out.println();
        }
    }

    private static void displayHighestRunsPerStadium() {
        System.out.println("\nHIGHEST RUNS SCORED PER STADIUM");
        int[] stadiumTotals = new int[3];
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                stadiumTotals[j] += runs[i][j];
            }
        }

        int maxRuns = stadiumTotals[0];
        int maxIndex = 0;
        for (int j = 1; j < 3; j++) {
            if (stadiumTotals[j] > maxRuns) {
                maxRuns = stadiumTotals[j];
                maxIndex = j;
            }
        }

        for (int j = 0; j < 3; j++) {
            System.out.println(STADIUMS[j] + ": " + stadiumTotals[j]);
        }
        System.out.println("Stadium with the most runs scored: " + STADIUMS[maxIndex] + " (" + maxRuns + " runs)");
    }
}  
}
