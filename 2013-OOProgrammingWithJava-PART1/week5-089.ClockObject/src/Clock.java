
public class Clock {

    private BoundedCounter hours = new BoundedCounter (23);
    private BoundedCounter minutes = new BoundedCounter (59);
    private BoundedCounter seconds = new BoundedCounter (59);

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        hours.setValue(hoursAtBeginning);
        minutes.setValue(minutesAtBeginning);
        seconds.setValue(secondsAtBeginning);
    }

    public void tick() {
        // Clock advances by one second
        seconds.next();
        if (seconds.getValue() == 0) {
                minutes.next();
                if (minutes.getValue() == 0) {
                    hours.next();
                }
        }
    }

    public String toString() {
        // returns the string representation
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
