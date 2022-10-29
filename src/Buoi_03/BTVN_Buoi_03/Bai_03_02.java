package Buoi_03.BTVN_Buoi_03;

import java.util.Scanner;

public class Bai_03_02 {
/*Bài 2. Dãy số tăng dần liên tiếp là dãy số mà phần tử phía sau sẽ lớn hơn phần tử phía trước 1 đơn vị.
Ví dụ ( 1 2 3 4 5) là một dãy số tăng dần liên tiếp từ 1 đến 5.
Bạn hãy nhập vào màn hình 1 mảng số nguyên tăng dần gồm n phần tử.
Hãy tìm xem phần tử nào còn thiếu trong mảng đấy để tạo thành 1 mảng tăng dần liên tiếp.
Nếu mảng mà tăng dần theo đúng trật tự in ra màn hình “YES”.

Input
5
1 3 5 6 7
Output
2 4

Input
6
1 4 5 7 8 10
Output
2 3 6 9

Input
4
1 2 3 4
Output
YES

*/
    public static void main(String[] args) {
        // Nhap n >= 2
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap n: ");
            n = scanner.nextInt();
        } while (n < 2);

        // Nhap mang
        int[] array = new int[n];
        for (int i = 0; i < n; ++i) {
            array[i] = scanner.nextInt();
        }

        // Bien dem phan tu con thieu
        int count = 0;

        // Solve
        for (int i = 1; i < n; ++i) {
            int soLienTruoc = ++array[i - 1];
            while (soLienTruoc != array[i]) {
                System.out.print(soLienTruoc++ + " ");
                ++count;
            }
        }
        if (count == 0) {
            System.out.println("YES");
        }

        // END.
    }
}
