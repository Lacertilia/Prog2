package Clock;

public class Clock {
    private NumberDisplay hours = new NumberDisplay(24);
    private NumberDisplay minutes = new NumberDisplay(60);
    private String displayString;
    protected boolean s;
    private String format;

    public Clock(){
        this.hours.setValue(0);
        this.minutes.setValue(0);
        this.s = false;
    }

    public Clock(boolean s){
        this.s = s;
        this.hours.setValue(0);
        this.minutes.setValue(0);
        if(s){
            format = "AM";
        }
    }

    public Clock(int hour, int minute){
        this.hours.setValue(hour);
        this.minutes.setValue(minute);
        this.s = false;
    }

    public Clock(int hour, int minute, boolean s){
        this.s = s;
        if(s && hour<12){
            this.hours.setValue(hour);
            this.minutes.setValue(minute);
            format = "AM";
        }else if(s && hour == 12){
            this.hours.setValue(hour);
            this.minutes.setValue(minute);
            format = "PM";
        }else if(s){
            this.hours.setValue(hour-12);
            this.minutes.setValue(minute);
            format = "PM";
        }else{
            this.hours.setValue(hour);
            this.minutes.setValue(minute);
        }
    }

    public void timeTick(){
        this.minutes.increment();
        if(this.minutes.getValue() == 0){
            this.hours.increment();
            if(s && this.hours.getValue() == 12 && format.equals("AM")){
                format = "PM";
            }else if(s && this.hours.getValue() == 12 && format.equals("PM")){
                format = "AM";
            }
        }
    }

    public void setTime(int hour, int minute){
        if(s && hour<12){
            this.hours.setValue(hour);
            this.minutes.setValue(minute);
            format = "AM";
        }else if(s && hour == 12){
            this.hours.setValue(hour);
            this.minutes.setValue(minute);
            format = "PM";
        }else if(s){
            this.hours.setValue(hour-12);
            this.minutes.setValue(minute);
            format = "PM";
        }else{
            this.hours.setValue(hour);
            this.minutes.setValue(minute);
        }
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
            if(format.equals("PM")){
                this.hours.setValue(this.hours.getValue() + 12);
            }
        } else{
            s = true;
            if(this.hours.getValue() > 12){
                this.hours.setValue(this.hours.getValue() - 12);
                format = "PM";
            }else{
                format = "AM";
            }
        }
    }
}