import java.util.HashSet;
public class remove_dups {
    //remove_dups from arraay
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,3,4,4,4,4,5} ;
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr){
            set.add(num);
        } 
        System.out.println(set);
    }
}