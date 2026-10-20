
class methw5 {

    static double calculatepercentage(int obtain, int total) {
        double per = obtain / total * 100;
        return per;
    }

    public static void main(String args[]) {

        double a = calculatepercentage(45, 50);
        System.out.println("a percentage is: " + a + "%");

        System.out.println("b percentage is:");
        System.out.println(calculatepercentage(30, 50) + "%");

        System.out.println("c percentage is:");
        System.out.println(calculatepercentage(25, 50) + "%");

        System.out.println("d percentage is:");
        System.out.println(calculatepercentage(50, 50) + "%");

        System.out.println("e percentage is:");
        System.out.println(calculatepercentage(0, 50) + "%");
    }
}
