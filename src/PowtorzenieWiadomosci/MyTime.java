package PowtorzenieWiadomosci;

/**
 * Created by RENT on 2017-08-25.
 */
public class MyTime {
    private int _hour = 0;
    private int _minute = 0;
    private int _second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        _hour = hour;
        _minute = minute;
        _second = second;
    }

    public void setTime(int hour, int minute, int second) {
        _hour = hour;
        _minute = minute;
        _second = second;
    }

    public int getHour() {
        return _hour;
    }

    public int getMinute() {
        return _minute;
    }

    public int getSecond() {
        return _second;
    }

    public void setHour(int hour) {
        _hour = hour;
    }

    public void setMinute(int minute) {
        _minute = minute;
    }

    public void setSecond(int second) {
        _second = second;
    }

    public void setMyTime(int hour, int minute, int second) {
        if (hour > 0 && hour <= 24)
            _hour = hour;
        else _hour = 0;

        if (minute > 0 && minute <= 60)
            _minute = minute;
        else _minute = 0;

        if (second > 0 && second <= 60)
            _second = second;
        else _second = 0;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", _hour, _minute, _second);
    }

    public MyTime nextSecond() {
        if (_second != 59) {
            _second = _second + 1;
        } else {
            _second = 0;
            nextMinute();
        }
        return this;
    }
    public MyTime nextMinute() {
        if(_minute != 59) {
            _minute = _minute + 1;
        }else {
            _minute = 0;
            nextHour();
        }
        return this;
    }
    public MyTime nextHour(){
        _hour = (_hour +1) %24;
        return this;
    }
}
