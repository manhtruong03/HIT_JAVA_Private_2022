package Buoi_03.BTVN_Buoi_03;

import java.util.Scanner;

public class Bai_03_03 {
/*Bài 3. Nhập vào một mảng số nguyên gồm n phần tử,
in ra độ dài mảng con tăng dần liên tiếp dài nhất ở trong mảng.
Ví dụ: mảng Arr: 1 3 3 4 3 5 8 gồm 2 mảng con tăng dần là 1 3 3 4 và 3 5 8,
như vậy mảng con tăng dần liên tiếp có độ dài lớn nhất là 1 3 3 4 bao gồm 4 phần tử

Input
9
1 3 4 2 5 6 8 0 2
Output
4

Input
5
1 2 3 4 5
Output
5

*/
    public static void main(String[] args) {
        // nhap n >= 1
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap n: ");
            n = scanner.nextInt();
        } while (n < 1);

        // Nhap mang
        int[] array = new int[n];
        for (int i = 0; i < n; ++i) {
            array[i] = scanner.nextInt();
        }

        // Bien dem do dai chuoi con tang dan
        int count, lengthMax;
        count = lengthMax = 1;

        // Solve
        for (int i = 1; i < n; ++i) {
            if (array[i - 1] < array[i]) {
                ++count;
                if (count > lengthMax) {
                    lengthMax = count;
                }
            } else {
                count = 1;
            }
        }
        System.out.println(lengthMax);

        // END.
    }
}
