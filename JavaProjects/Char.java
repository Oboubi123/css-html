
public class Char {
    /**
     * @param args
     */
    public static void main(String[]args){
        int sum=0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                sum+= i +j;
            }
        }
       System.out.println("The sum is"+" "+sum);
  }
}
