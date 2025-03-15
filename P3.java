
//print the numbers in reverse
import java.util.Scanner;

public class P3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        int start = Math.max(num1, num2);
        int end = Math.min(num1, num2);

        for (int i = start; i >= end; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}

/*
 * C:\Users\DELL\Desktop\E Commerce\Day-01>java P3
 * Enter the first number :
 * 5
 * Enter the second number :
 * 9
 * 9
 * 8
 * 7
 * 6
 * 5
 */