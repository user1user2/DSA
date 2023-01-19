import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        int []arr = {2,3,5,6,6,7,8,3,4};
        //Integer a[] = {new Integer(1),new Integer(2),new Integer(3),new Integer(4)};
        
        //ArrayList<Integer> out = new ArrayList<>(Arrays.asList(a));
        //Collections.addAll(alist, arr);
        HashMap<Integer,Integer> res = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            if(res.containsKey(arr[i])){
                int val = res.get(arr[i]);
                res.put(arr[i],val+1);
            }
            else{
                res.put(arr[i], 1);
            }
        }

        //How to iterate over keys and values in hashmap
        //Method1- bruteforce

        Set<Integer> mp = res.keySet();;
        for(Integer i : mp){
            if(res.get(i) > 1){
                System.out.println(i);

            }
        }



        
    }
    
}
