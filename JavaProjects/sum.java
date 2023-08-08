import java.util.Scanner;
import java.util.ArrayList;
public class sum {
 public static void main(String[] args) {
     ArrayList<Integer> nums = new ArrayList<>(6);
     int sum = 0, L;
     Scanner in = new Scanner(System.in);
     System.out.println("Enter numbers to be squared:");
     L = in.nextInt();
    for (int i = 0; i < L; i++) {
        nums.add(in.nextInt());
    }
    for(int i = 0; i < nums.size(); i++){
        sum += nums.get(i) * nums.get(i);
    }
    System.out.println("The sum of squares of the array elements is " + sum);
    in.close();
   } 
}
