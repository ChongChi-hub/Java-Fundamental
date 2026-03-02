public class Main {
    static void main(String[] args) {
        Product p1 = new Product(1, "P1", 100000);
        Product p2 = new Product(2, "P2", 200000);

        System.out.println("Truoc khi set gia moi: ");
        p1.displayProduct();
        p2.displayProduct();

        System.out.println("Sau khi set gia: ");
        p1.setPrice(-100000);
        p2.setPrice(222222);
        p1.displayProduct();
        p2.displayProduct();
    }
}