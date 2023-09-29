public class CredentialsValidator {
    public static void main(String[] args) {
        String username = "john_doe";
        String password = "P@ssw0rd";

        if (isValidUsername(username) && isValidPassword(password)) {
            System.out.println("Credentials are valid.");
        } else {
            System.out.println("Credentials are not valid.");
        }
    }

    public static boolean isValidUsername(String username) {
        return username.length() >= 6 && !username.contains(" ");
    }

    public static boolean isValidPassword(String password) {
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*")
                && password.matches(".*[@#$%^&+=].*");
    }
}
