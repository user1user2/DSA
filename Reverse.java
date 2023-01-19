import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "pqr";
        reverseString(s,"",s.length()-1); //2
        
    }

    private static void reverseString(String s,String res,int n) { //pqr,"",2 []

        if(s.length() != res.length()){
        
        char c = s.charAt(n); //2-r,1-q,0-p
        
        res=res+c; // "","r","rq","rqp"
       
        //System.out.println(res+" this end ");
        reverseString(s, res,n-1); //[pqr,r,1],[pqr,rq,0][pqr,rqp,-1]
        
        } else {
            System.out.println(res);
        }
}
    
}
