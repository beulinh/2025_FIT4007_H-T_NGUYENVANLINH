import java.util.Scanner;
class Circle {
    private double r;
    public Circle() {
        this.r = 1;
    }
    public Circle(double r) {
        this.r = r;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh r: ");
        this.r = sc.nextDouble();
        sc.close();
    }
    public void Output() {
        System.out.println("Thong tin hinh tron:");
        System.out.println("Ban kinh r = " + r);
    }
    public double dienTich() {
        return Math.PI * r * r;
    }
    public double chuVi() {
        return 2 * Math.PI * r;
    }

}