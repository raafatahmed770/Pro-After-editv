package pro4;
import java.util.Scanner;
public class Pro4 {
        public static void enter_elements(double arr [] [],double r,double c)
{
    Scanner input=new Scanner(System.in);
    for ( int i = 0; i < r; i++)
    {
        for (int  j = 0; j < c; j++)
        {
            int z=i+1;
           int y=j+1;
          System.out.print(" element["+z+"]["+y+"] :: ");
                    while(!input.hasNextDouble())
                          {
                                 System.out.println("Enter a Number !");
                                 System.out.print(" element["+z+"]["+y+"] :: ");
                                 input.next();
                          }
            arr[i][j] = input.nextDouble();
        }
    }
}
      public static void sum_and_print(double arr [][],double arrr[][],int r,int c)
{
    double sum[][]=new double [r][c];
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
           
            sum[i][j] = arr[i][j] + arrr[i][j];
        }
    }
    System.out.println("Sum = ");
    for (int i = 0; i < r; i++)
    {
        for (int j = 0; j < c; j++)
        {
            System.out.print(sum[i][j]+"\t" );
        }
        System.out.println("          ");
    }
}
        public static void main(String[] args) {
                    Scanner input=new Scanner(System.in);
                int k , coloum=1 ,roww=1;    
  do{                 
         System.out.println("' becouse sum two matrixes you should enter \n the same size of rows and coloums of them \n  so you must enter the size once \n *******************************************");
            do{  
                System.out.println("Enter a Number Positive integer !");
                System.out.print("enter size of row :: ");
                 
                 while(!input.hasNextInt())
                        {
                               System.out.println("Enter a Number Positive integer !");
                               System.out.print("enter size of row :: ");
                               input.next();
                        }
                    roww=input.nextInt();
                System.out.println("*******************************************");        
              }while(roww <=0);       
               
                
                do{  
                        System.out.println("Enter a Number Positive integer !");
                        System.out.print("enter  the size of coloum :: ");
                                while(!input.hasNextInt())
                                    {
                                           System.out.println("Enter a Number Positive integer!");
                                           System.out.print("enter the size of coloum :: ");
                                           input.next();

                                    }   
                   coloum=input.nextInt();
             System.out.println("*******************************************");      
                    }while(coloum <=0);
                        double matrix[][]=new double[roww][coloum];
                       double matrix2[][]=new double[roww][coloum];
                   System.out.println("*******************************************");
                System.out.println("enter elements of matrix 1 ");
                        enter_elements(matrix,roww,coloum);
                     System.out.println("*******************************************");    
                System.out.println("enter elements of matrix 2");
                        enter_elements(matrix2,roww,coloum);
                     System.out.println("*******************************************");    
                sum_and_print(matrix,matrix2,roww,coloum);
             System.out.println("*******************************************");  
          System.out.println("**** Entre 1 to Countine or any num. to Exit *****");       
   while(!input.hasNextDouble())
                          {                        
                              System.out.println("Enter a Number !");  
                              System.out.print("Enter again = "); 
                              input.next();
                          }
          k=input.nextInt();
  }while(k==1);
  System.out.println("Thanks For Using Our Program ..Users Team ..");
    }
}
