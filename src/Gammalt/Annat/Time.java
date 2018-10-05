package Gammalt.Annat;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        if(hour>=0 && hour<=23 && minute>=0 && minute<=59 && second>=0 && second<=59){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    public int getSecond(){
        return this.second;
    }

    public void setHour(int hour) {
        if (hour>=0 && hour<=23) {
            this.hour = hour;

        }
    }
    public void setMinute(int minute) {
        if(minute>=0 && minute<=59){
            this.minute = minute;
        }
    }

    public void setSecond(int second){
        if(second>=0 && second<=59){
            this.second = second;
        }
    }

    public void setTime(int hour, int minute, int second){
        if(hour>=0 && hour<=23 && minute>=0 && minute<=59 && second>=0 && second<=59){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    @Override
    public String toString(){
        if(hour>9){
            if(minute>9){
                if(second>9){
                    return (hour + ":" + minute + ":" + second);
                }else{
                    return (hour + ":" + minute + ":0" + second);
                }
            }else{
                if(second>9){
                    return (hour + ":0" + minute + ":" + second);
                }else{
                    return (hour + ":0" + minute + ":0" + second);
                }
            }
        }else{
            if(minute>9){
                if(second>9){
                    return ("0" + hour + ":" + minute + ":" + second);
                }else{
                    return ("0" + hour + ":" + minute + ":0" + second);
                }
            }else{
                if(second>9){
                    return ("0" + hour + ":0" + minute + ":" + second);
                }else{
                    return ("0" + hour + ":0" + minute + ":0" + second);
                }
            }
        }
    }

    public Time nextSecond(){
        if(second < 59){
            second++;
        }else{
            if(minute < 59){
                minute++;
                second = 0;
            }else{
                if(hour < 23){
                    hour++;
                    minute = 0;
                    second = 0;
                }else{
                    hour = 0;
                    minute = 0;
                    second = 0;
                }
            }
        }

        return this;
    }

    public Time lastSecond(){
        if(second>0){
            second--;
        }else{
            if(minute>0){
                minute--;
                second = 59;
            }else{
                if(hour>0){
                    hour--;
                    minute = 59;
                    second = 59;
                }else{
                    hour = 23;
                    minute = 59;
                    second = 59;
                }
            }
        }



        return this;
    }
}
