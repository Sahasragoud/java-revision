import java.util.*;
public class BoxPattern {
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int size = sc.nextInt();
    for(int row =1; row <= size; row++) {
        for (int col = 1;col <= size; col++){
            if ((row ==1) ||(row == size) || (col==1) || (col==size)){
                System.out.print("# ");
            } else {
                System.out.print(" ");
            }   }
            System.out.println("\n");
    }
  }  
}
