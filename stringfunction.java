class stringfunction {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        
        // Length of the string
        int length = str.length();
        System.out.println("Length: " + length);
        
        // Convert to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperStr);
        
        // Convert to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerStr);
        
        // Substring
        String substring = str.substring(7, 12);
        System.out.println("Substring: " + substring);
        
        // Replace characters
        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced String: " + replacedStr);
        
        // Check if string contains a substring
        boolean contains = str.contains("Hello");
        System.out.println("Contains 'Hello': " + contains);
        
        // Split the string
        String[] parts = str.split(", ");
        System.out.println("Split parts:");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}