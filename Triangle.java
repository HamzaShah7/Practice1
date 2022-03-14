import java.lang.Math;

public class Triangle {
    int oneSide = 3;
    int secondSide = 4;
    int thirdSide = 5;

    public Triangle(){}

    public int getSecondSide () {
        return secondSide;
    }

    public int getOneSide () {
        return oneSide;
    }

    public int getThirdSide () {
        return thirdSide;
    }

    public void setOneSide (int oneSide) {
        this.oneSide = oneSide;
    }

    public void setSecondSide (int secondSide) {
        this.secondSide = secondSide;
    }

    public void setThirdSide (int thirdSide) {
        this.thirdSide = thirdSide;
    }

    public double area (){
        int S = (getOneSide () + getSecondSide () + getThirdSide ())/2;
        double Area = Math.sqrt ((S*(S-getOneSide())*(S-getSecondSide ())*(S-getThirdSide ())));
        return Area;
    }

    public double perimeter(){
        double P = getOneSide () + getSecondSide () + getThirdSide ();
        return P;
    }

    @Override
    public String toString () {
        return "Area of Triangle:" + area () +
                "\nPerimeter of Triangle:" +perimeter ();
    }

    public static void main(String[] args){
        Triangle Tri = new Triangle ();
        System.out.println (Tri.toString ());
    }
}
