import java.util.Scanner;

public class Employee {
    private String name;
    private int year;
    private String address;

    public Employee(String name, int year, String address){
        this.name = name;
        this.year = year;
        this.address = address;
    }

    public String getName () {
        return name;
    }

    public String getAddress () {
        return address;
    }

    public int getYear () {
        return year;
    }

    @Override
    public String toString () {
        return  getName () + "\t\t" +getYear () +"\t\t" + address;
    }

    public static void main (String[] args) {
        System.out.println ("Name\t\tYear of Joining\t\tAddress");
        Employee E1 = new Employee ("Robert",1994,"64C-WallsStreat");
        Employee E2 = new Employee ("Sam",2000,"68D-WallsStreat");
        Employee E3 = new Employee ("Robert",1994,"26B-WallsStreat");
        System.out.println (E1);
        System.out.println (E2);
        System.out.println (E3);
    }

}
