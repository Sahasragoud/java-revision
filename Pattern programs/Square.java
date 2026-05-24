//Write a program to print the following square pattern of side length n:
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in); 
     System.out.print("Enter a number : ");
     int n = sc.nextInt();
        for(int i =1;i <= n;i++) {
            for(int j =1;j <= n;j++) {
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
}