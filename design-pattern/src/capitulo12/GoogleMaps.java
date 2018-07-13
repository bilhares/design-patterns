package capitulo12;

import java.io.InputStream;
import java.net.URL;

public class GoogleMaps implements Mapa {

	@Override
	public String devolveMapa(String rua) {
		try {
			String googleMaps = "https://maps.google.com.br/maps?q=rua+vergueiro";
			URL uri = new URL(googleMaps);
			InputStream openStream = uri.openStream();

			return null;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
