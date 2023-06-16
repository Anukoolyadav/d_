import java.util.*;
public class q_9 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Write your temp : ");
        double i =sc.nextDouble();
        String s=(i<100)?"no_fever":"fever";
        System.out.println("so "+s);
    }
    
}
