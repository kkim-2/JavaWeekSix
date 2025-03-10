//Kailyn Kim 3/10/25 Test_2 

import java.util.*;

public class Test_2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value m: ");
        int m = input.nextInt();
        System.out.println("Enter the value n:");
        int n = input.nextInt();
        int sideOne =  ((m*m)-(n*n));
        int sideTwo = 2 * m * n;
        int hypoteneuse = (m*m) + (n*n);
        System.out.println("Side one: "+sideOne+" Side two: "+sideTwo+" Hypoteneuse: "+hypoteneuse);
        double cost = (2.412*sideOne) + (3.767*sideTwo)+(15.758*hypoteneuse);
        System.out.println("The cost is: $"+cost);
    }
}
