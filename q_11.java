import java.util.*;
public class q_11 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Write year : ");
        int n =sc.nextInt();
        if(n%4==0){
            if(n%100==0){
                if(n%400==0){
                    System.out.println("It's a leap year");
                }
            }
            else System.out.println("leap year");
        }
        else System.out.println("not a leap year");







    }
    
}
