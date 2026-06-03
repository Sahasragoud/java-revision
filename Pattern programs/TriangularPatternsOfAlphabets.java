
class Main {
    public static void main(String[] args) {
        int n = 5;
        
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                System.out.print((char)(65 + j - 1) + " ");
            }
            System.out.println();
        }
        
        for(int i = n; i >= 0; i--){
            for(int j = 0 ; j < i; j++){
                System.out.print((char)(65 + i - 1) + " ");
            } 
            System.out.println();
        }
        
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print((char)(65 + j - 1) + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        for(int i = n; i > 0; i--){
            for(int j = i; j <= n; j++){
                System.out.print((char)(65 + j - 1) + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        for(int i = 1; i <= n; i++){
            for(int j = 1 ; j <= n - i + 1; j++){
                System.out.print((char)(65 + i - 1) + " ");
            } 
            System.out.println();
        }
        
        System.out.println();
        for(int i = 1; i <= n; i++){
            for(int j = i ; j >= 1 ; j--){
                System.out.print((char)(65 + j - 1) + " ");
            } 
            System.out.println();
        }
    }
}
