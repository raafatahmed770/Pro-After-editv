//قسمة عددين 

package javaapplication4;
import java.util.Scanner;
public class JavaApplication4 
  {
      public static void repeat(int s){
                                     Scanner input = new Scanner(System.in);
                                       if(s==5){
                                                    System.out.println("if you want Exit press :yes or y or 1 ");
                                                    String again = input.next();
                                                if ("Yes".equals(again)||"yes".equals(again)||"y".equals(again)||"Y".equals(again)||"1".equals(again) ||"YES".equals(again))
                                                   System.exit(0); 
                                                           
                                                }
                                   }
  public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String again;
        do{  double num1=1 , num2=1 ;
            
             System.out.print("Enter Numenator = ");
   int b=1;
            while(!input.hasNextDouble())
                                        {
                                           repeat(b);
                                          System.out.print("Enter a Number ! \n Enter Numenerator =  ");
                                            input.next();
                                              b++;
                                        }
                                         num1=input.nextDouble();     
                                               
                   do{
                             System.out.print("Enter Denominator expect Zero = ");
                                while(!input.hasNextDouble())
                                        {
                                           repeat(b);
                                          System.out.print("Enter a Number ! \n Enter Denominator expect Zero =  ");
                                            input.next();
                                              b++;
                                        }
                                         num2=input.nextDouble(); 
                              
                      }while(num2 == 0);
                 double r=num1/num2;
                   System.out.println("THE Result = "+ r);
            
                   System.out.println("if you want calculate again  press :yes or y or 1");
                   again = input.next();
            }while ("Yes".equals(again)||"yes".equals(again)||"y".equals(again)||"Y".equals(again)||"1".equals(again) ||"YES".equals(again));
                System.out.println("Thanks For Using Our Program ..Users Team ..");
     }
   }
