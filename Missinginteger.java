public class Missinginteger {
    
    public static void main(String[] args) {
        
        int n = 10;
        int []a = {1,2,3,4,5,5,7,8,10};
        int []fa = new int[10];
        for(int i=0;i<a.length;i++){
            int num = a[i];
            if(fa[num-1] >0){
                fa[num-1]++;
            }else{
                fa[num-1]=1;
            }
        }
        
        for(int j=0;j<fa.length;j++){
            if(fa[j] <1){
                System.out.println(j+1);
            }
        }

    }
}
