import java.util.Scanner;

public class Area2 {
    private int length;
    private int breadth;

    public Area2(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void setLength (int length) {
        this.length = length;
    }

    public int getBreadth () {
        return breadth;
    }

    public int getLength () {
        return length;
    }

    public void setBreadth (int breadth) {
        this.breadth = breadth;
    }

    public int returnArea(){
        int Area = getLength () * getBreadth ();
        return Area;
    }

    @Override
    public String toString () {
        return "Area: " + returnArea ();
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter Lenght: ");
        int len = sc.nextInt ();
        System.out.print ("Enter Breadth: ");
        int bre = sc.nextInt();
        Area2 A2 = new Area2 (len,bre);
        System.out.println (A2);

    }
}
