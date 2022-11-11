//package project_24;
public class minval
{
    public static void main(String[] args) 
    {
        Integer num[]={1,6,5,4,12,53,9,10};
        java s=new java();
        s.min(num);                                                                                                       
    }
}
class java
{
    < T extends Comparable<T>> void min(T[]y)
    {
        T min;
        min=y[0];
        for(int i=1;i<y.length;i++ )
        {
            if(min.compareTo(y[i])>0)
            {
                min=y[i];
            }
        }
        System.out.println("The minimum value in the given list is : "+min);
    }
}