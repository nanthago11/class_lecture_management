
package Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Visitor  extends Thread{

    public Visitor() {
    }
    
   
   public void visitW101(String classname) throws InterruptedException
   {
       System.err.println("Visitor Visiting Class "+classname);
       W102 w2=new W102();
       w2.run1();
       Thread.sleep(1000);
       System.err.println("Visitor Exit Class "+classname);
       System.err.println("Class is Continue.....on"+classname );
       Thread.sleep(1000);
        System.err.println("Class Is On Going on "+classname);
        Staff sta=new Staff();
        sta.tom("W102");
        int j=w2.studentSitting();
        w2.settingcheck(j);
        
        
        
   }
    public void visitW102(String classname) throws InterruptedException
   {
       System.err.println("Visitor Visiting Class "+classname);
       W103 w3=new W103();
       w3.run1();
       Thread.sleep(1000);
       System.err.println("Visitor Exit Class "+classname);
       System.err.println("Class is Continue.....on"+classname );
       Thread.sleep(1000);
       System.err.println("Class W101 is Finished");
        System.err.println("Class Is On Going on "+classname);
        Staff sta=new Staff();
        sta.kevin("W103");
        int j=w3.studentSitting();
        w3.settingcheck(j);
        
        
        
   }
     public void visitW103(String classname) throws InterruptedException
   {
       System.err.println("Visitor Visiting Class "+classname);
       W201 w21=new W201();
       w21.run1();
       Thread.sleep(1000);
       System.err.println("Visitor Exit Class "+classname);
       System.err.println("Class is Continue.....on"+classname );
       Thread.sleep(1000);
       System.err.println("Class W102 is Finished");
        System.err.println("Class Is On Going on "+classname);
        Staff sta=new Staff();
        sta.arun("W201");
        int j=w21.studentSitting();
        w21.settingcheck(j);
        
        
        
   }
     public void visitW201(String classname) throws InterruptedException
   {
       System.err.println("Visitor Visiting Class "+classname);
       W202 w22=new W202();
       w22.run1();
       Thread.sleep(1000);
       System.err.println("Visitor Exit Class "+classname);
       System.err.println("Class is Continue.....on"+classname );
       Thread.sleep(1000);
       System.err.println("Class W103 is Finished");
        System.err.println("Class Is On Going on "+classname);
        Staff sta=new Staff();
        sta.krishnan("W202");
        int j=w22.studentSitting();
        w22.settingcheck(j);
        
        
        
   }
     public void visitW202(String classname) throws InterruptedException
   {
       System.err.println("Visitor Visiting Class "+classname);
       W202 w22=new W202();
      Thread.sleep(1000);
       System.err.println("Visitor Exit Class "+classname);
       System.err.println("Class is Continue.....on"+classname );
       Thread.sleep(1000);
       System.err.println("Class W201 is Finished");
        System.err.println("Class Is On Going on "+classname);
        Thread.sleep(6000);
        System.err.println("Class W202 is Finished");
        
        
   }
}
