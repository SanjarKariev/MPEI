
import java.time.LocalTime;

class Time {
    private LocalTime time;

    public Time() {
        this.time = LocalTime.now();
    }

    public Time(int hour, int minute, int second) {
        if(hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("Не правильно переданые часы.");
        }
        if(minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("Не правильно переданые минуты.");
        }
        if(second < 0 || second >= 60) {
            throw new IllegalArgumentException("Не правильно переданые секунды.");
        }
        this.time = LocalTime.of(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if(hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("Не правильно переданые часы.");
        }
        if(minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("Не правильно переданые минуты.");
        }
        if(second < 0 || second >= 60) {
            throw new IllegalArgumentException("Не правильно переданые секнды.");
        }
        this.time = LocalTime.of(hour, minute, second);
    }

    public LocalTime getTime() {
        return this.time;
    }

    public void setHour(int hour) {
        if(hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("Не правильное значение часов.");
        }
        this.time = this.time.withHour(hour);
    }

    public void setMinute(int minute) {
        if(minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("Не правильное значение минут.");
        }
        this.time = this.time.withMinute(minute);
    }

    public void setSecond(int second) {
        if(second < 0 || second >= 60) {
            throw new IllegalArgumentException("Не правильное значение секунд.");
        }
        this.time = this.time.withSecond(second);
    }

    public int getHour() {
        return this.time.getHour();
    }

    public int getMinute() {
        return this.time.getMinute();
    }

    public int getSecond() {
        return this.time.getSecond();
    }

    public static void main(String[] args) {
        Time time = new Time();
        System.out.println("Время: " + time.getTime());

        try {
            time.setTime(25, 61, 61);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            time.setHour(-1);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            time.setMinute(60);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            time.setSecond(-1);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            time.setTime(10, 15, 20);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Нове время: " + time.getTime());
        System.out.println("Часы: " + time.getHour());
        System.out.println("Минуты: " + time.getMinute());
        System.out.println("Секунды: " + time.getSecond());
    }
}