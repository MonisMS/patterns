public class pat8 {
    public static void pat88(int n){
        for(int i=1;i<=n;i++){
            for (int s=1;s<=n-i;s++) {      ///har column ke liye hai ek row mein
                System.out.print(" ");
                
            }
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pat88(5);
        
    }
}
