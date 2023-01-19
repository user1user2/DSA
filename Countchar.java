import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
  * Countchar
  */
 public class Countchar {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char[] c = s.toCharArray();

        HashMap<Character,Integer>  o = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(o.containsKey(c[i])){
                int val = o.get(c[i]);
                o.put(c[i] , o.get(c[i])+1);
            }
            else{
                o.put(c[i],1);
            }


        }

        //Using KeySet();

        Set<Character> cs = o.keySet();
        int max = 0; 
        char cha = '\0';
        for( char  ch : cs ){
            int val = o.get(ch);
            if(val > max){ max = val; cha = ch;}

            

        }
        System.out.println(cha + " ---" + max);
        

        //Using EntrySet()

        //using values

        Collection<Integer> val = o.values();
        System.out.println(val);

        for(Integer i : val){
            System.out.println(i);
          
        }

        
    }
 }