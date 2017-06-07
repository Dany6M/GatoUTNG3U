package audio;

import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gbarron
 * URL ha descargar sonidos http://soundbible.com
 */
public class PlayAudio {

    public static void main(String[] args) {
        try {
            AePlayWave aw;
            URL url = PlayAudio.class.getResource("/audio/Cat_Meow_2-Cat_Stevens-2034822903.wav");
            aw = new AePlayWave(url);
            aw.start();
        } catch (URISyntaxException ex) {
            Logger.getLogger(PlayAudio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
