

package Thread;


public class W103 extends Thread
{

    public W103() {
    }
    

     public int totstudent=30;
    public void run1()
    {
       
        System.err.println("Class W103 started");
        try{
         
         int n=6000/totstudent;
        
        for(int i=1;i<=totstudent;i++)
        {
            System.out.println("Student "+i+" Entered Into Class W103");
        
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
            sta.startclass2("Kevin", "W103");
        }else{
            
        }
    }
     public int studentSitting() throws InterruptedException
    {
        int numsit=30;
        int j=0;
          W102 w2=new W102();
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