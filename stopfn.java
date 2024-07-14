 
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
class stopfn {
private Clip clip; 
public   void disp ()  
{
   System.out.println("update  recommended   as it is first update it is forced to install  ");
  System.out.println(" in background thnaks for understanding");
}

public   void nxt ()   { 
   
     try {
                Thread.sleep(3000);
                System.out.println("background update started"); 
        } catch (InterruptedException ignored) {}
    }


  public   void lst ()   { 
      try {
                Thread.sleep(3000);
                System.out.println("your ai will be rebooted shortly"); 
        } catch (InterruptedException ignored) {}
    }
    
   
      public static void updai ()  throws Exception{
                                    

    
     
     
     
    File soundFile = new File("C://Users//dilaw//Documents//projectAI\\stp.wav");
    AudioInputStream sound = AudioSystem.getAudioInputStream(soundFile);

    
    DataLine.Info info = new DataLine.Info(Clip.class, sound.getFormat());
    Clip clip = (Clip) AudioSystem.getLine(info);
    clip.open(sound);

   

      
    clip.start();
 
 
    
  }
  
  





  
  
  
    
    public static void mainrun ()  { 
        stopfn fn=new stopfn ();
        fn.disp();
        fn. nxt();
        fn.lst();
       
    
}


}



