import config.SpringConfig;
import models.MusicPlayer;
import models.MusicType;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer mp = context.getBean(MusicPlayer.class);
        mp.play();
    }
}
