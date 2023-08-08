public class count {
    public static void main(String[]args){
    int counter = 1;
    System.out.println("while-loop: Counting from 1 up to 100:");
    while(true){
        System.out.print(counter+",");
        counter++;
        if (counter==100)break;
    }
    int cnt=10;
    System.out.println("while-loop: Counting from 10 down to 0:");
    do{
        System.out.print(cnt+",");
        cnt--;
    }while(cnt>=0);
}
}

