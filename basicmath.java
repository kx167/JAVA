public class basicmath {
    /*DIGITS OF NUMBER */
    static void digitsofnumber(int number) {
       while (number != 0){
        int digit = number % 10;
        System.out.println(digit);
        number = number / 10;
       }
    }
    public static void main(String[] args) {
        /*DIGITS OF NUMBER */
        int number = 12345;
        System.out.println("Digits of the number " + number + " are:");
        digitsofnumber(number);
    }
}