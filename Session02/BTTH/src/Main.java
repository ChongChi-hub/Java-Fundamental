import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Menu chính
            System.out.println("\n--- MENU QUẢN LÝ THƯ VIỆN ---");
            System.out.println("1. Tính tiền phạt trả sách");
            System.out.println("2. Đăng ký thẻ mượn sách VIP");
            System.out.println("3. Thống kê số sách nhập kho");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Chức năng 1: Tính tiền phạt
                    System.out.print("Nhập số lượng sách trả: ");
                    int n = sc.nextInt();
                    int tongPhat = 0;

                    for (int i = 1; i <= n; i++) {
                        System.out.print("Nhập số ngày trễ của cuốn " + i + ": ");
                        int days = sc.nextInt();
                        if (days <= 5) {
                            tongPhat += days * 2000;
                        } else {
                            tongPhat += 5 * 2000 + (days - 5) * 5000;
                        }
                    }
                    System.out.println("Tổng tiền phạt: " + tongPhat + " VND");
                    break;

                case 2:
                    // Chức năng 2: Đăng ký VIP
                    System.out.print("Nhập tuổi: ");
                    int tuoi = sc.nextInt();
                    System.out.print("Nhập số sách đã mượn trong tháng: ");
                    int soSach = sc.nextInt();
                    System.out.print("Có thẻ ưu tiên sinh viên? (1: Có, 0: Không): ");
                    int uuTien = sc.nextInt();

                    if ((tuoi >= 18 && soSach >= 10) || uuTien == 1) {
                        System.out.println("Đủ tiêu chuẩn nâng cấp VIP");
                    } else {
                        System.out.println("Chưa đủ tiêu chuẩn");
                    }
                    break;

                case 3:
                    // Chức năng 3: Nhập kho sách
                    int tongSach = 0;
                    int maSach;
                    do {
                        System.out.print("Nhập mã số sách mới (0 để dừng): ");
                        maSach = sc.nextInt();

                        if (maSach < 0) {
                            System.out.println("Mã không hợp lệ, hãy nhập lại!");
                            continue;
                        }
                        if (maSach == 0) {
                            break;
                        }
                        tongSach++;
                    } while (true);

                    System.out.println("Tổng số sách hợp lệ đã nhập: " + tongSach);
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại!");
            }
        } while (choice != 0);

    }
}
