// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SolidAndHollow {
    public static void main(String[] args) {
        int n = 5;
        
        System.out.println("Solid square: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("Hollow square: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j == 0 || j == n-1 || i == 0 || i == n-1) 
                        System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }    
    }
}
