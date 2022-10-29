#include <bits/stdc++.h>

using namespace std;

int main () {
	int a, b, c, d;
	cin >> a >> b >> c >> d;
	
	int tuSo = a*d;
	int mauSo = b*c;
	
	int i = 2;
	while (i < tuSo && i < mauSo) {
		if (tuSo % i == 0 && mauSo % i == 0) {
			tuSo /= i;
			mauSo /= i;
		}
		++i;
	}
	
	cout << tuSo << "/" << mauSo;
	
	return 0;
}


