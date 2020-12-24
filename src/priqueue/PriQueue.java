
package priqueue;

/**
 *
 * @author asim
 */
public class PriQueue 
{
    int noOfElements;
    int arr[];
    int size;

    public PriQueue(int s) 
    {
        size=s;
        arr=new int[size];
        noOfElements=0;
    }
    
    public void enqueue(int val)
    {
        int j;
        if(noOfElements==0)
            arr[noOfElements++]=val;
        else
        {
            for ( j = noOfElements-1; j >=0; j--)
            {
                if(val<arr[j])
                    arr[j+1]=arr[j];
                else
                    break;
            }
            
            arr[j+1]=val;
            noOfElements++;
        }
    }
    
    
    public int dequeue()
    {
        return arr[--noOfElements];
    }
    
    public boolean isFull()
    {
        return noOfElements==size;
    }
    
    public boolean isEmpty()
    {
        return noOfElements==0;
    }
    
    public int[] getJobTime()
    {
        int times[]=new int[size];
        
        for (int i =0; i<size; i++) 
        {
            for (int j = size-1-i; j >=0; j--) 
            {
                times[i]+=arr[j]*60;
            }
        }
        return times;
    }
            
    
}
