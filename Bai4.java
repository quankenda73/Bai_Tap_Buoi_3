package Bai3;

public class Bai4 {
    public void CalculateQuadratic(int a, int b, int c) {
        if (a == 0 && b == 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (a == 0) {
            double x = - (double)c / b;
            System.out.println("Phương trình có một nghiệm: x = " + x);
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = - (double)b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + x);
            } else {
                double sqrtDelta = Math.sqrt(delta);
                double x1 = (-b + sqrtDelta) / (2 * a);
                double x2 = (-b - sqrtDelta) / (2 * a);
                System.out.println("Phương trình có hai nghiệm phân biệt:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }

    public static void main(String[] args) {
        Bai4 equation = new Bai4();
        
        equation.CalculateQuadratic(1, -3, 2);  
        equation.CalculateQuadratic(1, 2, 1);   
        equation.CalculateQuadratic(0, 2, -4);  
        equation.CalculateQuadratic(0, 0, 1);   
        equation.CalculateQuadratic(1, 2, 3);   
    }
}

