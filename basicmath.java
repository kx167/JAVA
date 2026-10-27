public class basicmath {
    static int digitsofnumber(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int result = digitsofnumber(12345);
        System.out.println("Number of digits: " + result);
    }
}