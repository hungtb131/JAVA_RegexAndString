package TH_String;

public class StringMethod {
    public static void main(String[] args) {
        String Str1 = "Hỡi anh tình yêu giống như cái chết";
        String Str2 = " nuốt trôi tất cả ";
        String Str3 = Str1.concat(Str2);
        System.out.println("Lenght off String " + Str1 + " is : " + Str1.length());
        System.out.println("Char at 1st index of String " + Str1 +" is : " + Str1.charAt(1));
        System.out.println("String 3 is :  " + Str3 );
    }
}
