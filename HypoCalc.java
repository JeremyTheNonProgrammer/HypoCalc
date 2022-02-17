import java.util.Scanner;

public class HypoCalc {

    public static void main (String [] args){

        System.out.println("Welcome To HypoCalc.Online");

        Scanner scan = new Scanner(System.in);

        System.out.println("What is a ?");
        int a = scan.nextInt();

        System.out.println("What is b ?");
        int b = scan.nextInt();

        double c = Math.sqrt((a*a)+ (b*b));

        System.out.println("The Hypotenuse is " +c);


    }
}
