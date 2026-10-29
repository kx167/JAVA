
public class basicmath {

    // 1. Print digits of a number
    // Example: 123 -> 3 2 1
    static void digitsOfNumber(int number) {

        if (number == 0) {
            System.out.println(0);
            return;
        }

        number = Math.abs(number);

        while (number != 0) {

            int digit = number % 10;

            System.out.println(digit);

            number = number / 10;
        }
    }


    // 2. Count digits of a number
    // Example: 12345 -> 5
    static int countDigits(int number) {

        number = Math.abs(number);

        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number != 0) {

            number = number / 10;

            count++;
        }

        return count;
    }


    // 3. Sum of digits
    // Example: 123 -> 6
    static int sumOfDigits(int number) {

        number = Math.abs(number);

        int sum = 0;

        while (number != 0) {

            int digit = number % 10;

            sum = sum + digit;

            number = number / 10;
        }

        return sum;
    }


    // 4. Reverse a number
    // Example: 123 -> 321
    static long reverseNumber(int number) {

        long reverse = 0;

        while (number != 0) {

            int digit = number % 10;

            reverse = reverse * 10 + digit;

            number = number / 10;
        }

        return reverse;
    }


    // 5. Check palindrome number
    // Example: 121 -> true
    static boolean isPalindrome(int number) {

        if (number < 0) {
            return false;
        }

        int original = number;

        long reverse = reverseNumber(number);

        return original == reverse;
    }


    // 6. Check even or odd
    // Example: 10 -> true
    static boolean isEven(int number) {

        return number % 2 == 0;
    }


    // 7. Check prime number
    // Example: 7 -> true
    static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / i; i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }


    // 8. Find GCD
    // Example: GCD(48, 18) -> 6
    static long getGCD(long a, long b) {

        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {

            long temp = b;

            b = a % b;

            a = temp;
        }

        return a;
    }


    // 9. Find LCM
    // Example: LCM(48, 18) -> 144
    static long getLCM(long a, long b) {

        if (a == 0 || b == 0) {
            return 0;
        }

        long gcd = getGCD(a, b);

        return Math.abs((a / gcd) * b);
    }


    // 10. Check Armstrong number
    // Example: 153 -> true
    static boolean isArmstrong(int number) {

        if (number < 0) {
            return false;
        }

        int originalNumber = number;

        int digits = countDigits(number);

        long sum = 0;

        while (number != 0) {

            int digit = number % 10;

            long power = 1;

            // Calculate digit raised to the number of digits
            for (int i = 0; i < digits; i++) {

                power = power * digit;
            }

            sum = sum + power;

            number = number / 10;
        }

        return sum == originalNumber;
    }


    // 11. Check Perfect Number
    // Example: 28 -> true
    static boolean checkPerfectNumber(int number) {

        if (number <= 1) {
            return false;
        }

        int sum = 1;

        for (int i = 2; i <= number / i; i++) {

            if (number % i == 0) {

                int firstFactor = i;
                int secondFactor = number / i;

                sum = sum + firstFactor;

                // Avoid adding the same factor twice
                if (firstFactor != secondFactor) {

                    sum = sum + secondFactor;
                }
            }
        }

        return sum == number;
    }

    // 12. Print all prime numbers from 1 to n
// Example: 20 -> 2 3 5 7 11 13 17 19
static void printPrimeNumbers(int number) {

    System.out.println("Prime numbers from 1 to " + number + ":");

    for (int i = 2; i <= number; i++) {

        if (isPrime(i)) {

            System.out.print(i + " ");
        }
    }

    System.out.println();
}


    // Main method
    public static void main(String[] args) {

        int number = 99799;


        // Digits of number
        System.out.println("Digits of number:");

        digitsOfNumber(number);


        // Count digits
        System.out.println(
            "Number of digits: " + countDigits(number)
        );


        // Sum of digits
        System.out.println(
            "Sum of digits: " + sumOfDigits(number)
        );


        // Reverse number
        System.out.println(
            "Reverse of number: " + reverseNumber(number)
        );


        // Palindrome
        if (isPalindrome(number)) {

            System.out.println("The number is a palindrome.");

        } else {

            System.out.println("The number is not a palindrome.");
        }


        // Even or odd
        if (isEven(number)) {

            System.out.println("The number is even.");

        } else {

            System.out.println("The number is odd.");
        }


        // Prime
        if (isPrime(number)) {

            System.out.println("The number is prime.");

        } else {

            System.out.println("The number is not prime.");
        }


        // GCD
        long gcd = getGCD(48, 18);

        System.out.println("GCD of 48 and 18 is: " + gcd);


        // LCM
        long lcm = getLCM(48, 18);

        System.out.println("LCM of 48 and 18 is: " + lcm);


        // Armstrong
        if (isArmstrong(number)) {

            System.out.println("The number is Armstrong.");

        } else {

            System.out.println("The number is not Armstrong.");
        }


        // Perfect Number
        if (checkPerfectNumber(number)) {

            System.out.println("The number is a perfect number.");

        } else {

            System.out.println("The number is not a perfect number.");
        }

        // Print all prime numbers
printPrimeNumbers(7);
    }
}
