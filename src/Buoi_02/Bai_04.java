package Buoi_02;

import java.util.Scanner;

/*
Bài 4: Nhập vào màn hình số n > 0 , nếu nhập vào n <= 0 thực hiện nhập đến khi n > 0 thì thôi .Kiểm tra các chữ số trong số này , in ra các chữ số là số chính phương , nếu trong số này không đựợc cấu tạo từ chữ số nào là số chính phương in ra màn hình “No”.
        Input:  147892
                2356
        Output: 1 4 9
                No
*/


public class Bai_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n;
        do {
            System.out.print("Nhap n: ");
            n = scanner.nextLong();
        } while (n <= 0);

        byte soChinhPhuong;
        boolean count = false;
        while (n > 0) {
            soChinhPhuong = (byte) (n % 10);
            if (soChinhPhuong == 1 || soChinhPhuong == 4 || soChinhPhuong == 9) {
                System.out.print(soChinhPhuong + " ");
                count = true;
            }
            n /= 10;
        }
        if (!count) {
            System.out.println("No");
        }
    }
}
