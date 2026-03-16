import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai_11 {
    public static boolean isPrime(int n){
        if (n < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listNumber = new ArrayList<>();
        List<Integer> primeNumber = new ArrayList<>();

        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            listNumber.add(scanner.nextInt());
        }

        System.out.println("Danh sach so nguyen: " + listNumber);

        for (int i = 0; i < listNumber.size(); i++) {
            int curNumber = listNumber.get(i);
            if (isPrime(curNumber)){
                primeNumber.add(curNumber);
            }
        }
        
        System.out.println("Cac so nguyen to: " + primeNumber);
    }
}