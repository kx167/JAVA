
class stringfunction {
    public static void main(String[] args) {

        String str1 = "Hello, World!";
        String str2 = "Hello, Java!";
        String str3 = "   Java Programming   ";
        String str4 = "";
        String str5 = "Hello";

        // 1. LENGTH
        System.out.println("Length: " + str1.length());

        // 2. UPPERCASE AND LOWERCASE
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());

        // 3. CHAR AT
        System.out.println("Character at index 0: " + str1.charAt(0));

        // 4. SUBSTRING
        System.out.println("Substring: " + str1.substring(7));
        System.out.println("Substring (start, end): " + str1.substring(7, 12));

        // 5. EQUALS
        System.out.println("Equals: " + str1.equals(str2));
        System.out.println("Equals: " + str1.equals(str5));

        // 6. EQUALS IGNORE CASE
        System.out.println("Ignore case: " + str5.equalsIgnoreCase("HELLO"));

        // 7. COMPARE TO
        System.out.println("Compare: " + str5.compareTo("Hello"));
        System.out.println("Compare ignore case: " + str5.compareToIgnoreCase("hello"));

        // 8. CONTAINS
        System.out.println("Contains: " + str1.contains("World"));

        // 9. STARTS WITH AND ENDS WITH
        System.out.println("Starts with: " + str1.startsWith("Hello"));
        System.out.println("Ends with: " + str1.endsWith("!"));

        // 10. INDEX OF
        System.out.println("Index of 'o': " + str1.indexOf('o'));
        System.out.println("Last index of 'o': " + str1.lastIndexOf('o'));
        System.out.println("Index of World: " + str1.indexOf("World"));
        System.out.println("Missing character: " + str1.indexOf('z'));

        // 11. REPLACE
        System.out.println("Replace: " + str1.replace("World", "Java"));
        System.out.println("Replace character: " + str1.replace('l', 'x'));
        System.out.println("Replace first: " +
                str1.replaceFirst("l", "X"));
        System.out.println("Replace all: " +
                str1.replaceAll("l", "X"));

        // 12. TRIM AND STRIP
        System.out.println("Trim: [" + str3.trim() + "]");
        System.out.println("Strip: [" + str3.strip() + "]");
        System.out.println("Strip leading: [" + str3.stripLeading() + "]");
        System.out.println("Strip trailing: [" + str3.stripTrailing() + "]");

        // 13. IS EMPTY AND IS BLANK
        System.out.println("Is empty: " + str4.isEmpty());
        System.out.println("Is blank: " + "   ".isBlank());
        System.out.println("Is str1 empty: " + str1.isEmpty());

        // 14. CONCAT
        System.out.println("Concat: " + str5.concat(" World"));
        System.out.println("Using + operator: " + str5 + " Java");

        // 15. SPLIT
        String[] parts = str1.split(", ");
        System.out.println("Split result:");
        for (String part : parts) {
            System.out.println(part);
        }

        // 16. TO CHAR ARRAY
        char[] chars = str5.toCharArray();
        System.out.println("Character array:");
        for (char ch : chars) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // 17. VALUE OF
        int num = 100;
        double decimal = 10.5;
        System.out.println("Integer to String: " + String.valueOf(num));
        System.out.println("Double to String: " + String.valueOf(decimal));

        // 18. JOIN
        System.out.println("Join: " + String.join("-", "Java", "Python", "SQL"));

        // 19. REPEAT (Java 11+)
        System.out.println("Repeat: " + "Hi ".repeat(3));

        // 20. FORMAT
        String name = "Kishan";
        int age = 22;
        System.out.println(String.format("Name: %s, Age: %d", name, age));

        // 21. CONTENTS EQUALS
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Content equals: " + str5.contentEquals(sb));

        // 22. REGION MATCHES
        System.out.println("Region matches: " +
                str1.regionMatches(7, "World", 0, 5));

        // 23. MATCHES (REGEX)
        System.out.println("Matches letters: " + "Java".matches("[A-Za-z]+"));
        System.out.println("Matches digits: " + "12345".matches("\\d+"));

        // 24. INTERN
        String s1 = new String("Java");
        String s2 = s1.intern();
        System.out.println("Intern: " + (s2 == "Java"));

        // 25. GET BYTES
        byte[] bytes = str5.getBytes();
        System.out.println("Byte array length: " + bytes.length);

        // 26. CODE POINT
        System.out.println("Code point at index 0: " +
                str1.codePointAt(0));
        System.out.println("Code point before index 1: " +
                str1.codePointBefore(1));
        System.out.println("Code point count: " +
                str1.codePointCount(0, str1.length()));
        System.out.println("Offset by code points: " +
                str1.offsetByCodePoints(0, 3));

        // 27. CONTENTS EQUALS IGNORE CASE (using comparison)
        System.out.println("Ignore-case comparison: " +
                str1.equalsIgnoreCase("HELLO, WORLD!"));

        // 28. HASH CODE
        System.out.println("Hash code: " + str1.hashCode());

        // 29. STRING BUILDER / IMMUTABILITY
        String original = "Java";
        String changed = original.concat(" Programming");
        System.out.println("Original: " + original);
        System.out.println("Changed: " + changed);

        // 30. NULL CHECK (safe comparison)
        String nullString = null;
        System.out.println("Null check: " + (nullString == null));
        System.out.println("Safe equality: " + "Java".equals(nullString));
    }
}
