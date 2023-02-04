public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int h) {
        this.hour = h;
    }

    public void setMinute(int m) {
        this.minute = m;
    }

    public void setSecond(int s) {
        this.second = s;
    }

    public void setTime(int h, int m, int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    public String toString() {
        return this.hour + ":" + this.minute + ":" + this.second;
    }
}
