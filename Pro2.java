package pro2;
import java.util.Scanner;
public class Pro2{
        public static void repeat(int s){
           Scanner input = new Scanner(System.in);
        if(s>=5){ System.out.println("if you want Exit  press :yes or y or 1");
         String  again = input.next();
    
                if("Yes".equals(again)||"yes".equals(again)||"y".equals(again)||"Y".equals(again)||"1".equals(again) ||"YES".equals(again));
                      System.exit(0);
                
             
         }
     }
   public static void unit( ){
         System.out.println("************\n Select unit length measurement !! \n 1- Centimeter \n 2- metre \n 3- kilometre \n ************");
         System.out.print("Select unit length measurement !! Entre 1 , 2 OR 3 : \n Entre :: ");
                                }
    public static void area_premetre(){
         System.out.println("************ \n choose 1 , 2 or 3 !! \n 1- Area \n 2-premetre \n 3- Area and premetre \n ***********");
                                      }
   public static void area_size(){
System.out.println("************ \n choose 1 , 2 or 3 !! \n 1- Area \n 2-Size \n 3- Area and Size \n ***********");        
                                  }
   //function 1 squara ....
    public static void square(double x)
            { 
                    Scanner input=new Scanner(System.in);            
                            System.out.println("****Square****");
                        int n,b=1;
                          unit();
                        while(!input.hasNextInt())
                {
                    repeat(b);
                       System.out.print("Enter a Number !\nEnter again = ");
                       input.next();
                       b++;
                }
                        int u1=input.nextInt();
                            System.out.println("********************"); 
                      b=1;     
                System.out.print("Entre Length of the side : : ");
                           while(!input.hasNextDouble())      
                           {   repeat(b);
                              System.out.print("Enter a Number !\nEnter again = ");
                                input.next();
                           b++;
                           }
                           x=input.nextDouble();           
                    b=1;     
                 switch(u1){
                             case 1:{System.out.println("Length= "+x+" Cm");break;}
                             case 2:{x=x*100;
                                     System.out.println("Length= "+x+"Cm");break;}
                             case 3:{x=x*100000;
                                     System.out.println("Length= "+x+" Cm");break;}
                            default:{System.out.println("Length= "+x+" Cm");break;}
                            }     
                        double area= x*x;
                        double pra=x*4;
                         area_premetre();
                          while(!input.hasNextDouble())
                          {  repeat(b);                      
                             System.out.println("Enter a Number !\n Enter again = ");
                                input.next();
                         b++; }
                          
                            n=input.nextInt();    
                 switch(n){
                            case 1:{
                                    System.out.println(" ** Area of Shape ** "+"\n"+"Area= "+area +" Cm2 \n"+"Area= "+area/100 +" M2 \n"+"Area= "+area/100000 +" Km2");
                                    break; 
                                    }
                            case 2:{ 
                                   System.out.println(" ** Perimeter of Shape **\n "+"Perimeter= "+pra +" Cm \n"+"Perimeter= "+pra/100 +" M \n"+"Perimeter= "+pra/100000 +" Km");
                                   break;
                                   }
                            case 3:{System.out.println("  ** Area and Perimeter of Shape ** ");
                                    System.out.println(" ** Area of Shape ** "+"\n"+"Area= "+area +" Cm2 \n"+"Area= "+area/100 +" M2 \n"+"Area= "+area/100000 +" Km2");            
                                    System.out.println(" ** Perimeter of Shape **\n "+"Perimeter= "+pra +" Cm \n"+"Perimeter= "+pra/100 +" M \n"+"Perimeter= "+pra/100000 +" Km");
                                   break;}
                           default:{System.out.println("  ** Area and Perimeter of Shape ** ");
                                        System.out.println(" ** Area of Shape ** "+"\n"+"Area= "+area +" Cm2 \n"+"Area= "+area/100 +" M2 \n"+"Area= "+area/100000 +" Km2");            
                                        System.out.println(" ** Perimeter of Shape **\n "+"Perimeter= "+pra +" Cm \n"+"Perimeter= "+pra/100 +" M \n"+"Perimeter= "+pra/100000 +" Km");
                                     break;
                                   }
                         } 
                }
            
            
    //function 2 Rectangle .... 
    public static void Rectangle(double x,double y)
                {
                        Scanner input=new Scanner(System.in);            
                        int b=1;   
                        System.out.println("**** Rectangle ****");
                        
                        unit();
                            while(!input.hasNextDouble())                
                            {  repeat(b); System.out.println("Enter a Number !\n Enter again = " );
                       input.next();             
                       b++;
                            }  
                         int u1=input.nextInt();
                     b=1;      
                         System.out.println("********************"); 
                           System.out.print("Entre Length : ");
                          while(!input.hasNextDouble()||x<=0)                 
                          {repeat(b);
                            System.out.println("Enter a Number !\n Enter again = ");
                       input.next(); b++;       
                          }  
                        x=input.nextDouble();
                      b=1;  
                    switch(u1){
                            case 1:{System.out.println("Length= "+x+" Cm");break;}
                            case 2:{x=x*100;
                                    System.out.println("Length= "+x+"Cm");break;}
                            case 3:{x=x*100000;
                                    System.out.println("Length= "+x+" Cm");break;}
                            default:{
                                    System.out.println("Length= "+x+" Cm");break;}
                               }
                    System.out.println("**********");
                            System.out.println(" Select unit length measurement !!");
                            System.out.println(" 1- Centimeter");
                            System.out.println(" 2- metre");
                            System.out.println(" 3- kilometre");
                            System.out.println("********************"); 
                            System.out.println("Select unit Wide measurement!! Entre 1 , 2 OR 3 :");
                            System.out.print("Entre :: ");
                          while(!input.hasNextDouble())                 
                          {repeat(b);System.out.println("Enter a Number !\n Enter again = ");input.next(); b++;}  
                        int u2=input.nextInt();
                         b=1;  
                        System.out.println("********************");
                            System.out.print("Entre Wide : ");
                          while(!input.hasNextDouble())                 
                          {repeat(b);  System.out.println("Enter a Number !\n Enter again = ");input.next();b++;}  
                         y=input.nextDouble();
                    switch(u2){
                                case 1:{System.out.println("Wide = "+y+" Cm");break;}
                                case 2:{y=y*100;
                                    System.out.println("Wide = "+y+"Cm");break;}
                                case 3:{y=y*100000;
                                    System.out.println("Wide = "+y+" Cm");break;}
                                 default:{System.out.println("Wide = "+y+" Cm");break;}
                              }
                        double area= x*y;
                        double pra=(x+y)*2;
                         
                        unit();
                        area_premetre();
                          while(!input.hasNextDouble())
                          {repeat(b);  System.out.println("Enter a Number !\n Enter again = ");input.next(); b++;}  
                         int n=input.nextInt();
                         switch(n){
                               case 1:{
                                    System.out.println(" ** Area of Shape ** "+"\n"+"Area= "+area +" Cm2 \n"+"Area= "+area/100 +" M2 \n"+"Area= "+area/100000 +" Km2");
                                    break; 
                                    }
                            case 2:{ 
                                   System.out.println(" ** Perimeter of Shape **\n "+"Perimeter= "+pra +" Cm \n"+"Perimeter= "+pra/100 +" M \n"+"Perimeter= "+pra/100000 +" Km");
                                   break;
                                   }
                            case 3:{System.out.println("  ** Area and Perimeter of Shape ** ");
                                    System.out.println(" ** Area of Shape ** "+"\n"+"Area= "+area +" Cm2 \n"+"Area= "+area/100 +" M2 \n"+"Area= "+area/100000 +" Km2");            
                                    System.out.println(" ** Perimeter of Shape **\n "+"Perimeter= "+pra +" Cm \n"+"Perimeter= "+pra/100 +" M \n"+"Perimeter= "+pra/100000 +" Km");
                                   break;}
                           default:{System.out.println("  ** Area and Perimeter of Shape ** ");
                                        System.out.println(" ** Area of Shape ** "+"\n"+"Area= "+area +" Cm2 \n"+"Area= "+area/100 +" M2 \n"+"Area= "+area/100000 +" Km2");            
                                        System.out.println(" ** Perimeter of Shape **\n "+"Perimeter= "+pra +" Cm \n"+"Perimeter= "+pra/100 +" M \n"+"Perimeter= "+pra/100000 +" Km");
                                     break;
                                   }
                         } 
                }
    //function 3 Cuboid ....  
    
public static void Cuboid(double x,double y,double z)
        {
                       Scanner input=new Scanner(System.in);            
                       int b=1;  
                       System.out.println("**** Cuboid ****");
                            
                           
                            unit();
                          while(!input.hasNextDouble()) 
                          {repeat(b);  System.out.println("Enter a Number !\n Enter again = "); input.next(); b++;}
                         int u1=input.nextInt();
                       b=1;
                         System.out.println("********************"); 
                           System.out.print("Entre Length : ");
                          while(!input.hasNextDouble())
                          {repeat(b);  System.out.println("Enter a Number !\n Enter again = ");input.next();b++;}  
                        x=input.nextDouble();
                    switch(u1){
                            case 1:{System.out.println("Length= "+x+" Cm");break;}
                            case 2:{x=x*100;
                                    System.out.println("Length= "+x+"Cm");break;}
                            case 3:{x=x*100000;
                                    System.out.println("Length= "+x+" Cm");break;}
                            default:{
                                    System.out.println("Length= "+x+" Cm");break;}
                               }
                   b=1;        
                    unit();    
                     while(!input.hasNextDouble())                
                     {repeat(b);  System.out.println("Enter a Number !\n Enter again = ");input.next();b++;}  
                        int u2=input.nextInt();
                            System.out.println("********************");
                            System.out.print("Entre Wide : ");
                      b=1;   
                            while(!input.hasNextDouble())               
                          {repeat(b);  System.out.println("Enter a Number !\n Enter again = ");input.next(); b++;}  
                        y=input.nextDouble();
                    switch(u2){
                                case 1:{System.out.println("Wide = "+y+" Cm");break;}
                                case 2:{y=y*100;
                                    System.out.println("Wide = "+y+"Cm");break;}
                                case 3:{y=y*100000;
                                    System.out.println("Wide = "+y+" Cm");break;}
                                 default:{System.out.println("Wide= "+y+" Cm");break;}
                              }
                    
                    
                    unit();
                     while(!input.hasNextDouble())          
                     {repeat(b);  System.out.println("Enter a Number !\n Enter again = ");input.next(); b++;}  
                        int u3=input.nextInt();
                            System.out.println("********************");
                            System.out.print("Entre Heigh : ");
                          while(!input.hasNextDouble())                
                          { 
                             System.out.println("Enter a Number !\n Enter again = ");
                       input.next();       
                          }  
                         z=input.nextDouble();
                 switch(u3){
                                case 1:{System.out.println("High = "+z+" Cm");break;}
                                case 2:{z=z*100;
                                    System.out.println("High = "+z+"Cm");break;}
                                case 3:{z=z*100000;
                                    System.out.println("High = "+z+" Cm");break;}
                                 default:{System.out.println("High = "+z+" Cm");break;}
                            }
                       double area= (2*x*y)+(2*z*y)+(2*x*z);
                       double siz=x*y*z;
                            System.out.println("**********");
                            System.out.println("1- Area of Shape ");
                            System.out.println("2- Size of Shape ");
                             System.out.println("3- Area and Size of Shape ");
                            System.out.println("**********");
                            System.out.print("Choose number 1 , 2 OR 3 :: ");
 b=1;                     while(!input.hasNextDouble())                 
                         {repeat(b);  System.out.println("Enter a Number !\n Enter again = ");input.next(); b++;}
                      area_size();
                         int n=input.nextInt();    
                 switch(n){
                    case 1:{
                                        System.out.println(" ** Area of Shape ** "+"\n"+"Area= "+area +" Cm2 \n"+"Area= "+area/100 +" M2 \n"+"Area= "+area/100000 +" Km2");break;
                                      }
                               case 2:{ System.out.println("**Size of Shape** ");
                                        System.out.println(" ** Size of Shape ** \n"+"Size= "+siz +" Cm3 \n "+"Size= "+siz/100 +" M3 \n"+"Size= "+siz/100000 +" Km3");
                                      break;}
                                case 3:{System.out.println("  ** Area and Size of Shape ** ");
                                        System.out.println(" ** Area of Shape ** "+"\n"+"Area= "+area +" Cm2 \n"+"Area= "+area/100 +" M2 \n"+"Area= "+area/100000 +" Km2");
                                        System.out.println(" ** Size of Shape ** \n"+"Size= "+siz +" Cm3 \n "+"Size= "+siz/100 +" M3 \n"+"Size= "+siz/100000 +" Km3");
                                        break;
                                        }
                              default:{System.out.println("  ** Area and Size of Shape ** ");
                                        System.out.println(" ** Area of Shape ** "+"\n"+"Area= "+area +" Cm2 \n"+"Area= "+area/100 +" M2 \n"+"Area= "+area/100000 +" Km2");
                                        System.out.println(" ** Size of Shape ** \n"+"Size= "+siz +" Cm3 \n "+"Size= "+siz/100 +" M3 \n"+"Size= "+siz/100000 +" Km3");
                                        break;}
                            } 
                           
        }
    //function 4 Cube ....  
    public static void Cube(double x)
            {
                        Scanner input=new Scanner(System.in);            
                            System.out.println("**** Cube ****");
                    
                            unit();
       int b=1;         while(!input.hasNextDouble())                 
                         {repeat(b);  System.out.println("Enter a Number !\n Enter again = ");input.next(); b++;}
                        int u1=input.nextInt();
                            System.out.println("********************"); 
                            System.out.print("Entre Length of the side : : ");
        b=1;         while(!input.hasNextDouble())                 
                         {repeat(b);  System.out.println("Enter a Number !\n Enter again = ");input.next(); b++;}
                        x=input.nextDouble();
                   switch(u1){
                               case 1:{System.out.println("L = "+x+" Cm");break;}
                               case 2:{x=x*100;
                                       System.out.println("L = "+x+"Cm");break;}
                               case 3:{x=x*100000;
                                       System.out.println("L = "+x+" Cm");break;}
                              default:{System.out.println("Length = "+x+" Cm");break;}
                             }
                            
                         double area= 6 * x * x ;
                         double siz= x * x * x ;
                         area_size();    
        b=1;          while(!input.hasNextDouble())                 
                         {repeat(b);  System.out.println("Enter a Number !\n Enter again = ");input.next(); b++;}
                         
                         int n=input.nextInt();    
                   switch(n){
                               case 1:{
                                        System.out.println(" ** Area of Shape ** "+"\n"+"Area= "+area +" Cm2 \n"+"Area= "+area/100 +" M2 \n"+"Area= "+area/100000 +" Km2");break;
                                      }
                               case 2:{ System.out.println("**Size of Shape** ");
                                        System.out.println(" ** Size of Shape ** \n"+"Size= "+siz +" Cm3 \n "+"Size= "+siz/100 +" M3 \n"+"Size= "+siz/100000 +" Km3");
                                      break;}
                                case 3:{System.out.println("  ** Area and Size of Shape ** ");
                                        System.out.println(" ** Area of Shape ** "+"\n"+"Area= "+area +" Cm2 \n"+"Area= "+area/100 +" M2 \n"+"Area= "+area/100000 +" Km2");
                                        System.out.println(" ** Size of Shape ** \n"+"Size= "+siz +" Cm3 \n "+"Size= "+siz/100 +" M3 \n"+"Size= "+siz/100000 +" Km3");
                                        break;
                                        }
                              default:{System.out.println("  ** Area and Size of Shape ** ");
                                        System.out.println(" ** Area of Shape ** "+"\n"+"Area= "+area +" Cm2 \n"+"Area= "+area/100 +" M2 \n"+"Area= "+area/100000 +" Km2");
                                        System.out.println(" ** Size of Shape ** \n"+"Size= "+siz +" Cm3 \n "+"Size= "+siz/100 +" M3 \n"+"Size= "+siz/100000 +" Km3");
                                        break;}
                            } 
            }
    //function 5 Parallelogram ....
    public static void Parallelogram(double x,double y)
                        {
                            Scanner input=new Scanner(System.in);            
                                    System.out.println("**** Parallelogram ****");
                            
                                    unit();
       int b=1;         while(!input.hasNextDouble())                 
                         {repeat(b);  System.out.println("Enter a Number !\n Enter again = ");input.next(); b++;}
                        int u1=input.nextInt();
                           System.out.println("********************"); 
                           System.out.print("Entre Length of base : ");
        b=1;         while(!input.hasNextDouble())                 
                         {repeat(b);  System.out.println("Enter a Number !\n Enter again = ");input.next(); b++;}
                         x=input.nextDouble();
                    switch(u1){
                            case 1:{System.out.println("Length of base= "+x+" Cm");break;}
                            case 2:{x=x*100;
                                    System.out.println("Length of base= "+x+"Cm");break;}
                            case 3:{x=x*100000;
                                    System.out.println("Length of base= "+x+" Cm");break;}
                            default:{
                                    System.out.println("Length of base= "+x+" Cm");break;}
                               }
                 
                    unit();
                     while(!input.hasNextDouble()) 
                     {System.out.println("Enter a Number !\n Enter again = ");
                       input.next();
                     }  
                        int u2=input.nextInt();
                            System.out.println("********************");
                            System.out.print("Entre high :  ");
        b=1;         while(!input.hasNextDouble())                 
                         {repeat(b);  System.out.println("Enter a Number !\n Enter again = ");input.next(); b++;}
                         y=input.nextDouble();
                    switch(u2){
                                case 1:{System.out.println("High = "+y+" Cm");break;}
                                case 2:{y=y*100;
                                    System.out.println("High = "+y+"Cm");break;}
                                case 3:{y=y*100000;
                                    System.out.println("High = "+y+" Cm");break;}
                                 default:{System.out.println("High = "+y+" Cm");break;}
                              }
                              double area = x * y ;
                             double pra  =( x + y ) * 2 ;
                                    area_premetre();
        b=1;         while(!input.hasNextDouble())                 
                         {repeat(b);  System.out.println("Enter a Number !\n Enter again = ");input.next(); b++;}
                            int n=input.nextInt();    
                        switch(n){
                            case 1:{
                                    System.out.println(" ** Area of Shape ** "+"\n"+"Area= "+area +" Cm2 \n"+"Area= "+area/100 +" M2 \n"+"Area= "+area/100000 +" Km2");
                                    break; 
                                    }
                            case 2:{ 
                                   System.out.println(" ** Perimeter of Shape **\n "+"Perimeter= "+pra +" Cm \n"+"Perimeter= "+pra/100 +" M \n"+"Perimeter= "+pra/100000 +" Km");
                                   break;
                                   }
                            case 3:{System.out.println("  ** Area and Perimeter of Shape ** ");
                                    System.out.println(" ** Area of Shape ** "+"\n"+"Area= "+area +" Cm2 \n"+"Area= "+area/100 +" M2 \n"+"Area= "+area/100000 +" Km2");            
                                    System.out.println(" ** Perimeter of Shape **\n "+"Perimeter= "+pra +" Cm \n"+"Perimeter= "+pra/100 +" M \n"+"Perimeter= "+pra/100000 +" Km");
                                   break;}
                           default:{System.out.println("  ** Area and Perimeter of Shape ** ");
                                        System.out.println(" ** Area of Shape ** "+"\n"+"Area= "+area +" Cm2 \n"+"Area= "+area/100 +" M2 \n"+"Area= "+area/100000 +" Km2");            
                                        System.out.println(" ** Perimeter of Shape **\n "+"Perimeter= "+pra +" Cm \n"+"Perimeter= "+pra/100 +" M \n"+"Perimeter= "+pra/100000 +" Km");
                                     break;
                                   }
                         }   
                        }
     //function 1 squara ....
    public static void circal(double r)
            { 
                    Scanner input=new Scanner(System.in);            
                            System.out.println("****Square****");
                        int n,b=1;
                         
                        unit();
                         
        b=1;         while(!input.hasNextDouble())                 
                         {repeat(b);  System.out.println("Enter a Number !\n Enter again = ");input.next(); b++;}
                        int u1=input.nextInt();
                            System.out.println("********************"); 
                            System.out.print("Entre Radius : : ");
                           while(!input.hasNextDouble())      
                           {  System.out.println("Enter a Number !\n Enter again = ");
                       input.next();
                           }  
                         r=input.nextDouble();
                 switch(u1){
                             case 1:{System.out.println("Radius= "+r+" Cm");break;}
                             case 2:{r=r*100;
                                     System.out.println("Radius= "+r+"Cm");break;}
                             case 3:{r=r*100000;
                                     System.out.println("Radius= "+r+" Cm");break;}
                            default:{System.out.println("Radius= "+r+" Cm");break;}
                            }     
                        double area=3.14*r*r;
                        double pra=.5*r*r;
                         area_premetre();
         b=1;         while(!input.hasNextDouble())                 
                         {repeat(b);  System.out.println("Enter a Number !\n Enter again = ");input.next(); b++;}
                          
                            n=input.nextInt();    
                 switch(n){
                            case 1:{ System.out.println(" ** Area of Shape ** "+"\n"+"Area= "+area +" Cm2 \n"+"Area= "+area/100 +" M2 \n"+"Area= "+area/100000 +" Km2"); 
                                        break;}
                            case 2:{System.out.println(" ** Perimeter of Shape ** ");
                                    System.out.println(" ** Perimeter of Shape **\n "+"Perimeter= "+pra +" Cm \n"+"Perimeter= "+pra/100 +" M \n"+"Perimeter= "+pra/100000 +" Km");
                                    break;}
                            case 3:{System.out.println("  ** Area and Perimeter of Shape ** ");
                                        System.out.println(" ** Area of Shape ** ");            
                                         System.out.println(" ** Area of Shape ** "+"\n"+"Area= "+area +" Cm2 \n"+"Area= "+area/100 +" M2 \n"+"Area= "+area/100000 +" Km2");  
                                        System.out.println(" ** Perimeter of Shape **\n "+"Perimeter= "+pra +" Cm \n"+"Perimeter= "+pra/100 +" M \n"+"Perimeter= "+pra/100000 +" Km");
                                        break;
                                    }
                            default:{System.out.println("  ** Area and Perimeter of Shape ** ");
                                        System.out.println(" ** Area of Shape ** "+"\n"+"Area= "+area +" Cm2 \n"+"Area= "+area/100 +" M2 \n"+"Area= "+area/100000 +" Km2");            
                                        System.out.println(" ** Perimeter of Shape **\n "+"Perimeter= "+pra +" Cm \n"+"Perimeter= "+pra/100 +" M \n"+"Perimeter= "+pra/100000 +" Km");break;}
                                    }
                }
            
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double x=1,y=1,z=1,r=1;
        int num,h;  
        String again;
        do{  
            System.out.println(" ***************** \n 1- Square \n 2- Rectangle \n 3- Cuboid \n  4-Cube \n 5- Parallelogram \n 6- circal \n *****************");
            System.out.print("Choose number from Last shaps :");
         int   b=1;         while(!input.hasNextDouble())                 
                         {repeat(b);  System.out.println("Enter a Number !\n Enter again = ");input.next(); b++;}    
            num=input.nextInt();
            switch(num){
                case 1:{square(x); break; }
                case 2:{Rectangle( x, y);break; }
                case 3:{Cuboid(x,y,z);break; }
                case 4:{Cube(x);break; }
                case 5:{Parallelogram(x,y);break; }
                case 6:{circal(r);break;}
                default:{ System.out.println("errer ");break;}
            }
         System.out.println("if you want any factorial again  press :yes or y or 1");
           again = input.next();
    
}while ("Yes".equals(again)||"yes".equals(again)||"y".equals(again)||"Y".equals(again)||"1".equals(again) ||"YES".equals(again));
    System.out.println("Thanks For Using Our Program ..Users Team ..");
    }
    
}
