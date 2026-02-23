import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ma sach (4 chu so): ");
        int code = scanner.nextInt();

        int thousands = code / 1000;
        int hundreds  = (code / 100) % 10;
        int dozens    = (code / 10) % 10;
        int units     = code % 10;

        int sumOfFirstThree = thousands + hundreds + dozens;

        boolean isValid = (sumOfFirstThree % 10 == units);

        System.out.println("Chu so kiem tra ky vong: " + (sumOfFirstThree % 10));
        System.out.println("Ket qua kiem tra ma sach: " + (isValid ? "HOP LE" : "SAI MA"));
    }
}
