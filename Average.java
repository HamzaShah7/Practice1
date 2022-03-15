import java.util.Scanner;
public class Average {

    public static void Avg (int num1,int num2,int num3){
        int A = num1 + num2 + num3;
        System.out.println ("Average is: "+ A/3);
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter First Number: ");
        int N1 = sc.nextInt ();
        System.out.print ("Enter Second Number: ");
        int N2 = sc.nextInt ();
        System.out.print ("Enter Third Number: ");
        int N3 = sc.nextInt ();
        Avg(N1,N2,N3);
    }

}
