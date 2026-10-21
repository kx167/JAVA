class stringbasic2{
    public static void main(String[] args){
        String str = "kishan";
        System.out.println("ORIGINAL IS: " + str);
        System.out.println("length of string is:" + str.length());
        System.out.println("position of 3rd character is:" + str.charAt(2));
        String name = "KISHAN";
        System.out.println("name is:" + name);
        System.out.println("both string are equal or not:" + str.equals(name));
        System.out.println("both string are equal or not:(IGNORE ALL CASES)" + str.equalsIgnoreCase(name));
        String str1 = "";
        System.out.println("is string empty or not:" + str1.isEmpty());
        System.out.println("is string is blank or not:" + str1.isBlank());
        String str2 = "  ";
        System.out.println("is string is blank or not:" + str2.isBlank());
        System.out.println("is string is empty or not:" + str2.isEmpty());

    }
}