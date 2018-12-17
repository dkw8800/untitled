package com.company;

public class Main {

    static TimeInterval interv = new TimeInterval;
    static Appointment apptmt = new Appointment;
    static Appointment apptmt2 = new Appointment;
    private ArrayList apptList;

    public static boolean main(String[] args) {
        if (apptmt.conflictsWith(apptmt2))
        {
            DailySchedule.clearConflicts(apptmt2);
        }
        else
        {
            DailySchedule.addAppt(apptmt2, emergency);
        }
    }
}
