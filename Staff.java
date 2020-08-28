
package Thread;


public class Staff extends Thread{

    public Staff() {
    }
    
    public void alex(String classname) throws InterruptedException
    {
        System.err.println("Staff Alex Entered into Class "+classname); 
        Thread t1=new Thread();
        t1.sleep(100);
    }
    
    public void tom(String classname) throws InterruptedException
    {
        System.err.println("Staff Tom Entered into Class "+classname); 
        Thread t1=new Thread();
        t1.sleep(100);
    }
    public void kevin(String classname) throws InterruptedException
    {
        System.err.println("Staff Kevin Entered into Class "+classname); 
        Thread t1=new Thread();
        t1.sleep(100);
    }
    public void arun(String classname) throws InterruptedException
    {
        System.err.println("Staff Arun Entered into Class "+classname); 
        Thread t1=new Thread();
        t1.sleep(100);
    }
    public void krishnan(String classname) throws InterruptedException
    {
        System.err.println("Staff krishnan Entered into Class "+classname); 
        Thread t1=new Thread();
        t1.sleep(100);
    }
    public void startclass(String staffname, String classname) throws InterruptedException
    {
        System.err.println("Staff "+staffname+" Started Class for "+classname);
        Thread.sleep(6000);
        Visitor vi=new Visitor();
        vi.visitW101(classname);
        
    }
     public void startclass1(String staffname, String classname) throws InterruptedException
    {
        System.err.println("Staff "+staffname+" Started Class for "+classname);
        Thread.sleep(6000);
        Visitor vi=new Visitor();
        vi.visitW102(classname);
        
    }
     public void startclass2(String staffname, String classname) throws InterruptedException
    {
        System.err.println("Staff "+staffname+" Started Class for "+classname);
        Thread.sleep(6000);
        Visitor vi=new Visitor();
        vi.visitW103(classname);
        
    }
     public void startclass4(String staffname, String classname) throws InterruptedException
    {
        System.err.println("Staff "+staffname+" Started Class for "+classname);
        Thread.sleep(6000);
        Visitor vi=new Visitor();
        vi.visitW201(classname);
        
    }
      public void startclass5(String staffname, String classname) throws InterruptedException
    {
        System.err.println("Staff "+staffname+" Started Class for "+classname);
        Thread.sleep(6000);
        Visitor vi=new Visitor();
        vi.visitW202(classname);
        
    }
}
