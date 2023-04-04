import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Objects;
public class snachala {
    private static String convertNumToRoman (int numArabian) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        final String s = roman[numArabian];
        return s;
        
    }
    private static int romanToNumber (String roman) {
        try {
            if (roman.equals("I")) {
                return 1;
            } else if (roman.equals("II")) {
                return 2;
            } else if (roman.equals("III")) {
                return 3;
            } else if (roman.equals("IV")) {
                return 4;
            } else if (roman.equals("V")) {
                return 5;
            } else if (roman.equals("VI")) {
                return 6;
            } else if (roman.equals("VII")) {
                return 7;
            } else if (roman.equals("VIII")) {
                return 8;
            } else if (roman.equals("IX")) {
                return 9;
            } else if (roman.equals("X")) {
                return 10;
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Invalid data format");
        }
        return -1;
    }
    public static String calc(String input){
        int a, b;
        int res = 0;
        String op;
        boolean resaut = false;
        boolean r = false; 
        String as,bs;
        String []arr=input.split(" ");
        if (arr.length != 3){
            System.out.println("The example is entered incorrectly. Enter in the format \"a sign b\"");
            System.exit(0);
        }
        op=arr[1];
        as=arr[0];
        bs=arr[2];

            a= romanToNumber(as);
            if (a == -1) {
            a = Integer.parseInt (as);
            r = true;
            }
            if (a<0 || a >10) {
               System.out.println("An exception! The number does not match the specified range");
               System.exit(0);
            }
            b= romanToNumber(bs);

            if (b == -1 && r == true) {
                b = Integer.parseInt (bs);
                }
                else if(r==true||b==-1)
                {
                    System.out.println("An exception! The numbers are in different calculus systems");
                    System.exit(0);
                 }
                    if (b<0 || b>10) {
                        System.out.println("An exception! The number does not match the specified range");
                        System.exit(0);
                }
            if (Objects.equals(op, new String("+"))){
                res = a + b;
            }
            else if (Objects.equals(op, new String("-"))) {
                res = a - b;
            }
            else if (Objects.equals(op, new String("*"))) {
                res = a * b;
            }
            else if (Objects.equals(op, new String("/"))) {
                res = a / b;
            }
            else {
                System.out.println("An exception! The sign does not correspond to the specified range"); 
                System. exit(0);
            }
            if (r == false) {
                if (res<0)
                 {
                    System.out.println("An exception! The value of Roman numerals cannot be less than zero"); 
                    System. exit(0);
                    }
                    return (convertNumToRoman(res));
            }
            else{
            return Integer.toString(res);
            }


    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int res = 0;
        String op;
        boolean resaut = false;
        boolean r = false; 
        String as,bs;
        if(args.length==3){
            op=args[1];
            as=args[0];
            bs=args[2];
            System.out.println(calc(as + " "+ op +" " + bs));
        }
        else{

            System.out.println("Enter an example");
            System.out.println(calc(sc.nextLine()));
        }
 
   
        }
}