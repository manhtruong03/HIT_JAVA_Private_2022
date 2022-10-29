#include <bits/stdc++.h>

using namespace std;

int main () {
	//khoi tao kich thuoc mang
	int hang, cot;
	cin >> hang >> cot;
	
	//nhap mang
	int a[hang][cot];
	for (int row = 0; row < hang; ++row) {
		for (int column = 0; column < cot; ++column) {
			cin >> a[row][column];
		}
	}
	
	//bien dem so luong dau cong
	int count = 0;
	
	//duyet mang
	for (int row = 1; row < hang - 1; ++row) {
		for (int column = 1; column < cot - 1; ++column) {
			if (a[row-1][column] && a[row][column-1] && a[row][column] && a[row][column+1] && a[row+1][column])
				++count;
		}
	}
	
	//ket qua
	cout << count << endl;
	
//	//xuat mang
//	cout << "\nMang vua nhap la:\n";
//	for (int row = 0; row < hang; ++row) {
//		for (int col = 0; col < cot; ++col) {
//			cout << a[row][col] << " ";
//		}
//		cout << endl;
//	}
	return 0;
}


