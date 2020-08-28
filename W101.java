

package Thread;

import java.util.concurrent.TimeUnit;

public class W101 extends Thread{

    public W101() {
    }
    
    public void run() 
    {
        System.err.println("Class W101 started");
        Staff sta= new Staff();
        try{
         int totstudent=25;
        for(int i=1;i<=totstudent;i++)
        {
            System.out.println("Student "+i+" Entered Into Class");
             Thread.sleep(300);
        }
         sta.alex("W101");
            W101 w1=new W101();
            
         int totsitt=w1.studentSitting();
         if(totsitt==totstudent)
         {
             sta.startclass("alex", "W101");
         }else{
             
         }
    }catch(Exception e)
    {
        System.out.println(e);
    }
       
        
        
       
    }
    
    public int studentSitting() throws InterruptedException
    {
        int numsit=25;
        int j=0;
          W101 w1=new W101();
          Visitor vi=new Visitor();
        for(int i=0; i<numsit;i++)
        {
             System.out.println("Student "+i+" Seated");
            Thread t1=new Thread();
            t1.sleep(300);
            
           
            
            j++;
        }
        
        return j;
    }
    
}
