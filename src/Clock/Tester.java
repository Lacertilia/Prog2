package Clock;

import java.time.LocalDateTime;

public class Tester {

    public static void main(String[] args) {
        Clock clock = new Clock(LocalDateTime.now().getHour(), LocalDateTime.now().getMinute());

        System.out.println(clock.getTime());
        clock.timeTick();

        System.out.println(clock.getTime());
        clock.setTime(22,59);
        System.out.println(clock.getTime());
        clock.timeTick();
        System.out.println(clock.getTime());
    }
}
