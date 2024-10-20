public class replace{
  /*Tom is writing a secret message using a string of text (str). However, he accidentally mixed up two important characters (ch1 and ch2). Now, all instances of ch1 have turned into ch2, and ch2 have turned into ch1. Your mission is to help Tom by creating a function that will restore the original message. The function should take the string (str) along with the two characters (ch1 and ch2), and swap them back to their correct places so that the message is exactly as Tom intended it.

Example:

Input:

str: apples

ch1: a

ch2: p

Output:

paales

All the 'a' in the string is replaced with 'p'. And all the 'p's are replaced with 'a'. */
    public static void main(String[] args) {
        String replaced1 = replace1("pineapples",'a','p');
        System.out.println(replaced1);
    }
    public static String replace1(String str1,char ch1,char ch2){
        StringBuilder str1buiilder1 = new StringBuilder(str1);
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i) == ch1){     
              str1buiilder1.setCharAt(i, ch2);
            }
            else if(str1.charAt(i) == ch2){
              str1buiilder1.setCharAt(i, ch1);
            }
        }
        return str1buiilder1.toString();
    }
  }