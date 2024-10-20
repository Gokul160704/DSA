public class secondHighestElement {
    /*Alice has an array 'B' and she wants to figure out how many times the second highest element appears in it. Your task is to help her by returning an integer that represents the number of occurrences of this second highest element in the array.

Note:

If the array consists of identical elements, return 0. - The array is sorted and contains consecutive elements.

Input:

8

12344555

@codinginpy

Output:

2 */
    public static void main(String[] args) {
        int[] ip= {1,2,3,4,4,5,5,5};
        int sHE = secondHighestEleCount(ip);
        System.out.println(sHE);
    }
    public static int secondHighestEleCount(int[] numbers){
       int highest = numbers[numbers.length-1];
       int secondHighestElement=0;
       int count=0;
       for(int i=numbers.length-2;i>=0;i--){
            if(numbers[i]<highest){
                secondHighestElement=numbers[i];
                break;
            }
       }
       for(int i=0;i<numbers.length;i++){
            if(secondHighestElement == numbers[i]){
               count += 1;
            }
        }
        return count;
    }
}
