package brideglabday1;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year to chek Leap yr or Not: ");
        int yr=sc.nextInt();
        
        if(yr>=1582)
        {
            if(yr%400==0 || (yr%4==0 && yr%100!=0))
                System.out.println(yr+" is Leap Year");
            else
                System.out.println(yr+" is Not Leap Year");
        }
        else
            System.out.println("!!!!Invalid!!!!");
    }
}
