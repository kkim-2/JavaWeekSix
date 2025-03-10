//Kailyn Kim 3/10/25 Test_1

import java.util.*;

public class Test_1{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many poles do you need? ");
        int poles = input.nextInt();
        double concrete = (3.14*(1.5*1.5)) * 5;
        double totalConcrete = (poles * concrete) /27.0;
        double costConcrete = totalConcrete * 12.98;
        System.out.println("The total cost of concrete is: $"+costConcrete);
    }
}