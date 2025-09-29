/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class Question2JUnitTest {
    
    public Question2JUnitTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    void testInputRuns() {
        
        int[][] expectedRuns = {
            {5000, 3500, 6200}, // Jacques Kallis
            {3800, 3700, 5000}, // Hashim Amla
            {4200, 3900, 5200}  // AB de Villiers
         
        }
                }

           
        String expectedOutput = "RUNS SCORED REPORT" + System.lineSeparator() +
                "Jacques Kallis at Kingsmead: 5000" + System.lineSeparator() +
                "Jacques Kallis at St Georges: 3500" + System.lineSeparator() +
                "Jacques Kallis at Wanderers: 6200" + System.lineSeparator() +
                "Jacques Kallis Total Runs: 14700" + System.lineSeparator() +
                System.lineSeparator() +
                "Hashim Amla at Kingsmead: 3800" + System.lineSeparator() +
                "Hashim Amla at St Georges: 3700" + System.lineSeparator() +
                "Hashim Amla at Wanderers: 5000" + System.lineSeparator() +
                "Hashim Amla Total Runs: 12500" + System.lineSeparator() +
                System.lineSeparator() +
                "AB de Villiers at Kingsmead: 4200" + System.lineSeparator() +
                "AB de Villiers at St Georges: 3900" + System.lineSeparator() +
                "AB de Villiers at Wanderers: 5200" + System.lineSeparator() +
                "AB de Villiers Total Runs: 13300" + System.lineSeparator();
       
    }  

 @Test
    void testDisplayHighestRunsPerStadium() {
        RunReport.inputRuns();
        RunReport.displayHighestRunsPerStadium();
        String expectedOutput = "\nHIGHEST RUNS SCORED PER STADIUM" + System.lineSeparator() +
                "Kingsmead: 13000" + System.lineSeparator() +
                "St Georges: 11100" + System.lineSeparator() +
                "Wanderers: 16400" + System.lineSeparator() +
                "Stadium with the most runs scored: Wanderers (16400 runs)" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}   
}
