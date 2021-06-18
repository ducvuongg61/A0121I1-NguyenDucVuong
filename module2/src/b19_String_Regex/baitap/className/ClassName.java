package b19_String_Regex.baitap.className;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    public static final String CLASSNAME_REGEX = "[CAP][0-9]{4}[G-M]";

    public ClassName() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
