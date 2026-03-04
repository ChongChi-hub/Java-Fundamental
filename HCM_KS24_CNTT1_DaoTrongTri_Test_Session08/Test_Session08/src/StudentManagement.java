import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentManagement {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Mang sinh vien
        Student[] students = new Student[100];
        // Bien dem so luong sinh vien
        int currentCount = 0;
        int choice;

        do {
            System.out.println("\n---------- MENU QUAN LY SINH VIEN ----------");
            System.out.println("1. Hien thi danh sach tat ca sinh vien. ");
            System.out.println("2. Them moi sinh vien. ");
            System.out.println("3. Sua thong tin sinh vien theo ID. ");
            System.out.println("4. Tim kiem sinh vien theo ten. ");
            System.out.println("5. Xoa sinh vien theo ID. ");
            System.out.println("6. Thoat. ");
            System.out.print("Moi ban chon chuc nang: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // xu ly troi lenh

            switch (choice) {
                case 1:
                    if (currentCount == 0) {
                        System.out.println("Danh sach sinh vien hien dang trong");
                    } else {
                        System.out.println("---------- DANH SACH SINH VIEN ----------");
                        for (int i = 0; i < currentCount; i++) {
                            students[i].displayData();
                        }
                    }
                    break;

                case 2:
                    System.out.println("----- THEM MOI SINH VIEN -----");
                    if (currentCount >= 100) {
                        System.out.println("Danh sach sinh vien hien da day");
                        break;
                    } else {
                        System.out.print("Nhap ma sinh vien: ");
                        String id = scanner.nextLine();
                        System.out.print("Nhap ten sinh vien: ");
                        String name = scanner.nextLine();
                        System.out.print("Nhap tuoi: ");
                        int age = scanner.nextInt();
                        scanner.nextLine(); // xu ly troi lenh
                        System.out.print("Nhap gioi tinh nam/nu: ");
                        String sex = scanner.nextLine();
                        System.out.print("Nhap diem so: ");
                        double mark = scanner.nextDouble();
                        scanner.nextLine(); // xu ly troi lenh

                        // khoi tao doi tuong moi luu vao mang
                        Student newStudent = new Student(id, name, age, sex, mark);
                        students[currentCount] = newStudent;
                        currentCount++; // tang bien dem sinh vien

                        System.out.println("Luu thong tin sinh vien thanh cong!");
                    }
                    break;

                case 3:
                    System.out.println("----- SUA THONG TIN SINH VIEN -----");
                    System.out.print("Nhap ma sinh vien can sua: ");
                    String editId = scanner.nextLine();
                    boolean foundEdit = false;

                    for (int i = 0; i < currentCount; i++){
                        if (students[i].getStudentId().equals(editId)) {
                            foundEdit = true;
                            System.out.println("Da tim thay sinh vien, nhap thong tin moi cho sinh vien: ");
                            System.out.print("Nhap ten moi: ");
                            students[i].setStudentName(scanner.nextLine());
                            System.out.print("Nhap tuoi moi: ");
                            students[i].setAge(scanner.nextInt());
                            scanner.nextLine(); // xu ly troi lenh
                            System.out.print("Nhap gioi tinh moi: ");
                            students[i].setSex(scanner.nextLine());
                            System.out.print("Nhap diem moi: ");
                            students[i].setMark(scanner.nextDouble());
                            scanner.nextLine(); // xu ly troi lenh
                            System.out.print("Cap nhat thong tin thanh cong!");
                            break;
                        }
                    }
                    if (!foundEdit) {
                        System.out.println("Khong tim thay sinh vien mang ma: " + editId);
                    }

                    break;

                case 4:
                    System.out.println("----- TIM KIEM SINH VIEN THEO TEN -----");
                    System.out.println("Nhap ten sinh vien can tim: ");
                    String searchName = scanner.nextLine().toLowerCase();
                    boolean foundSearch = false;
                    System.out.println("Ket qua tim kiem: ");
                    for (int i = 0; i < currentCount; i++) {
                        if (students[i].getStudentName().toLowerCase().contains(searchName)){
                            students[i].displayData();
                            foundSearch = true;
                        }
                    }
                    if (!foundSearch) {
                        System.out.println("Khong tim thay sinh vien!");
                    }
                    break;

                case 5:
                    System.out.println("----- XOA SINH VIEN THEO ID -----");
                    System.out.print("Nhap ma sinh vien can xoa: ");
                    String deleteId = scanner.nextLine();
                    boolean foundDelete = false;

                    for (int i = 0; i < currentCount; i++) {
                        if (students[i].getStudentId().equals(deleteId)){
                            foundDelete = true;
                            // don mang
                            for (int j = i; j < currentCount - 1; j++) {
                                students[j] = students[j + 1];
                            }
                            students[currentCount - 1] = null; // lam sach phan tu o cuoi cung
                            currentCount --; // giam bien tong so sinh vien
                            System.out.println("Xoa tanh cong sinh vien");
                            break;
                        }
                    }
                    if (!foundDelete) {
                        System.out.println("Khong tim thay sinh vien mang ma: " + deleteId);
                    }
                    break;

                case 6:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le");
            }

        } while (choice != 6);

        scanner.close();
    }
}