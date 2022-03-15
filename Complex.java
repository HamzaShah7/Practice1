import java.util.Scanner;

public class Complex {
    public static void Sum (int R1,int I1,int R2, int I2){
        int SumReal,SumImg;
        SumReal = R1 + R2;
        SumImg = I1 + I2;
        System.out.println ("Sum is: "+ SumReal + "+" + SumImg + "i");
    }

    public static void Difference (int R1,int I1,int R2, int I2){
        int DiffReal,DiffImg;
        DiffReal = R1 - R2;
        DiffImg = I1 - I2;
        System.out.println ("Difference is: "+ DiffReal + "+" + DiffImg + "i");
    }

    public static void Product (int R1,int I1,int R2, int I2){
        int DiffReal,DiffImg;
        DiffReal = R1*R2 - I1*I2;
        DiffImg = R1*I2 + R2*I1;
        System.out.println ("Product is: "+ DiffReal + "+" + DiffImg + "i");
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter First Number Real Part: ");
        int R1 = sc.nextInt ();
        System.out.print ("Enter First Number Imaginary Part: ");
        int I1 = sc.nextInt ();
        System.out.print ("Enter Second Number Real Part: ");
        int R2 = sc.nextInt ();
        System.out.print ("Enter Second Number Imaginary Part: ");
        int I2 = sc.nextInt ();
        Sum (R1,I1,R2,I2);
        Difference (R1,I1,R2,I2);
        Product (R1,I1,R2,I2);


    }

}
