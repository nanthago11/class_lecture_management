

package Thread;

import java.util.concurrent.TimeUnit;


public class W102 extends Thread{

    public W102() {
    }
     public int totstudent=30;
    public void run1()
    {
       
        System.err.println("Class W102 started");
        try{
         
         int n=6000/totstudent;
        
        for(int i=1;i<=totstudent;i++)
        {
            System.out.println("Student "+i+" Entered Into Class W102");
        
         Thread.sleep(n);
           
            
         
        }
        
    }catch(Exception e)
    {
        System.out.println(e);
    }
}
    public void settingcheck(int sit) throws InterruptedException
    {
        if(sit==totstudent)
        {
            Staff sta=new Staff();
            sta.startclass1("Tom", "W102");
        }else{
            
        }
    }
     public int studentSitting() throws InterruptedException
    {
        int numsit=30;
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
