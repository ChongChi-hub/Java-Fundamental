import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai_7 {
    public  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listName = new ArrayList<>();

        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ten sinh vien thu " + (i+1) +": ");
            listName.add(scanner.nextLine());
        }

        System.out.println("Danh sach ten sinh vien da nhap: " + listName);

        // tim ten sinh vien dai nhat
        String longestName = listName.get(0);
        for (int i = 0; i < listName.size(); i++) {
            String currentName = listName.get(i);
            if (currentName.length() > longestName.length()){
                 longestName = currentName;
            }
        }
        System.out.println("Sinh vien co ten dai nhat: " + longestName);
    }
}