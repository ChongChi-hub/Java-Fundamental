import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai_6 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listNumber = new ArrayList<>();
        List<Integer> num = new ArrayList<>();

        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu "+ (i+1) + ": ");
            listNumber.add(scanner.nextInt());
        }

        System.out.println("Danh sach: " + listNumber);

        // tim so lon thu 2
        // thuat toan: sap xep giam dan sau do lay listNumber.get(i + 1)
        for (int i = 0; i < listNumber.size() - 1; i++){
            for (int j = i + 1; j < listNumber.size(); j++){
                if (listNumber.get(i) < listNumber.get(j)){
                    int temp = listNumber.get(i);
                    listNumber.set(i, listNumber.get(j));
                    listNumber.set(j, temp);
                }
            }
        }

        System.out.println("Mang sau khi sap xep giam dan: " + listNumber);
        System.out.println("Phan tu lon thu 2 trong mang: " + listNumber.get(1));
    }
}