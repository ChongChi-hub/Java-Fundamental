import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu tu cua sach trong he thong: ");
        int stt = scanner.nextInt();

        int shelf = (stt - 1) / 25 + 1;
        int position = (stt - 1) % 25 + 1;

        String area = (shelf <= 10) ? "Khu Can (Gan cua)" : "Khu Vien (Xa cua)";

        System.out.println("--- THONG TIN DINH VI ---");
        System.out.println("Sach so: " + stt);
        System.out.println("Dia chi: Ke " + shelf + " - Vi tri " + position);
        System.out.println("Phan khu: " + area);
    }
}
