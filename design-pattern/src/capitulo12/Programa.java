package capitulo12;

import java.util.Calendar;

public class Programa {

	public static void main(String[] args) throws Exception {

		Mapa mapa = new GoogleMaps();
		mapa.devolveMapa("rua vergueiro");

		Relogio relogio = new RelogioComCalendar();

		Calendar dataAtual = relogio.hoje();

	}

}
