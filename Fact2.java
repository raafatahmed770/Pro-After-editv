package fact2;
import java.util.Scanner;
import java.math.BigInteger;
public class Fact2{
 public static void repeat(int s){
           Scanner input = new Scanner(System.in);
        if(s>=5){
                    System.out.print("** press 0 to Exit or any number to continue*** \n Entre :: ");
                    while(!input.hasNextDouble())
                          {                        
                              System.out.println("Enter a Number !");  
                              System.out.print("Enter again = "); 
                              input.next();
                          }
            int y=input.nextInt();
             if(y==0)
                 System.exit(0);
             
         }
     }
    static BigInteger fact(int N)
    {  // Initialize result 
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE 
  
        // Multiply f with 2, 3, ...N 
        for (int i = 2; i <= N; i++) 
            f = f.multiply(BigInteger.valueOf(i)); 
  
        return f;
    }

    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int x;
        int z;
        String c;
    do{
       int b=1,i=1;
       int number;
              do{  
                     repeat(b);
                     System.out.print("Enter a Number Positive integer ! \n enter integer number ::");
                   while(!input.hasNextInt())
                        { 
                            repeat(b);
                            System.out.print("Enter a Number Positive integer ! \n enter integer number :: ");
                            input.next();
                            b++;
                        }
                    number=input.nextInt();       
                  b++;   
               }while(number < 0);       
            BigInteger r=fact(number);
                System.out.println(number+"! = "+ r); 
                 System.out.println("if you want details press :yes or y or 1");
     c =  input.next();
     if("YES".equals(c)||"yes".equals(c)||"y".equals(c)||"Y".equals(c)||"1".equals(c)){
       System.out.print(number+"!=");
       for(z=1;z <=number;z++)     
           {
             if(z<number)
                System.out.print(z+"*");
               else
                System.out.print(z);

           }
     } System.out.println("");
                System.out.println("**** Entre 1 to To calculate another number or any number to Exit *****");       
           //b=0;
               // repeat(b);
           while(!input.hasNextDouble())
                          {   
                             
                               
                              System.out.println("Enter a Number !");  
                              System.out.print("Enter again = "); 
                              input.next();
                     //     b++;
                          }
                
          x=input.nextInt();
        }while(x==1);
    System.out.println("****Thanks***");
    }
    
}
    

