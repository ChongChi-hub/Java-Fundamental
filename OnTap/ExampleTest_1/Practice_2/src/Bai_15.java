import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai_15 {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listNumber = new ArrayList<>();

        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            listNumber.add(scanner.nextInt());
        }

        System.out.println("Danh sach so nguyen: " + listNumber);

        // IN 3 SO LON NHAT
        // sap xep giam dan dau do lay 012

        for (int i = 0; i < listNumber.size() - 1; i++) {
            for (int j = i + 1; j < listNumber.size(); j++){
                if (listNumber.get(i) < listNumber.get(j)){
                    int temp = listNumber.get(i);
                    listNumber.set(i, listNumber.get(j));
                    listNumber.set(j, temp);
                }
            }
        }

        System.out.print("3 so lon nhat trong danh sach: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(listNumber.get(i) + " ");
        }
    }
}