import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai_8 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listName = new ArrayList<>();

        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ten sinh vien thu " + (i + 1) + ": ");
            listName.add(scanner.nextLine());
        }

        System.out.println("Danh sach ten sinh vien: " + listName);

        String regex = "^[Aa].*";
        int count = 0;
        for (int i = 0; i < listName.size(); i++) {
            if (listName.get(i).matches(regex)){
                count++;
            }
        }

        System.out.println("So sinh vien bat dau = 'A': " + count);
    }
}