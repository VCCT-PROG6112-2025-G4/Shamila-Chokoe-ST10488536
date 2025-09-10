/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_ Shamila Chokoe ST10488536
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import prog6112.SeriesApplication;
import prog6112.SeriesApplication;
import prog6112.DisplayMenu;
public class Test {
    
    public class SeriesApplicationTest {
        private SeriesApplication seriesApp;
        
   @BeforeEach 
   
   public void setUP() {
      SeriesApplication seriesApplication = new SeriesApplication();
      
    /*Reference: Mehod sourced from rok and chatgpt(2025)
      ChatPT and grok were ask to pulish a unit test 

   */
        
        seriesApp.getSeriesList().add(new Series(1, "Series1", 13, 10));
        seriesApp.getSeriesList().add(new Series(2, "Series2", 16, 15));
    }

    @Test
    public void testSearchSeries() {
        // Purpose: To supply the series id to the search method. The test series data has been returned.
        // Expected Outcome: The correct series will be found.
        SeriesApplication result = seriesApp.SearchSeries(1);
        assertNotNull(result, "Series should be found");
        assertEquals(1, result.getSeriesID(), "Series ID should match");
        assertEquals("Series1", result.getSeriesName(), "Series name should match");

        result = seriesApp.SearchSeries(3); // Non-existent ID
        assertNull(result, "Non-existent series should return null");
    }

    @Test
    public void testUpdateSeries() {
        // Purpose: To supply the series id to the update method. The test will determine if the update series method was found.
        // Expected Outcome: The test will determine the update series.
        boolean updated = seriesApp.UpdateSeries(1, "UpdatedSeries1", 15, 12);
        assertTrue(updated, "Series should be updated successfully");
        SeriesApplication result = seriesApp.searchSeries(1);
        assertEquals("UpdatedSeries1", result.getSeriesName(), "Series name should be updated");
        assertEquals(15, result.getAgeRestriction(), "Age restriction should be updated");
        assertEquals(12, result.getNumberOfEpisodes(), "Number of episodes should be updated");

        updated = seriesApp.UpdateSeries(3, "NewSeries", 18, 10); // Non-existent ID
        assertFalse(updated, "Update should fail for non-existent series");
    }

    @Test
    public void testDeleteSeries() {
        // Purpose: To supply the series id to the delete method. The test will determine if the delete series method has been successfully updated.
        // Expected Outcome: The test will successfully delete the series.
        boolean deleted = seriesApp.DeleteSeries(1);
        assertTrue(deleted, "Series should be deleted successfully");
        assertNull(seriesApp.searchSeries(1), "Deleted series should not be found");

        deleted = seriesApp.DeleteSeries(3); // Non-existent ID
        assertFalse(deleted, "Delete should fail for non-existent series");
    }

    @Test
    public void testSeriesAgeRestriction() {
        // Purpose: To supply a series id to determine if the series has an age restriction method.
        // Expected Outcome: The test will determine if the series age restriction method is valid.
        int ageRestriction = seriesApp.getAgeRestriction(1);
        assertTrue(ageRestriction >= 0, "Age restriction should be valid");
        assertEquals(13, ageRestriction, "Age restriction should match");

        seriesApp.setAgeRestriction(1, 18);
        assertEquals(18, seriesApp.getAgeRestriction(1), "Age restriction should be updated");

        ageRestriction = seriesApp.getAgeRestriction(3); // Non-existent ID
        assertEquals(-1, ageRestriction, "Invalid ID should return -1");
    }

    @Test
    public void testSeriesAgeRestriction_Invalid() {
        // Purpose: To supply an invalid series id to determine if the series has an invalid age restriction method.
        // Expected Outcome: The test will determine that the series age restriction is invalid.
        int ageRestriction = seriesApp.getAgeRestriction(3); // Non-existent ID
        assertEquals(-1, ageRestriction, "Invalid ID should return -1");

        // Test with an invalid age restriction (negative value)
        seriesApp.getSeriesList().get(0).setAgeRestriction(-5); // Force invalid age
        assertTrue(seriesApp.getAgeRestriction(1) < 0, "Negative age restriction should be invalid");
    }

        private void assertNotNull(SeriesApplication result, String series_should_be_found) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void assertEquals(int i, String seriesID, String series_ID_should_match) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void assertEquals(String series1, String seriesName, String series_name_should_match) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void assertNull(SeriesApplication result, String nonexistent_series_should_return_null) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void assertTrue(boolean updated, String series_should_be_updated_successfully) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void assertEquals(int i, int ageRestriction, String age_restriction_should_be_updated) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void assertFalse(boolean deleted, String delete_should_fail_for_nonexistent_series) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    }
    
    
    
    
    
    

