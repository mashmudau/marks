
import java.util.*;
import java.util.Scanner;

public class marks {
    public static void main(String args []){
        Scanner scann = new Scanner(System.in);

        System.out.println("ENTER LEANERS MARKS");
        Double marks = scann.nextDouble();

        if (marks >= 80){
            System.out.println("Outstanding achievement");

        }
        else if (marks >= 70 && marks <= 79){

            System.out.println("Meritorious achievement");  
        }
        else if (marks >= 60 && marks <= 69){
            
            System.out.println("Substantial achievement");  
        }
        else if (marks >= 50 && marks <= 59){
            
            System.out.println("Moderate achievement");  
        }
        else if (marks >= 40 && marks <= 49){
            
            System.out.println("Adequate achievement");  
        }
        else if (marks >= 30 && marks <= 39){
            
            System.out.println("Elementary achievement");  
        }
        else if (marks >= 0 && marks <= 29){
            
            System.out.println("Not achieved-fail");  
        }
        else {
            
            System.out.println("Error when entering marks");  
        }
        
    }
}