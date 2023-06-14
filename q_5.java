import java.util.*;
public class q_5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int even_sum =0;
        int odd_sum =0;
        int c;
       
        do {
            System.out.print("Write your no. : ");
            int n =sc.nextInt();
            if(n%2==0){
                System.out.println("EVEN");
                even_sum+=n;
            }
            else{
                System.out.println("ODD");
                odd_sum+=n;
            }
            System.out.println("Waana continue ? yes==1 , no==0");
            c =sc.nextInt();

        }while(c ==1);
        System.out.println("even sum is : "+even_sum);
        System.out.println("odd sum is : "+odd_sum);
    }
    
}
