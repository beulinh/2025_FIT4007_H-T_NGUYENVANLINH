import java.util.Calendar;
public class Student {
    private String studentId;
    private String name;
    private int birthYear;
    private String address;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public Student(String studentId, String name, int birthYear, String address) {
        this.studentId = studentId;
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - birthYear;
    }

    public void displayStudentInfo() {
        System.out.println("Thong tin sinh vien:");
        System.out.println("- Ma sinh vien: " + studentId);
        System.out.println("- Ho ten: " + name);
        System.out.println("- Nam sinh: " + birthYear);
        System.out.println("- Dia chi: " + address);
        System.out.println("Tuoi cua sinh vien: " + getAge() + " tuoi");
    }
    public static void main(String[] args) {
        Student student = new Student("151234", "Nguyen Van A", 1997, "123 Nguyen Trai, Thanh Xuan, Ha Noi");
        student.displayStudentInfo();
    }
}