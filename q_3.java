import java.util.*;
public class q_3 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("cost of pencil : ");
        float a = sc.nextFloat();
        System.out.print("cost of pen : ");
        float b =sc.nextFloat();
        System.out.print("cost of notebook : ");
        float c=sc.nextFloat();
        float total = a+b+c;
        float gst= (total)*(0.18f);
        
        
        float t_total=total +gst;
        System.out.println("total is : "+total);
        System.out.println("gst(18%) : "+gst);
        System.out.println("t_total = total + gst = "+t_total);

    }
    
}
