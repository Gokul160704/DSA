public class Largest_elemnent {
    public static void main(String[] args) {
        int[] arr1 = {-9,-2} ;
        int large = arr1[0] ; 
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>large){
                large = arr1[i];
            }
        }
        System.out.println(large);
    }
}
