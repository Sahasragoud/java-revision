class PrintA {
    public static void main(String[] args) {
        int n = 5;
        int s = n/2;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= n/2; j++){
                if(i == 0 && j < s && j > 0 || i == s) System.out.print("*");
                else if(i != 0 && (j == 0 || j == s)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
