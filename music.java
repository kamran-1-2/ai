import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;


class music {
private Clip clip; 

public void musicAI(){
    try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C://Users//dilaw//Documents//projectAI\\music1.wav"));
            
            clip = AudioSystem.getClip( );
            clip.open(audioInputStream);
            clip.start( );    
            }

        catch(Exception e)  {
            e.printStackTrace( );
             music obj=new music ();
        }
}

 // call stop method to stop clip form playing
 public void dummyMethod(){
     try {
    clip.stop();
} catch (NullPointerException npe) {
     
    
}
}
}


    




   
 
 
 
