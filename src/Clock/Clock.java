package Clock;

public class Clock {
    private NumberDisplay hours = new NumberDisplay(24);
    private NumberDisplay minutes = new NumberDisplay(60);
    private String displayString;
    private boolean s;
    private String format;

    public Clock(){
        this.hours.setValue(0);
        this.minutes.setValue(0);
    }

    public Clock(boolean s){
        this.s = s;
        this.hours.setValue(0);
        this.minutes.setValue(0);
    }

    public Clock(int hour, int minute){
        this.hours.setValue(hour);
        this.minutes.setValue(minute);
    }

    public Clock(int hour, int minute, boolean s){
        this.s = s;
        if(s && hour<=12){
            this.hours.setValue(hour);
            this.minutes.setValue(minute);
        }
    }

    public void timeTick(){
        this.minutes.increment();
        if(this.minutes.getValue() == 0){
            this.hours.increment();
        }
    }

    public void setTime(int hour, int minute){
        this.hours.setValue(hour);
        this.minutes.setValue(minute);
    }

    public String getTime(){
        updateDisplay();
        return displayString;
    }

    private void updateDisplay(){
        if(!s) {
            displayString = this.hours.getDisplayValue() + ":" + this.minutes.getDisplayValue();
        }else {
            displayString = this.hours.getDisplayValue() + ":" + this.minutes.getDisplayValue() + format;
        }
    }

    public void switchFormat(){
        if(s){
            s = false;
            if(this.hours.getValue() > 12){

            }
        }
    }
}