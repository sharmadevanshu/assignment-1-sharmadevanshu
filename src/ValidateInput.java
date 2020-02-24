import java.util.regex.Pattern;

public class ValidateInput {
    public boolean phoneNumber(String phone) {
        String pattern = "^(\\+91|0)?[6-9]{1}[0-9]{9}$";
        return Pattern.matches(pattern, phone);
    }

    public boolean email(String mail) {
        String pattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return Pattern.matches(pattern, mail);
    }
}