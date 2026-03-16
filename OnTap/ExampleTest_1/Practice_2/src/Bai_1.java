import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai_1 {
    static void main(String[] args) {

        /*
        Nhập danh sách N số nguyên.
        Yêu cầu:
            Tìm số lớn nhất
            Tính tổng các phần tử
            Sắp xếp tăng dần
         */

        Scanner scanner = new Scanner(System.in);
        List<Integer> listNumber = new ArrayList<>();

        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            listNumber.add(scanner.nextInt());
        }
        // hien thi danh sach so nguyen da nhap
        System.out.println("Danh sach so nguyen da nhap: " + listNumber);

        // tim so lon nhat
        int max = listNumber.getFirst();

        for (int i = 0; i < listNumber.size(); i++){
            int num = listNumber.get(i);
            if (num > max) max = num;
        }
        System.out.println("So lon nhat trong danh sach: " + max);

        // sap xep tang dan
        for (int i = 0; i < listNumber.size() - 1; i++){
            for (int j = i + 1; j < listNumber.size(); j++){
                if (listNumber.get(i) > listNumber.get(j)){
                    int temp = listNumber.get(i);
                    listNumber.set(i, listNumber.get(j));
                    listNumber.set(j, temp);
                }
            }
        }
        System.out.println("Danh sach so nguyen tang dan: " + listNumber);
    }
}