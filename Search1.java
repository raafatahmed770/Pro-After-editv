package search1;
import java.util.Scanner;
public class Search1 {
    public static void repeat(int s){
           Scanner input = new Scanner(System.in);
     if(s>=5){
        System.out.println("if you want Exit  press :yes or y or 1"); 
              String again= input.next();
            while ("Yes".equalsIgnoreCase(again)||"y".equalsIgnoreCase(again)||"1".equals(again))
                    {System.exit(0);}
                }
            }
    public static void enter_elements(double arr [] [],int r,int c)
    {
            Scanner input=new Scanner(System.in);
            int b=1;
            for ( int i = 0; i < r; i++)
            {
              for (int  j = 0; j < c; j++)
                {
                  System.out.print(" element["+(i+1)+"]["+(j+1)+"] :: ");
                            while(!input.hasNextDouble())
                                  {repeat(b);
                                      System.out.println("Enter a Number ! \n element["+(i+1)+"]["+(j+1)+"] :: ");
                                  input.next();b++;}
                            arr[i][j] = input.nextInt();
                }
            }
    }
    public static void random_elements(double arr [] [],int r,int c)
    {
        Scanner input=new Scanner(System.in);
            for ( int i = 0; i < r; i++)
            {
                for (int  j = 0; j < c; j++)
                {arr[i][j] =(int) (Math.random() * 10000.0);}
            }
          System.out.println("**if you want see elements press :yes or y or 1**");
              String   ent=input.next();
                     if ("Yes".equalsIgnoreCase(ent)||"y".equalsIgnoreCase(ent)||"1".equals(ent)) 
                            {
                             System.out.println("elements ");
                                out_elements(arr,r,c);
                            }   
    }
    public static boolean sear4(double arr [] [],int x,int y,double m,int z){
        for (int i=0; i<x; i++)
           {
              for( int j=0; j<y; j++) 
                 {
                    if ( arr[i][j] == m ) {
                        System.out.println( "Element position :: ["+(i+1)+"]["+(j+1)+"]" );
                        return true;
                         }
                 }      
            }
           return false;
                }
    
  public static void out_elements(double arr [] [],int r,int c){
      for ( int i = 0; i < r; i++)
            {
                for (int  j = 0; j < c; j++)
                {
                    System.out.print(arr[i][j]+"\t" );
                }
               System.out.println("\n" ); 
            }
  }
    public static void main(String[] args) {
                       Scanner input=new Scanner(System.in);
                 String again; 
                  do{     int coloum ,roww,z=1,b=1;
                    do{
                      repeat(b);
                      System.out.print("Enter a Number Positive integer !\n Enter size of row :: ");
                      while(!input.hasNextInt())
                        {repeat(b);
                            System.out.print("Enter a Number Positive integer ! \n Enter size of row :: ");
                         input.next();b++;
                        }
                    roww=input.nextInt();
                        System.out.println("*******************************************");        
                   b++; 
                  }while(roww<=0);       
      b=1;         do{ repeat(b); 
                        System.out.print("Enter a Number Positive integer ! \n enter  the size of coloum :: ");
                        while(!input.hasNextInt())
                                    {repeat(b);
                                        System.out.print("Enter a Number Positive integer! \n enter the size of coloum :: ");
                                           input.next();b++;
                                    }   
                   coloum=input.nextInt();
             System.out.println("*******************************************");      
                     b++;              
                    }while(coloum <=0);
                        double matrix[][]=new double[roww][coloum];
                      //enter element 
        System.out.println("** If you Want Enter elements press :yes or y or 1 ** \n  **OR any thing other to random ..");
                    String ent= input.next();
                        if ("Yes".equals(ent)||"y".equalsIgnoreCase(ent)||"1".equals(ent)) 
                            {
                             System.out.println("enter elements  ");
                                enter_elements(matrix,roww,coloum);
                            } 
                        else{
                            random_elements(matrix,roww,coloum);
                            }
                     
                  System.out.print("enter the number you want :");
           b=1;
                  while(!input.hasNextDouble())
                          { repeat(b); 
                                 System.out.println("Enter a Number !");
                                 input.next();
                                b++;
                          }
         double m=input.nextDouble();
             boolean s=sear4(matrix,roww,coloum,m,z);
                    if(s==true){System.out.println(m + " Found ");}
                          else{System.out.println(m +" is not found ");}           
         
                    
                  System.out.println("\n **if you want calculate again  press :yes or y or 1**");
                    again = input.next();
           } while ("Yes".equalsIgnoreCase(again)||"y".equalsIgnoreCase(again)||"1".equalsIgnoreCase(again));
            System.out.println("Thanks For Using Our Program ..Users Team ..");
                 
    }

   
    
}
