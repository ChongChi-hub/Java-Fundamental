public class Main {

    // Thuật toán Bubble Sort
    public static void sortBooks(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Hoán đổi trực tiếp
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Hiển thị mảng
    public static void displayBooks(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] books = {987654, 123456, 654321, 456789, 111111};

        System.out.println("Mảng trước khi sắp xếp:");
        displayBooks(books);

        sortBooks(books);

        System.out.println("Mảng sau khi sắp xếp:");
        displayBooks(books);
    }
}
