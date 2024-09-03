public class getithbit{
    public static int getbit(int n,int i)
    {
        int bitmask=1<<i;
        if((n & bitmask)==0)
        {
            return 0;
        }
        else
        {

            return 1;
        }
    }
    public static int setithbit(int n,int i)
    {
        int bitmask=1<<i;
        int result=n|bitmask;
        return result;
    }
    public static int clearithbit(int n,int i)
    {
        int bitmask=1<<i;
        return (n & (~(bitmask)));
    }
    public static int updateithbit1(int n,int i,int newbit)
    {
        if (newbit==0)
        {
            return setithbit(n,i);
        }
        else{
            return clearithbit(n,i);
        }
    }
    public static int updateithbit2(int n,int i,int newbit)
    {
        int a=clearithbit(n,i);
        int b=newbit<<i;
        return a|b;
    }
    public static int clearibits(int n,int i)
    {
        int a=(~0)<<i;
        return n|a;
    } 
    public static int clearrangeofbits(int n,int i,int j)
    {
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n & bitmask;
    }
    public static  boolean ispowof2(int n)
    {
        return (n&(n-1))==0;

    }
    public static int countsetbits(int n)
    {
        int count =1;
        while(n>0)
        {
            if((n&1)!=0)
            {
                count++;
            }
        }
        n=n>>1;
        return count;
    }
    public static void main(String args[])
    {
        //int n=10;
        //int i=3;
        System.out.println(countsetbits(10));
    }
}