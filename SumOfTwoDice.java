
package brideglabday1;
import java.util.Scanner;

public class SumOfTwoDice {
    public static void main(String[] args) {
        
        int x=6;
        int a=(int) (1+(Math.random()*x));
        int b=(int) (1+(Math.random()*x));
        
        System.out.println("The Random Numbers are: "+a+" "+b);
        System.out.println("Sum is: "+(a+b));
    }
}
