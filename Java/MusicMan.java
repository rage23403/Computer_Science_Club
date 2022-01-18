import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
/**
 * Using Javax's sound.sampled.AudioInputStream to play 
 * a wav or midi file in java
 * 
 * answer taken from https://stackoverflow.com/questions/26305/how-can-i-play-sound-in-java
 * 
 */
public class MusicMan
{
    static String seinfeld = "Music_Men/Seinfeld.mid";
    static String mario = "Music_Men/Mario_Music.wav";
    /**
     * throws an exception because I didn't want to put a try{}catch(){} in it.
     */
    public static void main() throws Exception{playSound(mario);}
    /**
     * Warning: this seems to be pretty slow sometimes so it may take a while
     *          for the audio to start playing.
       */
    public static void playSound(String soundFile) throws Exception{
        File f = new File("./" + soundFile);
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(f);  
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();
    }
}
