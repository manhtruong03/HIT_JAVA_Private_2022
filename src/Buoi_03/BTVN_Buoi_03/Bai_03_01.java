package Buoi_03.BTVN_Buoi_03;

import java.util.Scanner;

public class Bai_03_01 {
    /*
    Bài 1. Nhập vào 1 mảng số nguyên gồm n phần tử (n >= 2).
    Đếm số lần xuất hiện của mỗi phần tử trong  mảng.

    Input
    6
    1  2 1 4 2 6
    Output
    1 : 2
    2 : 2
    4 : 1
    6 : 1

    Input
    4
    1 3 4 2
    Output
    1 : 1
    2 : 1
    3 : 1
    4 : 1
*/
    public static void main(String[] args) {

        // Nhap n >= 2
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap so nguyen n: ");
            n = scanner.nextInt();
        } while (n < 2);

        // Nhap mang
        int[] array = new int [n];
        for (int i = 0; i < n; ++i) {
            array[i] = scanner.nextInt();
        }

        // Sap xep mang tang dan
        for (int i = 0; i < n - 1; ++i) {
            int m = i;
            for (int j = i + 1; j < n; ++j) {
                if (array[m] > array[j]) {
                    m = j;
                }
            }
            if (i != m) {
                int temp = array[i];
                array[i] = array[m];
                array[m] = temp;
            }
        }

        // Bien dem so lan xuat hien cua moi phan tu
        int count = 1;

        // Solve
        for (int i = 0; i < n; i ++) {
            if (i == 0) {
                System.out.print(array[i] + " : ");
                continue;
            }

            if (array[i - 1] != array[i]) {
                System.out.println(count);
                count = 1;
                System.out.print(array[i] + " : ");
            } else {
                ++count;
            }
        }
        System.out.println(count);

        // END.
    }
}
