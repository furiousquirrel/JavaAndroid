package lesson4;

import java.util.Calendar;

public class DayofWeak {

    public void remainingDay() {
        int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        switch (day) {
            case Calendar.SUNDAY:
                System.out.println(" последний день");
                break;
            case Calendar.MONDAY:
                System.out.println(" вторник, среда, четверг, пятница, суббота, воскресенье");
                break;
            case Calendar.TUESDAY:
                System.out.println(" среда, четверг, пятница, суббота, воскресенье");
                break;
            case Calendar.WEDNESDAY:
                System.out.println(" четверг, пятница, суббота, воскресенье");
                break;
            case Calendar.THURSDAY:
                System.out.println(" пятница, суббота, воскресенье");
                break;
            case Calendar.FRIDAY:
                System.out.println(" суббота, воскресенье");
                break;
            case Calendar.SATURDAY:
                System.out.println(" воскресенье");
                break;
        }
    }
}
