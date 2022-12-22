import org.apache.logging.log4j.core.config.Configurator;
import xyz.gianlu.librespot.common.Log4JUncaughtExceptionHandler;
import xyz.gianlu.librespot.core.Session;
import xyz.gianlu.librespot.mercury.MercuryClient;
import xyz.gianlu.librespot.player.*;
import java.io.IOException;
import java.security.GeneralSecurityException;

public class Main {
	public static void main(String[] args) throws IOException, GeneralSecurityException,
			Session.SpotifyAuthenticationException, MercuryClient.MercuryException {

		// Agarra el config.toml de lib
		FileConfiguration conf = new FileConfiguration("--conf-file=./lib/config.toml");

		Configurator.setRootLevel(conf.loggingLevel());
		Thread.setDefaultUncaughtExceptionHandler(new Log4JUncaughtExceptionHandler());

		Session session = conf.initSessionBuilder().create();
		Player player = new Player(conf.toPlayer(), session);

		player.addEventsListener(new EventFinishedLoading());
		player.load("spotify:track:3sIsG7vDZr17BVimMeZZQS", true, false);

		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			try {
				player.close();
				session.close();
			} catch (IOException ignored) {
			}
		}));
	}
}