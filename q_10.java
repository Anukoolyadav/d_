import java.util.*;

import javax.xml.transform.Source;
public class q_10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Write week no. : ");
        int n =sc.nextInt();
        switch(n){
            case 1  : {
                System.out.println("Monday");
                break;
            }
            case 2 : {
                System.out.println("Tuesday");
                break;
            }
            case 3 : {
                System.out.println("Wednesday");
                break;

            }
            case 4 :{
                System.out.println("Thrusday");
                break;
            }
            case 5 : {
                System.out.println("Friday");
                break;
            }
            case 6 :{
                System.out.println("Saturday");
                break;
            }
            case 7 : {
                System.out.println("Sunday");
                break;
            }
            default : {System.out.println("invalid");}
        }
    
    
    }
}
