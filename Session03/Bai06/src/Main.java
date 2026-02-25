import java.util.Arrays;

public class Main {

    // Phương thức gộp và lọc trùng
    public static int[] mergeBooks(int[] a, int[] b) {
        // Bước 1: Tạo mảng kết hợp từ cả hai mảng
        int[] temp = new int[a.length + b.length];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            temp[index++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            temp[index++] = b[i];
        }

        Arrays.sort(temp);

        int[] unique = new int[temp.length];
        int n = 0;
        for (int i = 0; i < temp.length; i++) {
            if (i == 0 || temp[i] != temp[i - 1]) {
                unique[n++] = temp[i];
            }
        }

        return Arrays.copyOf(unique, n);
    }

    public static void displayBooks(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arrayFirst = {1, 3, 5, 7, 9};
        int[] arraySecond = {2, 3, 5, 6, 8, 9, 10};

        System.out.print("Kho cũ: ");
        displayBooks(arrayFirst);

        System.out.print("Lô mới: ");
        displayBooks(arraySecond);

        int[] arrayMerge = mergeBooks(arrayFirst, arraySecond);

        System.out.print("Kho tổng (đã gộp & lọc trùng): ");
        displayBooks(arrayMerge);
    }
}
