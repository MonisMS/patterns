public class pat7 {
    public static void pat66(int n){
        for(int i=1;i<=n;i++){
            for (int s=1;s<=n-i;s++) {      ///har column ke liye hai ek row mein
                System.out.print(" ");
                
            }
            for(int j=1;j<=n;j++){
                System.err.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pat66(5);
        
    }
}
