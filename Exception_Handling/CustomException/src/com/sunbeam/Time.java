package com.sunbeam;

// Checked Exception
class InvalidTimeException extends Exception {

    public InvalidTimeException() {
    }

    public InvalidTimeException(String message) {
        super(message);
        
       // This calls the constructor of the parent class (Exception).
       // The parent class stores the message passed to it.
      //  super(message) passes the error message to the parent Exception class 
        //so it can be stored and accessed later using getMessage().
    }
}

public class Time {

    private int hr;
    private int min;

    public void setHr(int hr) throws InvalidTimeException {
        if (hr < 0 || hr > 23)
            throw new InvalidTimeException("Hour should be between 0 and 23");

        this.hr = hr;
    }

    public void setMin(int min) throws InvalidTimeException {
        if (min < 0 || min > 59)
            throw new InvalidTimeException("Min should be between 0 and 59");

        this.min = min;
    }

    @Override
    public String toString() {
        return "Time [hr=" + hr + ", min=" + min + "]";
    }

    public static void main(String[] args) {

        Time t1 = new Time();

        try {
            t1.setHr(32);     // Valid
            t1.setMin(34);    // Invalid

            System.out.println(t1);

        } catch (InvalidTimeException e) {
            e.printStackTrace();
        }

        System.out.println("Program Finished");
    }
}