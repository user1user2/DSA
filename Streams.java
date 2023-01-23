import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Streams
 */
public class Streams {

    public static void main(String []args){
        /*Streams : It is nota data structure, which is a piplined sequence of execution and no modification of the input taken from collections.
         * It just has to perform the opration and revert the result in stream .
         * 
         * Operation meathods in Stream methods are: map(),sorted(),filter()   and Terminal Oepratons are : forEach(),collect(),reduce().
         * 
         */

         List<Integer> data = Arrays.asList(1,2,3,4);
         List<Integer> result = data.stream().map(x -> x*x).collect(Collectors.toList());
         System.out.println(data+" After stream method "+result);

        //filter
         List<String> data1 = Arrays.asList("apple","bat","ball","Cat");
         List<String> result1 = data1.stream().filter(x -> x.startsWith("b")).collect(Collectors.toList());
         System.out.println(data1+"After the filter function"+result1);

         //sorted
         List<Character> data2 = Arrays.asList('a','b','d','g','e');
         List<Character> result2 = data2.stream().sorted().collect(Collectors.toList());
         System.out.println(data2+"Adter sort operation"+result2);

         //forEach
         List<Character> data3 = Arrays.asList('p','a','r','r','o','t');
         data3.stream().forEach(x -> System.out.println(x));

         //collect to set: no duplication accept in set
         List<Integer> data4 = Arrays.asList(1,2,4,3,2);
         Set<Integer> result4 = data4.stream().collect(Collectors.toSet());
         System.out.println(data4+ " After streams to SET the result :"+result4);


         



    }
}
