package Bai3;
import java.util.Scanner;

public class Bai3 {
    public int FindMaxInteger(int number1, int number2, int number3) {
        int max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập vào số thứ nhất: ");
        int number1 = scanner.nextInt();
        
        System.out.println("Nhập vào số thứ hai: ");
        int number2 = scanner.nextInt();
        
        System.out.println("Nhập vào số thứ ba: ");
        int number3 = scanner.nextInt();
        
        Bai3 maxInteger = new Bai3();
        int max = maxInteger.FindMaxInteger(number1, number2, number3);
        
        System.out.println("Số lớn nhất trong ba số là: " + max);
        
        scanner.close();
    }
}
