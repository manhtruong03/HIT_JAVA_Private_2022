#include <bits/stdc++.h>

using namespace std;

int main () {
	int n;
	cin >> n;
	
	int max;
	
	//nhap mang
	int a[n];
	for (int i = 0; i < n; ++i) {
		cin >> a[i];
		
		//tim max
		if (i == 0) {
			max = a[i];
		}
		if (0 < i && i < n)  {
			if (max < a[i])
				max = a[i];
		}
	}
	
/*	//in mang vua nhap
	cout << "\nMang vua nhap la:\n";
	for (int i = 0; i < n; ++i) {
		cout << a[i] << " ";
	}*/
	
	//dem so chu so cua so lon nhat
	int countDigit = 0;
	while (max > 0) {
		max /= 10;
		++countDigit;
	}
	
	//sap xep mang giam dan
	for (int i = 0; i < n - 1; ++i) {
		int m = i; 
		for (int j = i + 1; j < n; ++j) {
			if (a[m] < a[j])
				m = j;
		}
		if (i != m) {
			int tmp = a[i];
			a[i] = a[m];
			a[m] = tmp;
		}
	}
	
/*	//in mang vua sap xep
	cout << "\nMang vua sap xep la:\n";
	for (int i = 0; i < n; ++i) {
		cout << a[i] << " ";
	}*/
	
	//khoi tao mang ket qua
	int b[n];
	int newsizeB = 0;
	
	//solve
	for (int i = 1; i <= countDigit; ++i) {
		for (int j = 0; j < n; ++j) {
			if (pow(10, (i-1)) - 1 < a[j] && a[j] < pow(10, i)) {
				b[newsizeB] = a[j];
				++newsizeB;
			}
		}
	}
	
	//cout << "\nMang ket qua la:\n";
	for (int i = 0; i < n; ++i) {
		cout << b[i] << " ";
	}
	
	return 0;
}

/*
5 22 55 421 44 9 123 122 1

421 123 122		55 44 22		9 5 1
1 5 9		22 44 55		122 123 421

9 5 1 55 44 22 421 123 122
*/
