package Buoi_02;

import java.util.Scanner;

/*
Bài 2 :Nhập vào 4 nguyên a , b , c , d. In ra màn hình số lớn thứ hai trong 4 số trên. Nếu cả 4 số đều bằng nhau in ra màn hình “Không tồn tại số lớn thứ hai”.
 */

public class Bai_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int array[] = new int [4];

        // Nhap 4 so nguyen a, b, c, d
        for (int i = 0; i < array.length; ++i) {
            array[i] = scanner.nextInt();

            // Kiem tra 4 so bang nhau
            if (i > 0 && array[i - 1] == array[i]) {
                ++count;
            }
        }

        // Sap xep mang giam dan
        for (int i = 0; i < array.length - 1; ++i) {
            int m = i;
            for (int j = i + 1; j < array.length; ++j) {
                if (array[m] < array[j]) {
                    m = j;
                }
            }
            if (i != m) {
                int temp = array[i];
                array[i] = array[m];
                array[m] = temp;
            }
        }

        // Ket qua
        if (count == array.length) {
            System.out.println("Khong ton tai sa lpn thu hai");
        } else {
            System.out.println(array[1]);
        }
    }
}
