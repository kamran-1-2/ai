import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

 class areaupdate {
private Clip clip; 

public void playsound(){
    try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C://Users//dilaw//Documents//projectAI\\sonup.wav"));
            
            clip = AudioSystem.getClip( );
            clip.open(audioInputStream);
            clip.start( );    
            }

        catch(Exception e)  {
            e.printStackTrace( );
        }

        }        
  
   public void stop()
   {
       clip.stop();
    }

  
   public static void startup (){
       
  System.out.println("rebooting ai in ");
          System.out.println(" 5 ");
 
             try {
                Thread.sleep(3000);
               System.out.println(" 4  ");
  } catch (InterruptedException ignored) {} 
  
   try {
                Thread.sleep(3000);
               System.out.println(" 3 ");
  } catch (InterruptedException ignored) {} 
  
   try {
                Thread.sleep(3000);
               System.out.println(" 2  ");
  } catch (InterruptedException ignored) {} 
  
  
  
   try {
                Thread.sleep(3000);
               System.out.println(" downloading data .  ");
  } catch (InterruptedException ignored) {} 
  
  
   try {
                Thread.sleep(3000);
               System.out.println(" downloading data ..  ");
  } catch (InterruptedException ignored) {} 
  
  
   try {
                Thread.sleep(3000);
               System.out.println(" downloading data ...  ");
  } catch (InterruptedException ignored) {} 
  
  
  
  
   try {
                Thread.sleep(3000);
               System.out.println(" done  ");
  } catch (InterruptedException ignored) {} 
  
  
 
  
} 




 public static void mainrun () throws Exception { 
       

areaupdate ob1=new  areaupdate ();




}
 
    
}
     