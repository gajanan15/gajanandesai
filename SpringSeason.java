package brideglabday1;

import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter the day: ");
        int day=Integer.parseInt(args[0]);
        int Month=Integer.parseInt(args[1]);
        
        if(day>=20 && Month>=3 && Month<=6)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
