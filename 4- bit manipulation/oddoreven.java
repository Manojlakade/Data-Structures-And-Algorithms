public class oddoreven{
    public static void oddoreven(int n){
        int a=1;
        if((n & a)==1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
    public static void main(String args[]){
        oddoreven(3);
        oddoreven(11);
        oddoreven(14);
        
    }
}