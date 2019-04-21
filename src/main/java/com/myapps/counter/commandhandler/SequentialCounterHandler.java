package com.myapps.counter.commandhandler;

public class SequentialCounterHandler {

    public void countUp(int start, int end) {
        System.out.print(getSequenceUp(start, end));
    }

    public void countUpAndDown(int start, int end) {
        System.out.print(String.valueOf(start) + ", " + getSequenceUp(start + 1, end) + ", " + getSequenceDown(start, end - 1));
    }

    private String getSequenceDown(int start, int end) {
        if (start == end) {
            return String.valueOf(start);
        }
        return String.valueOf(end) + ", " + getSequenceDown(start, end - 1);
    }

    private String getSequenceUp(int start, int end) {
        if (start == end) {
            return String.valueOf(start);
        }
        return String.valueOf(start) + ", " + getSequenceUp(start + 1, end);
    }


}
