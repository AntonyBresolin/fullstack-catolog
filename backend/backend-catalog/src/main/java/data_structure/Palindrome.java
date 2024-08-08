package data_structure;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(11111));
        System.out.println(isPalindrome(1111));
        System.out.println(isPalindrome(11111111));
        System.out.println(isPalindrome(11111112));


    }
   public static boolean isPalindrome(int x) {
       String number = String.valueOf(x);
       for (int i = 0; i < number.length() / 2; i++) {
           if (number.charAt(i) != number.charAt(number.length() - 1 - i)) {
               return false;
           }
       }
       return true;
   }

   public static boolean isPalindrome2(int x) {
       String number = String.valueOf(x);
       return number.equals(new StringBuilder(number).reverse().toString());
   }

    public static boolean isPalindrome3(int x) {
         int reversed = 0;
         int original = x;
         while (x > 0) {
              reversed = reversed * 10 + x % 10;
              x /= 10;
         }
         return original == reversed;
    }

    public static boolean isPalindrome4(int x) {
        if (x < 0) {
            return false;
        }
        int reversed = 0;
        int original = x;
        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return original == reversed;
    }

    public static boolean isPalindrome5(int x) {
        if (x < 0) {
            return false;
        }
        int reversed = 0;
        int original = x;
        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return original == reversed;
    }
}
