public class pat4 {
    public static void pat44(int n){
        int c=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pat44(5);
    }
    
}
