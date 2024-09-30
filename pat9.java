public class pat9 {
    public static void pat99(int n){
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){     //space
                System.out.print(" ");
            }
            for(int j =1;j<=(2*i)-1;j++)   //stars
            {
                System.out.print("*");
            }
            System.out.println();

        }                                       //2nd part
        for(int i=n;i>=1;i--){
            for(int s=n-i;s>=1;s--){     // space
                System.out.print(" ");
            }
            for(int j =(2*i)-1;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        pat99(4);
    }
    
}
