import java.util.*;

public class Area {
    private int lenght;
    private int breath;

    public Area () {

    }

    public void setDim (int lenght,int breadth) {
        this.lenght = lenght;
        this.breath = breadth;
    }

    public int getLenght () {
        return lenght;
    }

    public int getBreath () {
        return breath;
    }

    public int getArea(){
       return getBreath () * getLenght ();
    }

    @Override
    public String toString () {
        return "Lenght:" + getLenght () +
                "\nBreath:" + getBreath () +
                "\nArea is:"+getArea ();
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter Lenght: ");
        int len = sc.nextInt ();
        System.out.print ("Enter Breadth: ");
        int bre = sc.nextInt();
        Area A = new Area();
        A.setDim (len,bre);
        System.out.println ("Area is:"+A.getArea ());
    }
}