/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Question1;

/**
 *
 * @author lab_services_student
 */
interface ICricket {
    
    String getBatsman();
    String getStadium();
    int getRunsScored();
}
abstract class Cricket {
    private String batsman;
    private String stadium;
    private int runs;

    public Cricket(String batsman, String stadium, int runs) {
        this.batsman = batsman;
        this.stadium = stadium;
        this.runs = runs;
    }

    public String getBatsman(){
    return batsman; }
    public String getStadium(){
     return stadium; }
    public int getRunsScored(){
        return runs; }
}