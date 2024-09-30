public class pat6 {
    public static void pat66(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){       //1st star
                System.out.print("*");

            }
            for(int s=1;s<=2*(n-i);s++){

                System.out.print(" ");     //SPACE
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");    //2nd star
            }
            System.out.println();
        }
                                                     //2nd part

        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){       //1st star
                System.out.print("*");

            }
            for(int s=2*(n-i);s>=1;s--){

                System.out.print(" ");     //SPACE
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");    //2nd star
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pat66(4);
    }
}
