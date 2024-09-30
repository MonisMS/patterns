public class pat1 {

public static void pat11(int row,int col){
    for(int i=1;i<=row;i++)       //outer loop
    {
        for(int j=1;j<=col;j++)        //inner loop
        {
            if(i==1||i==row||j==1||j==col) 
            {
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
       pat11(5, 5);

        
    }
}