package b19_String_Regex.baitap.className;

public class ClassNameTest {
    private static ClassName className;
    private static final String[] validClassName = new String[]{"A01CP","B0023P"};
    private static final String[] invalidClassName = new String[]{"C0318G"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String classNameCheck :
                validClassName) {
            boolean isValid = className.validate(classNameCheck);
            System.out.println("ClassName " + classNameCheck + " is valid : " + isValid);
        }
        for (String classNameCheck :
                invalidClassName) {
            boolean isValid = className.validate(classNameCheck);
            System.out.println("ClassName " + classNameCheck + " is valid : " + isValid);
        }
    }
}
