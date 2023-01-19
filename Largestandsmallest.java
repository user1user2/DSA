import java.util.Arrays;

public class Largestandsmallest {
    public static void main(String[] args) {
        int[] uarray = {1,4,2,3,6,8,9,1};
        Arrays.sort(uarray);
        System.out.println(uarray[0]+"  "+uarray[uarray.length-1]);
    }
    
}
