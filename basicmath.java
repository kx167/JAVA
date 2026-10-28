public class basicmath {
    /*DIGITS OF NUMBER */
    static void digitsofnumber(int number) {
       while (number != 0){
        int digit = number % 10;
        System.out.println(digit);
        number = number / 10;
       }
    }
    static void countdigits(int number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
           
        }
       System.out.println("Number of digits: " + count);
    }
    static void sumofdigit(int number){
        int sum=0;
        while(number !=0 ){
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
            
        }
        System.out.println("Sum of digits: " + sum);
    }
    static void reverseofnumber(int number){
        int reverse = 0;
        while(number != 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reverse of number: " + reverse);
    }
    static void palindrome(int number){
        int original = number;
        int reverse = 0;
        while(number != 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        if(original == reverse){
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }

    static int evenodd(int number){
        if(number % 2 == 0){
            System.out.println("the number is even");
        } else {
            System.out.println("the number is odd");
        }
        return number;
    }
    static boolean isPrime(int number) {

    if (number <= 1) {
        return false;
    }

    for (int i = 2; i * i <= number; i++) {

        if (number % i == 0) {
            return false;
        }
    }

    return true;
}
    
    public static void main(String[] args) {
        /*DIGITS OF NUMBER */
        int number = 7;
       
        digitsofnumber(number);
        countdigits(number);
        sumofdigit(number);
        reverseofnumber(number);
        palindrome(number);
        evenodd(number);
        if (isPrime(number)) {
        System.out.println("The number is prime.");
    } else {
        System.out.println("The number is not prime.");
    }

    }
}