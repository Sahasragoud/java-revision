// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HollowRectangle {
    public static void main(String[] args) {
        int n = 6;
        int m = 20;
        
        System.out.println("Hollow Rectangle: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(j == 0 || j == m-1 || i == 0 || i == n-1) 
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }    
    }
}
