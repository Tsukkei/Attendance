// LEAP YEAR 1/1

import java.util.Scanner;

public class sample {

static Scanner scan = new Scanner(System.in); 
public static void main(String[] args){
try (Scanner scan = new Scanner(System.in)) {
    System.out.println("Input Year");
    int year = scan.nextInt();
    boolean a = (year % 4) == 0;
    boolean b = (year % 100) != 0;
    boolean c = ((year % 100 == 0) && (year % 400 ==0));
    if (a && (b|| c)){
        System.out.print(year + " is a leap year");
    }
    else {
        System.out.print(year + " is not a leap year");
    }
}
   
    }
}

// BASIC OPERATION 1/2

package attendance;

import java.util.Scanner;

public class Earl {
    
    static Scanner scan = new Scanner(System.in);



   public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("value of x: ");
        int x = scan.nextInt();
        System.out.println("value of y: ");
        int y = scan.nextInt();
        System.out.println("value of z: ");
        int z = scan.nextInt();
        
        
        int sum = x + y + z;
        double average = sum / 3;
        float product = x * y * z;
        
        System.out.println("Sum" + sum);
        System.out.println("average" + average);
        System.out.println("product" + product);
    }
}
