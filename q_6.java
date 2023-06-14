import java.util.*;
public class q_6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int factorial =1;
        int x;
        while (n>1) {
            x=n*(n-1);
            factorial*=x;
            n-=2;

        }
        System.out.println("Factorial is : "+factorial);
    }
    
}
