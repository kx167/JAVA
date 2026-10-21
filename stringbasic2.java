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
        String trim = "  kishan  "; 
        System.out.println("ORIGINAL IS: " + trim);
        System.out.println("length of string is:" + trim.length());
        System.out.println("AFTER TRIM IS: " + trim.trim());
        System.out.println("length of string is:" + trim.trim().length());
        System.out.println("original string is:" + str);
        System.out.println("kishan in to upper case is:" + str.toUpperCase());
        System.out.println("original string is:" + name);
        System.out.println("KISHAN in to lower case is:" + name.toLowerCase());

        String paragraph = "my name is kishan. i am from india. i am a student.";
        System.out.println("original paragraph is:" + paragraph);
        System.out.println("substring from 11th position to 17th position is:" + paragraph.substring(11,17));

        System.out.println("is there kishan is contained in paragraph or not:" + paragraph.contains("kishan"));
         System.out.println("is there kishan... is contained in paragraph or not:" + paragraph.contains("kishan..."));

         int num = 1607;
         String nmt = String.valueOf(num);
         System.out.println("integer to string is:" + nmt);
         System.out.println("when +1 include in num(integer): " + (num + 1));
         System.out.println("when +1 include in nmt(string): " + (nmt + 1));

         System.out.println("check paragraph starts with my or not:" + paragraph.startsWith("my"));
            System.out.println("check paragraph ends with student. or not:" + paragraph.endsWith("student."));
            System.out.println("check paragraph ends with student or not:" + paragraph.endsWith("student"));
            System.out.println("check paragraph starts with kishan or not:" + paragraph.startsWith("kishan"));


    }
}