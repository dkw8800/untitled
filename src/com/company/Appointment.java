package com.company;

public class Appointment {
    public TimeInterval time;

    public TimeInterval getTime()
    {
        return this.time;
    }
    public boolean conflictsWith(Appointment other)
    {
        this.time.overlapsWith(other.getTime());
    }
}
