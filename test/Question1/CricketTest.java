/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Question1;

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
public class CricketTest {
    
    public CricketTest() {
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
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    void testPrintReport() {
        // Test case for valid input
        CricketRunsScored cricket = new CricketRunsScored("Jacques Kallis", "KINGSMEAD", 5000);
        // Redirect System.out to capture the output
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));
        cricket.printReport();
        String expectedOutput = "Jacques Kallis runs scored at KINGSMEAD: 5000" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
    @Test
    void testConstructorValidInput() {
        // Test case for valid input
        CricketRunsScored cricket = new CricketRunsScored("Hashim Amla", "ST GEORGES", 3700);
        
    }
    @Test
    void testConstructorInvalidNegativeRuns() {
        // Test case for invalid input (negative runs)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new CricketRunsScored("AB de Villiers", "WANDERERS", -500);
        });
        assertEquals("Runs scored cannot be negative: -500", exception.getMessage());
    }
    @Test
    void testConstructorInvalidNullBatsman() {
        // Test case for invalid input (null batsman)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new CricketRunsScored(null, "KINGSMEAD", 5000);
        });
        assertEquals("Batsman name cannot be null or empty.", exception.getMessage());
    }
    @Test
    void testConstructorInvalidEmptyStadium() {
        // Test case for invalid input (empty stadium)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new CricketRunsScored("Jacques Kallis", "", 5000);
        });
        assertEquals("Stadium name cannot be null or empty.", exception.getMessage());
    }
}
