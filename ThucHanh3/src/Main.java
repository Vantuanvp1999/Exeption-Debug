import javax.print.attribute.AttributeSetUtilities;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập x: ");
        int x= sc.nextInt();
        System.out.println("Nhập y: ");
        int y= sc.nextInt();
        caculate(x, y);3
    }
    public static void caculate(int x, int y) {
            try{
                int a = x+y;
                int b = x-y;
                int c = x*y;
                int d = x/y;
                System.out.println("Tổng: "+a);
                System.out.println("Hiệu: "+b);
                System.out.println("Tích: "+c);
                System.out.println("Thương: "+d);
            }catch (Exception e){
                System.err.println("Xảy ra ngoại lệ: "+e.getMessage());
            }
    }
}