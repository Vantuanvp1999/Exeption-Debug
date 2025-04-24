import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Nhập cạnh a:");
            double a = sc.nextDouble();
            System.out.println("Nhập cạnh b: ");
            double b = sc.nextDouble();
            System.out.println("Nhập cạnh c: ");
            double c = sc.nextDouble();
            Triangle triangle= new Triangle(a,b,c);
            triangle.toString();
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        }catch (Exception e) {
            System.err.println("lỗi nhập liệu. Vui lòng nhập lại! ");
        }
    }
}