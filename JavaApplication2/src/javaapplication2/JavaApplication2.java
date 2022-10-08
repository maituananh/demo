package javaapplication2;

import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        // 1: bai1, 2: bai2
        String[] arrayFloat = {"a", "b"};
        for (int i = 0; i < arrayFloat.length; i++) {
            
        }
        
        for (String a : arrayFloat) {
            s
        }
        
        int input = 0;
        do {
            System.out.println("0: exit");
            System.out.println("1: bai 1");
            System.out.println("2: bai 2");
            System.out.print("Lua chon: ");
            Scanner scan = new Scanner(System.in);
            input = scan.nextInt();

            switch (input) {
                case 1:
                    nhapSoLuong(scan);
                    break;
                case 2:
                    timSoDuong(scan);
                    break;
            }

        } while (input != 0);
    }

    public static float[] nhapSoLuong(Scanner scanner) {
        System.out.print("Nhap so luong phan tu cua mang: ");
        int sl = scanner.nextInt();
        float[] arrayFloat = new float[sl];

        for (int i = 0; i < sl; i++) {
            System.out.print("nhap phan tu thu " + (i + 1) + ": ");
            arrayFloat[i] = scanner.nextFloat();
        }
        
        return arrayFloat;
    }

    public static void timSoDuong(Scanner scanner) {
        float[] n = nhapSoLuong(scanner);
        // arrayFloat để tính toán
        /// jksdfhlaslkjdfhksadjfhskjdf
    }
}
