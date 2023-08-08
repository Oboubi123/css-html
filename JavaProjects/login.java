import java.util.Scanner;

public class login {
    /**
     * @param args
     */
    public static void main(String[] args){
        String Fullname, email, password;
        Scanner in = new Scanner(System.in);

        System.out.println("Fullname: ");
        Fullname = in.nextLine();

        System.out.println("Email:");
        email = in.nextLine();

        System.out.println("Password:");
        password = in.nextLine();
        String Confirm;
        System.out.println("Confirm Password:");
        Confirm = in.nextLine();
        in.close();

        if(password.equals(Confirm)){
            System.out.println("Welcome " + Fullname + ", Login Successfull");
        }else{
            System.out.println("Wrong Password Retry.");
        }
    }
}
