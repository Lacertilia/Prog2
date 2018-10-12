package Clock;

public class AlarmClock extends Clock {
    private int hour;
    private int minutes;
    private int snoozeTime = 10;
    private boolean alarmOn;

    public void setAlarm(int hours, int minutes){

    }

    public void alarmOn(){
        this.alarmOn = true;
    }

    public void alarmOff(){
        this.alarmOn = false;
    }

    public void snooze(){
        if(minutes <50){
            minutes += snoozeTime;
        }else{
            minutes = minutes + snoozeTime - 60;
            if(super.s && hour < 12){
                this.hour++;
            }else if(super.s){
                this.hour = 1;
            }
        }
    }
}
