package Buoi_03.BTVN_Buoi_03;

import java.util.Scanner;

public class Bai_03_04 {
/*Bài 4. Số siêu nguyên tố là số được cấu tạo từ các chữ số nguyên tố và chính nó cũng là 1 số nguyên tố.
(Vd số 23 là 1 số siêu nguyên tố, vì nó được cấu tạo từ hai chữ số 2 và 3 là số nguyên tố và chính bản thân nó số 23 cũng là số nguyên tố).
Hãy nhập vào 1 mảng số nguyên gồm n phần tử , in ra các số là số siêu nguyên tố  có trong mảng.
Nếu mảng k có số siêu nguyên tố nào thì in ra “NO”.

Input
5
1 2 23 32 37
Output
2 23 37

Input
4
22 78 77 232
Output
NO

*/
    public static void main(String[] args) {
        // Nhap n >= 1
        int n;
        Scanner scanner = new Scanner (System.in);
        do {
            System.out.println("Nhap n: ");
            n = scanner.nextInt();
        } while (n < 1);

        // So lon nhat trong mang
        int max = 0;

        // Nhap mang + Tim MAX
        int[] array = new int[n];
        for (int i = 0; i < n; ++i) {
            array[i] = scanner.nextInt();

            // Tim max
            if (i == 0) {
                max = array[0];
            } else {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }

        // Mang nguyen to
        int[] markPrime = new int[++max];
        for (int i = 0; i < max; ++i) {
            markPrime[i] = i;
        }
        // Sang nguyen to
        markPrime[0] = markPrime [1] = 0;
        for (int i = 2; i < max; ++i) {
            if (markPrime[i] > 0) {
                for (int j = i; j < max; ++j) {
                    if (i * j >= max) {
                        break;
                    }
                    markPrime[i * j] = 0;   // Danh dau khong phai so nguyen to
                }
            }
        }

        // Dem so nguyen to cua mang
        int countPrime = 0;

        // Solve
        for (int i = 0; i < n; ++i) {
            // Kiem tra so nguyen to
            if (markPrime[array[i]] > 0) {
                int prime = array[i];
                // Kiem tra nguyen to tung chu so
                while (prime > 0) {
                    int digitsPrime = prime % 10;
                    if (markPrime[digitsPrime] == 0) {
                        break;
                    }
                    prime /= 10;
                    // Neu tat ca chu so deu thoa man
                    if (prime == 0) {
                        System.out.print(array[i] + " ");
                        ++countPrime;
                    }
                }
            }
        }
        // Neu mang khong co so nguyen to nao
        if (countPrime == 0) {
            System.out.println("NO");
        }

        // END.
    }
}
