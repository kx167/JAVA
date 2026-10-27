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
            int digit = number % 10;
            count++;
            number = number / 10;
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
    public static void main(String[] args) {
        /*DIGITS OF NUMBER */
        int number = 12345;
       
        digitsofnumber(number);
        countdigits(number);
        sumofdigit(number);
    }
}