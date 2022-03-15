public class Rectangle {
    private int lenght;
    private int breath;

    public Rectangle(int lenght, int breath){
        this.lenght = lenght;
        this.breath = breath;
    }

    public void setlenght (int lenght) {
        this.lenght = lenght;
    }

    public int getlenght () {
        return lenght;
    }

    public int getBreath () {
        return breath;
    }

    public void setBreath (int breath) {
        this.breath = breath;
    }

    public int Area(){
        int Area = getlenght () * getBreath ();
        return Area;
    }

    @Override
    public String toString () {
        return "\nLenght of Rectangle is:" + getlenght () +
                "\nBreath of Rectangle is:" + getBreath () +
                "\nArea of Rectangle is:" + Area ();
    }

    public static void main(String[] args){
        Rectangle rec1 = new Rectangle (4,5);
        Rectangle rec2 = new Rectangle (5,8);
        System.out.println (rec1);
        System.out.println (rec2);
    }
}
