public class Student {
    private String name;
    private int roll_no;
    private long phone;
    private String address;


    public Student (String name,int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public Student (String name,int roll_no, long phone, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phone = phone;
        this.address = address;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getRoll_no () {
        return roll_no;
    }

    public void setRoll_no (int roll_no) {
        this.roll_no = roll_no;
    }

    public long getPhone () {
        return phone;
    }

    public String getAddress () {
        return address;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public void setPhone (long phone) {
        this.phone = phone;
    }

    @Override
    public String toString () {
        return "\nName:" + getName () +
                "\nRoll_no:" + getRoll_no () +
                "\nphone:" + getPhone () +
                "\naddress:" + getAddress ();
    }
    public String toString1 () {
        return "\nName:" + getName () +
                "\nRoll_no:" + getRoll_no ();
    }

    public static void main(String[] args){
        Student Std1 = new Student ("John",2);
        Student Std2 = new Student ("Sam",3,34254862,"DHA");
        System.out.println (Std1.toString1 ());
        System.out.println (Std2.toString ());
    }
}
