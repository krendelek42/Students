public class Account {
    String FIO;
    String dateBirth;
    String email;
    String password;
    boolean blocked = false;

    public Account(String FIO, String dateBirth, String email, String password, boolean blocked) {
        this.FIO = FIO;
        this.dateBirth = dateBirth;
        this.email = email;
        this.password = password;
        this.blocked = blocked;

    }
}
