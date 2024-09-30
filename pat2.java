public class pat2 {
    public static void pat22(int n){
        for(int i=1;i<=n;i++){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");}
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pat22(4);
    }
}
