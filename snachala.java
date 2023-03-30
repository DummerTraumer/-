import java.util.Scanner;
import java.util.InputMismatchException;
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
            throw new InputMismatchException("Неверный формат данных");
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int res = 0;
        char op;
        boolean resaut = false;
        boolean r = false; 
        String as, bs;
        while(!resaut){
            System.out.println("Введите первое число");
            as = sc.next();
            a= romanToNumber(as);
            if (a == -1) {
            a = Integer.parseInt (as);
            r = true;
            }
            if (a<0 || a >10) {
               System.out.println("Исключение! Число не соответствует заданному дапазону");
               continue;
            }
             System.out.println("Введите второе число");
            bs = sc.next();
            b= romanToNumber(bs);
            if (b == -1 && r == true) {
            b = Integer.parseInt (bs);
            }
            else 
            {
                System.out.println("Исключение! Числа находятся в разных системах исчесления");
                continue;
             }
                if (b<0 || b>10) {
                    System.out.println("Исключение! Число не соответствует заданному дапазону");
                       continue;
            }
            if (b != -1 && r == false) {
                b = Integer.parseInt (bs);
                }
                else 
                {
                    System.out.println("Исключение! Числа находятся в разных системах исчесления");
                    continue;
                 }
                    if (b<0 || b>10) {
                        System.out.println("Исключение! Число не соответствует заданному дапазону");
                           continue;
                }
            System.out.print("Введите одну из (+, -, *, /): ");
                op = sc.next(".").charAt(0);
            if (op == '+'){
                res = a + b;
            }
            else if (op == '-') {
                res = a - b;
            }
            else if (op == '*') {
                res = a * b;
            }
            else if (op == '/') {
                res = a / b;
            }
            else {
                System.out.println("Исключение! Знак не соответствует заданному дапазону"); 
                    continue;
            }
            if (r == false) {
                System.out.println(convertNumToRoman(res));
            }
            else{
            System.out.println((res));
            }
            resaut = true;
        }
        }
}