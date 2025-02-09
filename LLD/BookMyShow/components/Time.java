package components;

public class Time {
    private int hours;
    private int minutes;

    // Constructor
    public Time(int hours, int minutes) {
        if (isValidTime(hours, minutes)) {
            this.hours = hours;
            this.minutes = minutes;
        } else {
            throw new IllegalArgumentException("Invalid time format");
        }
    }

    // Validate time
    private boolean isValidTime(int hours, int minutes) {
        return (hours >= 0 && hours < 24) && (minutes >= 0 && minutes < 60);
    }

    // Getters
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    // Setters with validation
    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {
            throw new IllegalArgumentException("Invalid hour value");
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            throw new IllegalArgumentException("Invalid minute value");
        }
    }

    // Convert to String (HH:MM format)
    @Override
    public String toString() {
        return String.format("%02d:%02d", hours, minutes);
    }

    // Compare two time objects
    public boolean equals(Time other) {
        return this.hours == other.hours && this.minutes == other.minutes;
    }

    // Check if one time is before another
    public boolean isBefore(Time other) {
        return (this.hours < other.hours) || (this.hours == other.hours && this.minutes < other.minutes);
    }

    // Check if one time is after another
    public boolean isAfter(Time other) {
        return !isBefore(other) && !equals(other);
    }
}
