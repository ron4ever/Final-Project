package finalproject;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import pizzagame.Menu;
/**
 * FinalProject.java - The class containing main that starts up the whole game process
 * @Instructor Mr.Wachs
 * @since 9-Apr-2019
 * @author r.stuchevsky
 */
public class FinalProject {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Menu menu = new Menu(); //starts up the greeting ui
    }
}
