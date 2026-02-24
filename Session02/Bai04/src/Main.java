import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;

        do {
            System.out.print("Nhập mã ID sách mới (phải > 0): ");
            id = sc.nextInt();

            if (id <= 0) {
                System.out.println("Mã không hợp lệ, hãy nhập lại!");
            }
        } while (id <= 0);
        System.out.println("Lưu mã sách thành công: " + id);

    }
}
