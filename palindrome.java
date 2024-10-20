public class palindrome {
    //to check palindrome
    public static void main(String[] args){
        String str1 = "123454321";
        // String str2 = "12345";
        //String reversestr1 = new StringBuilder(str1).reverse().toString();
        // String reversestr2 = new StringBuilder(str2).reverse().toString();
        // System.out.println(str1.equals(reversestr1));
        System.out.println(str1.equals(new StringBuilder(str1).reverse().toString()));

    }
}
