/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question1;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;
import java.util.Arrays;
public class main {
   
        Scanner scanner = new Scanner (System.in);

public class RunApplication {
    private static final String[] BATSMEN = {"Jacques Kallis", "Hashim Amla", "AB de Villiers"};
    private static final String[] STADIUMS = {"KINGSMEAD", "ST GEORGES", "WANDERERS"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CricketRunsScored[][] scores = new CricketRunsScored[3][3];

        // Input runs
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter runs for " + BATSMEN[i] + " at " + STADIUMS[j] + ": ");
                scores[i][j] = new CricketRunsScored(BATSMEN[i], STADIUMS[j], scanner.nextInt());
            }
        }

        // Print report
        System.out.println("\nRUNS SCORED REPORT");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j].printReport();
            }
        }

        // Calculate and print totals
        System.out.println("\nTOTAL RUNS AT STADIUMS");
        int[] totals = new int[3];
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                totals[j] += scores[i][j].getRunsScored();
            }
            System.out.println(STADIUMS[j] + "\t" + totals[j]);
        }

        // Find and print stadium with most runs
        int maxRuns = totals[0], maxIndex = 0;
        for (int j = 1; j < 3; j++) {
            if (totals[j] > maxRuns) {
                maxRuns = totals[j];
                maxIndex = j;
            }
        }
        System.out.println("\nSTADIUM WITH THE MOST RUNS : " + STADIUMS[maxIndex]);

        scanner.close();
    }
}

}
