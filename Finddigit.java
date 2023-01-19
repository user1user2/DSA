public class Finddigit {
    public static void main(String[] args) {

        //How do you check if a string contains only digits?
        String  s = "1288";
        char []c = s.toCharArray();
        boolean flag = false;
        for(int i=0;i<c.length;i++){
            if(!Character.isDigit(c[i])){
                flag = true;
                break;

            }
            
            
        }
        if(flag){
            System.out.println("Charecters exists");
        }
    }
}
