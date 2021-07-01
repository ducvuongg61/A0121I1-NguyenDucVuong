package THI.writeCSV;

import THI.exception.NameException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static final String SERVICE_NAME_REGEX = "[A-Z][a-z]*";

    private static Pattern pattern;
    private static Matcher matcher;
    public static boolean isValidRegex(String str, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(str);

        boolean flag = matcher.matches();
        if (!flag) {
            System.out.println("Input not matching " + regex);
        }
        return flag;
    }

    public static void isValidName(String fullName) throws NameException {
        String[] fullNameElements = fullName.split(" ");
        for (String element : fullNameElements) {
            if (Character.isLowerCase(element.charAt(0))) {
                throw new NameException();
            }
        }
    }
}

