
package practice2;

import java.util.Scanner;
public class Prime_number {
    public static void main(String[]args){
        System.out.print("Enter a positive integer:");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int i, count=0;
        for(i=2;i<n;i++){
            if(n % i == 0){
                count++;
                break;
            }
        }
         if(count==0)
             System.out.print(n+" is a prime number.");
         else
             System.out.print(n+" is not a prime number");
            
            
        
    }
    
}
