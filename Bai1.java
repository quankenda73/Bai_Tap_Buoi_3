package Bai3;
    public class Bai1 {
        public void CheckLeapYear(int year) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Đây là năm nhuận");
            } else {
                System.out.println("Đây không phải là năm nhuận");
            }
        }
    
        public static void main(String[] args) {
            Bai1 checker = new Bai1();
            checker.CheckLeapYear(2020);  
            checker.CheckLeapYear(2021);  
            checker.CheckLeapYear(1900);  
            checker.CheckLeapYear(2000);  
    }
