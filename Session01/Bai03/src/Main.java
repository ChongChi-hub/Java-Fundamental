public class Main{
    static void main(String[] args) {
        String book1 = "Java Basic";
        String book2 = "Python Intro";

        System.out.println("Truoc khi hoan doi: " + "Book1 = " + book1 + " ,Book2 = " + book2);
        String temp = book2;
        book2 = book1;
        book1 = temp;
        System.out.print("Sau khi hoan doi: " + "Book1 = " + book1 + " ,Book2 = " + book2);

    }
}