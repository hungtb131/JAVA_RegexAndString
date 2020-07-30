package BT_phonenumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneNumber checkPhoneNumber = new PhoneNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phone number: ");
        String regex = sc.nextLine();
        boolean isValid = checkPhoneNumber.validate(regex);
        System.out.println("Phone number: " + regex + " is valid " + isValid);
    }
}
