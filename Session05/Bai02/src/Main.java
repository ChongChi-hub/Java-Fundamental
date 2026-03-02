public class Main {
    static void main(String[] args) {
        Account acc1 = new Account("Account 1", "1", "1@gmail.com");
        Account acc2 = new Account("Account 2", "2", "2@gmail.com");

        System.out.println("Truoc khi doi mat khau");
        acc1.displayAccount();
        acc2.displayAccount();
        System.out.println("Sau khi doi mat khau");
        acc1.changePassword("Moi doi mat khau 1");
        acc2.changePassword("Moi doi mat khau 2");
        acc1.displayAccount();
        acc2.displayAccount();
    }
}