
class BinaryNumberTrianglePattern {
    public static void main(String[] args) {
        
        int n = 5;
        int val = 1;
        
        for(int i = 1; i <= n; i++){
            if (i % 2 == 0) val = 0;
            else val = 1;
            for(int j = 1; j <= i; j++){
                if(val == 1) {
                        System.out.print(1 + " ");
                        val = 0;
                }else{
                    System.out.print(0 + " ");
                    val = 1;
                }
            }
            System.out.println();
        }
    }
}
