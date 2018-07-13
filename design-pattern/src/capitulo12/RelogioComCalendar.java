package capitulo12;

import java.util.Calendar;

public class RelogioComCalendar implements Relogio {
	@Override
	public Calendar hoje() {
		return Calendar.getInstance();
	}
}
