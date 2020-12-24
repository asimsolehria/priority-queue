
package priqueue;

/**
 *
 * @author asim
 */
public class main 
{
    public static void main(String[] args) 
    {
        PriQueue obj=new PriQueue(10);
        
        int insertable=17;
        while (!obj.isFull()) 
        {
            obj.enqueue(insertable);
            insertable+=7;
        }      
        
        var arr=obj.getJobTime();
        int i=0;
        while (!obj.isEmpty())
        {
            System.out.println(obj.dequeue()+" pages are gonna take "+arr[i]+" seconds");
            i++;
        }
        
        

        

    }
}
