package Bai3;
public class Bai2 {
    public void CalculatorInteger(String operation, int number1, int number2) {
        switch (operation) {
            case "+":
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                break;
            case "-":
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                break;
            case "*":
                System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                break;
            case "/":
                if (number2 != 0) {
                    System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                } else {
                    System.out.println("Không thể chia cho 0");
                }
                break;
            default:
                System.out.println("Phép toán không hợp lệ");
                break;
        }
    }

    public static void main(String[] args) {
        Bai2 calculator = new Bai2();
        calculator.CalculatorInteger("+", 5, 3);  // 5 + 3 = 8
        calculator.CalculatorInteger("-", 5, 3);  // 5 - 3 = 2
        calculator.CalculatorInteger("*", 5, 3);  // 5 * 3 = 15
        calculator.CalculatorInteger("/", 5, 3);  // 5 / 3 = 1
        calculator.CalculatorInteger("/", 5, 0);  // Không thể chia cho 0
        calculator.CalculatorInteger("%", 5, 3);  // Phép toán không hợp lệ
    }
}
