public class Account {
    private String username;
    private String password;
    private String email;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void changePassword(String newPassword){
        this.password = newPassword;
    }

    public void displayAccount(){
        System.out.println("-----------------------");
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }
}
