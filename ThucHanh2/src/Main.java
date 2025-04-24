import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    ArrayExample arrayExample = new ArrayExample();
    Integer[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chỉ số của phần tử bất kỳ: ");
        int n = scanner.nextInt();
        try{
            System.out.println("Giá trị của phần tử có chỉ số là "+n+" "+arr[n]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }

 }