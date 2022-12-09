package CodeTrenLop;

import java.util.Scanner;

public class ArrayForeachFinal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Khai bao
		int[] arr = new int[4];
		
		// Gan truc tiep cac phan tu cho mang
		int[] array = new int[] { 1, 2, 3, 4, 5 };

		for (int i = 0; i < 4; i++) {
			System.out.printf(" Nhap vao gia tri a[%d] =", i);
//	        arr[i] = sc.nextInt();
			// Khong can bien trung gian
			arr[i] = new Scanner(System.in).nextInt();
		}

		// For each
//	    for (type arr: name arr) {
//	    }
// 		=> Tac dung : Xuat gia tri cua mảng thay vì dùng for thường
		for (int item : arr) {
			System.out.print(item + " ");
		}
		
		// Goi ham STATIC
		System.out.println(ArrayForeachFinal.tinhTongStatic(1, 2));

		// Cách truy cập không dung static
		ArrayForeachFinal buoi3 = new ArrayForeachFinal();
		int c = buoi3.tinhTong(1, 2);
		System.out.println(c);

//	    System.out.println(tinhTong(2 , 3)); //Error
	}

	// Return doi voi ham co kieu tra ve (khac void)
	public int tinhTong(int a, int b) {
		return a + b;
	}

	public static int tinhTongStatic(int a, int b) {
		return a + b;
	}

	public void input(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			arr[i] = new Scanner(System.in).nextInt();
		}
	}

	public void output(int[] arr, int n) {
		for (int item : arr) {
			System.out.print(item + " ");
		}
	}
}
