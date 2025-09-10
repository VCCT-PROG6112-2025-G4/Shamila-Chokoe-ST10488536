/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog6112;

/**
 *
 * @author lab_services_student Shamila Chokoe ST105488536
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import prog6112.SeriesApplication;
import prog6112.DisplayMenu;
//
//
//public class Menu {
//    
//    Scanner scanner =new Scanner( System.in);
//   
//    
//    
//    

public class Menu {

    private ArrayList<SeriesApplication> seriesList;
    {
        this.seriesList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
   }
    
    public void display () {
        Scanner scanner = new Scanner(System.in);
        int choice;
      while (true){
         DisplayMenu();
         
          choice = scanner.nextInt();
       
      }
     
       }
      
    //Loops and if statements 
     public void CaptureSeries(Scanner s) {
        System.out.println("Enter the seriesID: ");
        String ID= s.nextLine().trim();
        
        System.out.println("Enter the series name: ");
        String name = s.nextLine();
        int age;
        while (true) {
            System.out.println("Enter the series age restrictions ");
            age = s.nextInt();
            s.nextLine();
            // the users new Line 
            if (age >= 2 && age <= 18) {
                break;
            }
            System.out.println("You have entered an inncorrect series age!! Please re-enter");

        }

        System.out.println("Enter the number of episodes ");
        int episodes = s.nextInt();
        s.nextLine();
        //the users new line 
        seriesList.add(new SeriesApplication(name, episodes, age, ID));
        System.out.println("Series details have been successfully saved.");
    }

    public void SearchSeries(Scanner s) {
        System.out.println("Enter the series id to searh:");
        String ID = s.nextLine();
        boolean found = false;
        for (SeriesApplication scanner : seriesList)
        if (scanner.getSeriesID(). equals(ID)){
            System.out.println(s);
            found = true;
            break;
           }
        
       if (!found)
            System.out.println("Series with Series ID: " +ID+ " was not found!");   
    }
    

    void UpdateSeries(Scanner scanner) {
        System.out.println("Enter the series id to update: ");
        String ID= scanner.nextLine();
        for(SeriesApplication s : seriesList)
            if(s.getSeriesID().equals(ID)){
                System.out.println("Enetrthe series name: ");
                s.setSeriesName(scanner.nextLine());
                //age loop 
                int age;
                while (true){
                    System.out.println("Enter the restriction of age: ");
                    age= scanner.nextInt();
                    
                    if (age >=2 && age <=18){
                        SeriesApplication.getAgeRestriction(age);
                        
                       break;
                    }
                    System.out.println("You have typed the wrong series age! (either under/over age) ");
                }
                System.out.println("Enter the number of episodes: ");
                s.getNumberOfEpisodes();
                scanner.nextLine();
                
                System.out.println("Series has been updated successfully");
                return;
            }
        
    }

    @SuppressWarnings("empty-statement")
    void DeleteSeries(Scanner scanner) {
        System.out.println("Enter the seriesw ID to delete: ");
        String ID = scanner.nextLine();
        for(int i = 0; i <seriesList.size(); i++);
        int i = 0;
        if (seriesList.get(i).getSeriesID().equals(ID)){
            System.out.println("Are you certain that you want to delete" +ID+ "from the memory");
            String confirm = scanner.nextLine();
            if (confirm.equalsIgnoreCase("y")){
                seriesList.remove(i);
                System.out.println("Series with Series ID" +ID+ "WAS delete!!!");
            } else {
            }
            return;
    }
        System.out.println("Series including SeriesID: " +ID+ "cannot be found");
    /**
     *
     */

    /**
     *
     */
    //public void DisplayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    void printReport (){
        if(seriesList.isEmpty()){
            System.out.println("No series data available");
        }
        else{
            for (Iterator<SeriesApplication> it = seriesList.iterator(); it.hasNext();) {
                SeriesApplication s = it.next();
                System.out.println(s);
            }
        }
    }

    private void DisplayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
 
        }
    


