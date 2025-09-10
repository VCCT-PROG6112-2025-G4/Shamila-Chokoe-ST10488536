/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog6112;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;


public class SeriesApplication {

    static void getAgeRestriction(int age) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        String SeriesName; 
        int numberOfEpisodes; 
        int ageRestriction;
        String seriesID;
        
        public SeriesApplication(String name, int numberOfEpisodes , int ageRestrictions,
                String seriesID){
             SeriesName = SeriesName ;
             numberOfEpisodes = numberOfEpisodes;
             ageRestriction = ageRestriction;
             seriesID = seriesID;
             
    }

    public SeriesApplication() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public SeriesApplication() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        //method
        public String getSeriesID (){
            return seriesID ;
        }
        public String getSeriesName () {
            return SeriesName ;
        }
        public int getAgeRestriction (){
            return ageRestriction ;
        }    
        public int getNumberOfEpisodes (){
            return numberOfEpisodes;
        }
        public void setSeriesName ( String SeriesName){
            this.SeriesName = SeriesName;
        }       
        public void setAgeRestriction (int ageRestriction){
            this.ageRestriction = ageRestriction;
        }        
        public void numberOfEpisodes ( int numberOfEpisodes){
            this.numberOfEpisodes = numberOfEpisodes;
        }      
        
        
    
  /*
    Overidden toString()
    */    
   @Override
     public String toString(){
        String SeriesName = null;
        String ageRestriction = null;
        String seriesID = null;
        String numberOfEpisodes = null;
        
        
        
         return "SERIES ID:" +seriesID+ "\nSERIES NAME:" +SeriesName+
                 "\nSERIES AGE RESTRICTION:"  +ageRestriction+
                 "\nSERIES NUMBER OF EPISODES:" +numberOfEpisodes ;
     }

    public SeriesApplication SearchSeries(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public SeriesApplication searchSeries(int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean updateSeries(int i, String newSeries, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet.");
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
}