package pro3;
import java.util.Scanner;
public class Pro3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("this programe for multiplication table ");
        int x ,i,r,h=1;
        String s=" ";
        for(x=1;x<=10;x++,s += "\t")
        {System.out.println();
         System.out.print(s);
            for (i=h ; i <= 10; i++) {
                r = x * i;
                System.out.print(x + "*" + i + "=" + r);
                System.out.print("\t");
            }
            h++;
        }
    }
}

