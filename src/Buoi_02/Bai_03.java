package Buoi_02;/*
Bài 3: Một bài toán khá quen thuộc:
	Trăm trâu , trăm cỏ ,
    Trâu lớn ăn năm , trâu nằm ăn ba ,
    Lụ khụ trâu già ,ba con 1 bó .
Hỏi có bao nhiêu con trâu đứng , trâu năm , trâu già?
*/


public class Bai_03 {
    public static void main(String[] args) {
        int count = 0;
        for (int trauDung = 1; trauDung * 5 < 100; ++trauDung) {
            for (int trauNam = 1; trauNam * 3 < 100; ++trauNam) {
                for (int trauGia = 3; trauGia < 100; trauGia += 3) {
                    if (trauDung + trauNam + trauGia == 100 && 3 * 5 * trauDung + 3 * 3 * trauNam + trauGia == 3 * 100) {
                        System.out.println("\n===Truong hop " + (++count));
                        System.out.println("So trau dung: " + trauDung);
                        System.out.println("So trau nam: " + trauNam);
                        System.out.println("So trau gia: " + trauGia);
                    }
                }
            }
        }
    }
}
