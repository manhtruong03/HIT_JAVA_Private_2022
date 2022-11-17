package BTVN_Buoi_04;

import java.util.Scanner;

public class Bai_04_01 {
	/**
	 * Đếm tần số xuất hiện của các ký tự trong 1 chuỗi
	 * Input: Nguyen Van A
	 * Output: n: 3 g: 1 u: 1 y: 1 e: 1 v: 1 a: 2
	 * 
	 * Input: Tinh ngu di em oi
	 * Output: t: 1 i: 3 n: 2 h: 1 g: 1 u: 1 d: 1 e: 1 m: 1 o: 1
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = new String();
		Scanner scanner = new Scanner(System.in);
		s1 = scanner.nextLine();
		s1 = s1.toLowerCase();
		
		// CACH 2: THAO TAC VOI STRING
		
		
	// CACH 1: THAO TAC VOI ARRAY
		int n = s1.length();
		
		// Mang chuyen chuoi thanh so
		int[] a = new int[n];
		for (int i = 0; i < n; ++i) {
			a[i] = (int) s1.charAt(i);
		}
		
		// Solve
		for (int i = 0; i < n - 1; ++i) {
			if ((char) a[i] == ' ') {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					a[j] = (int) ' ';
					++count;
				}
			}
			System.out.println(s1.charAt(i) + ": " + count);
		}
	}
}
