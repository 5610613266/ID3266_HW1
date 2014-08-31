/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;

public class ID3266_HW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        Scanner scan = new Scanner(System.in);
        
        int[] IncomeRange = new int[4];
        int[] TaxRate = new int[4];        
        int i;
        int j;        
        double q = 0;        
        double sum = 0;
        
        for(i = 0 , j = 1 ; i < 4 ; i++ , j++){
            System.out.print("Please enter income and  tax rate  in tax bracket " + j);
            System.out.print(" : ");
            IncomeRange[i] = scan.nextInt();
            TaxRate[i] = scan.nextInt();            
        }
            System.out.print("Please enter tax rate if income > " + IncomeRange[3]);
            System.out.print(" : ");
            int MaxTaxRate = scan.nextInt(); 
            
            System.out.print("Please enter income : ");
            int Income = scan.nextInt();
            
            for(i = 0 ; i <= 4 ; i++){
            int lowerBound = 0; 
            if(i > 0){
                lowerBound = IncomeRange[i-1];
            }
            int upperBound = Income; 
            if (i < 4 && Income > IncomeRange[i]) {
                upperBound = IncomeRange[i]; 
            }

            double q1;
            if (i >= 4) {
                q1 = MaxTaxRate / 100.00; 
            } else {
                q1 = TaxRate[i] / 100.00; 
            }
            q = (upperBound - lowerBound) * q1; 
            if (lowerBound > 0) {
                System.out.print((lowerBound + 1) + " - " + upperBound); 
            } else {
                System.out.print(lowerBound + " - " + upperBound); 
            }
            System.out.print(" you pay ");
            if (q > 0) { 
                System.out.print("" +(upperBound - lowerBound));
                System.out.print(" x ");
                System.out.printf("%.2f" ,q1);
                System.out.print(" = ");
            }
            System.out.printf("%.0f" ,q);
            System.out.println(" baht");
            sum += q; 

            if (Income <= upperBound) { 
                break;
            }
        }

       System.out.printf("Total Tax : %.0f" ,sum);
       System.out.print(" baht");
           
            
            
            
         
        
    }
    
}
