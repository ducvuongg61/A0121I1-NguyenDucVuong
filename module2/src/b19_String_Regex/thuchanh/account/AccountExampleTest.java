package b19_String_Regex.thuchanh.account;

public class AccountExampleTest {
    private static AccountExample accountExample;
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String acc :
                validAccount) {
            boolean isValid = accountExample.validate(acc);
            System.out.println("Account is " + acc + " is valid : " + isValid);
        }
        for (String acc :
                invalidAccount) {
            boolean isValid = accountExample.validate(acc);
            System.out.println("Account is " + acc + " is valid : " + isValid);
        }
    }
}
