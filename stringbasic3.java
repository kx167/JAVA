class stringbasic3{

    static void printeachchar(String str){
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
    static void counteachchar(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            count++;
        }
        System.out.println("total number of characters in string is:" + count);
    }   

    static int getlength(String str){
        char[] ch = str.toCharArray();
        int len = ch.length;
        return len;
    }
    static void countvowels(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                count++;
            }
        }
        System.out.println("total number of vowels in string is:" + count);
    }
    static String reverseString(String str){
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        return rev;
        
    }
    static boolean palindrome(String str){
        String original = str;
        String rev = reverseString(original);
        for(int i=0; i<original.length(); i++){
            char ch1 = original.charAt(i);
            char ch2 = rev.charAt(i);
            if(ch1 != ch2){

                return false;
            }
        }
        return true;
    }

    
    public static void main(String[] args){
        String str = "KISHAN";
        printeachchar(str);
        counteachchar(str);
        int len = getlength(str);
        System.out.println("length of the string is:" + len);
        countvowels(str);
        String rev = reverseString(str);
        System.out.println("reverse of the string is:" + rev);
       System.out.println("is the string palindrome? " + palindrome(str));
    }
}