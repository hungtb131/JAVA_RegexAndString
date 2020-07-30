package BT_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    public static void main(String[] args) {
    ClassName checkClassName = new ClassName();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter class name: ");
    String regex = sc.nextLine();
    boolean isValid = checkClassName.validate(regex);
    System.out.println("Class name: " + regex + " is valid " + isValid);
}

    private  static final String CLASSNAME_REGEX = "^[C,A,P][0-9]{4}[G,H,I,K,L,M]$";

    public void CheckClassName(){

    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

