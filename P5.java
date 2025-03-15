/*Reverse the left and right numbers like
You must use only a loop
input  9
output 4 3 2 1 5 9 8 7 6

input 13
output 6 5 4 3 2 1 7 13 12 11 10 9 8
*/

import java.util.Scanner;

public class P5 {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int midpoint = num / 2;

        for (int i = midpoint; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.print(midpoint + 1 + " ");

        for (int i = num; i > midpoint + 1; i--) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}

/*
 * C:\Users\DELL\Desktop\E Commerce\Day-01>java P5
 * Enter a number: 9
 * 4 3 2 1 5 9 8 7 6
 * C:\Users\DELL\Desktop\E Commerce\Day-01>java P5
 * Enter a number: 13
 * 6 5 4 3 2 1 7 13 12 11 10 9 8
 */