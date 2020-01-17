package brideglabday1;
import static java.lang.StrictMath.sqrt;
import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The value Of A, B and C: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        int delta=(b*b)-4*a*c;
        if(delta<0)
        {
            System.out.println("Roots are imaginary");
        }
        else
        {
        int Root1X=(int) ((-b+sqrt(delta))/(2*a));
        int Root2X=(int) ((-b-sqrt(delta))/(2*a));
         
        System.out.println("The Roots Of X is : "+Root1X+","+Root2X);
    
        }
        
    }
}
