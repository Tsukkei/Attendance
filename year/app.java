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
