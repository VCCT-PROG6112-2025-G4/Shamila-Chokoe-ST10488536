/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog6112;

import java.util.Scanner;
import prog6112.Menu;
/**
 *
 * @author Shamila Chokoe ST10488536
 */
public class DisplayMenu {
     public static void main(String[] args){
        displayMenu();
    }
    private static void displayMenu(){
        
        Menu m = new Menu();
        
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        String CaptureSeries;
        String SearchSeries; 
        String Updateseries;
        String DeleteSeries;
        
        do{
            System.out.println("-Sample Menu Screen Shot-");
            System.out.println("1. Capture Screen Shot ");
            System.out.println("2. Search for a series ");
            System.out.println("3. Update series age restriction ");
            System.out.println("4. Delete a series");
            System.out.println("5. Print series report - 2025");
            System.out.println("6. Exit Application");
            
            choice = scanner.nextInt();
            
            //Consume Line
            
            switch (choice){
                case 1:
                    m.CaptureSeries (scanner);
                case 2: 
                    m.SearchSeries(scanner);
                case 3:
                    m.UpdateSeries (scanner);
                case 4:
                    m.DeleteSeries ( scanner);
                case 5:
                    System.out.println("Existing application.");
                default :
                    System.out.println("Invalid choice. Pleasd retry.");
            }
        }while ( choice !=5);
        
            scanner.close();
        }
        
          
    }
    


