import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;


class  endai{
private Clip clip; 

public void final1(){
    try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C://Users//dilaw//Documents//projectAI\\fi.wav"));
            
            clip = AudioSystem.getClip( );
            clip.open(audioInputStream);
            clip.start( );    
            }

        catch(Exception e)  {
            e.printStackTrace( );
             endai rn=new endai();
        }
}

 

}


    




   
 
 
 
