public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time (int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public Time nextSecond(){
        if (second == 59){
            second = 0;
            minute++;
        }
        else if (minute == 60){
            minute = 0;
            hour++;
        }
        else if (hour == 24){
            hour = 0;
        }
        else
            second++;
        return this;
    }

    public Time previousSecond(){
        if (second == 0){
            second = 59;
            minute--;
        }
        else if (minute == -1){
            minute = 59;
            hour--;
        }
        else if (hour == -1){
            hour = 23;
        }
        else {
            second--;
        }
        return this;
    }
    public String toString(){
        return hour + ":" + minute + ":" + second;
    }

}
