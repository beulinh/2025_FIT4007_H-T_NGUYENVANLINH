import java.io.Serializable;

// BƯỚC 1: Phải "đánh dấu" lớp này là có thể Tuần tự hóa
public class Student implements Serializable {

    // BƯỚC 2: (Good practice) Thêm serialVersionUID để đảm bảo
    // phiên bản lớp khi Ghi và Đọc là nhất quán.
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    // BƯỚC 3: Thêm hàm toString() để có thể in ra kiểm tra
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
