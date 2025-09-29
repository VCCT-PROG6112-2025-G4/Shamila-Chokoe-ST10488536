/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question1;

/**
 *
 * @author lab_services_student
 */
class CricketRunsScored {

    CricketRunsScored(String string, String string0, int nextInt) {
        throw new UnsupportedOperationException("Not supported/found."); 

    }

    void printReport() {
        throw new UnsupportedOperationException("Not supported/ found."); 

    }

    Object getBatsman() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getStadium() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    short getRunsScored() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
    // Abstract class Cricket.java
abstract class Cricket implements ICricket {
    private String batsman;
    private String stadium;
    private int runs;

    public Cricket(String batsman, String stadium, int runs) {
        this.batsman = batsman;
        this.stadium = stadium;
        this.runs = runs;
    }
   
class CricketRunsScored extends Cricket {
    public CricketRunsScored(String batsman, String stadium, int runs) throws
            IllegalArgumentException {
        super(batsman, stadium, runs);
        if (batsman == null || batsman.trim().isEmpty()) {
            throw new IllegalArgumentException("Batsman name cannot be null or"
                    + " empty.");
        }
        if (stadium == null || stadium.trim().isEmpty()) {
            throw new IllegalArgumentException("Stadium name cannot be null or"
                    + " empty.");
        }
        if (runs < 0) {
            throw new IllegalArgumentException("Runs scored cannot be negative:"
                    + " " + runs);
        }
    }

    public void printReport() throws UnsupportedOperationException {
        if (getBatsman() == null || getStadium() == null) {
            throw new UnsupportedOperationException("Report generation failed: "
                    + "Batsman or Stadium data is missing.");
        }
        System.out.println(getBatsman() + " runs scored at " + getStadium() +
                ": " + getRunsScored());
    }
 
        //@Override
        public String getBatsman() {
            throw new UnsupportedOperationException("Not supported yet.");
            
        }

        //@Override
        public String getStadium() {
            throw new UnsupportedOperationException("Not supported yet."); 

        }

        //@Override
        public int getRunsScored() {
            throw new UnsupportedOperationException("Not supported yet.");
 
        }
        
    } 
}