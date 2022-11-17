package Buoi_04_MathWrapString.CodeTrenLop;

import java.util.Scanner;

public class Main {
    /**
     * Phuong thuc tinh chu vi hinh tron<br>
     * <i>Cap nhat ngay 4/11/2022</i>
     * @param r - ban kinh hinh tron
     * @return - chu vi hinh tron
     */
    public static double chuVi(double r) {
        return  2 * Math.PI * r;
    }

    /**
     * Phuong thuc tinh dien tich hinh tron<br>
     * <i>Cap nhat ngay 4/11/2022</i>
     * @param r - ban kinh hinh tron
     * @return - dien tich hinh tron
     */
    public static double dienTich(double r) {
        return Math.PI * Math.pow(r, 2);
    }


    public static void main(String[] args) {
        double  r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ban kinh hinh tron R = ");
        r = scanner.nextFloat();

        System.out.println("Chu vi hinh tron: " + chuVi(r));
        System.out.println("Dien tich hinh tron: " + dienTich(r));


    }
}
