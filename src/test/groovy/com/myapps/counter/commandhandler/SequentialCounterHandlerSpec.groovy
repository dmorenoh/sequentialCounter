package com.myapps.counter.commandhandler

import com.blogspot.toomuchcoding.spock.subjcollabs.Subject
import spock.lang.Specification

class SequentialCounterHandlerSpec extends Specification {

    public static final int START = 0
    public static final int END = 5
    @Subject
    SequentialCounterHandler sequentialCounterHandler

    def "should print up sequence"() {
        given: "a buffer output stream"
            def buffer = new ByteArrayOutputStream()
            System.out = new PrintStream(buffer)
        when: "perform printing from start to end numbers"
            sequentialCounterHandler.countUp(START, END)
        then: "output stream prints sequence up and down"
            buffer.toString() == "0, 1, 2, 3, 4, 5"
    }

    def "should print up and down sequence"() {
        given: "a buffer output stream"
            def buffer = new ByteArrayOutputStream()
            System.out = new PrintStream(buffer)
        when: "perform"
            sequentialCounterHandler.countUpAndDown(START, END)
        then: "output stream prints sequence up and down"
            buffer.toString() == "0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0"
    }
}
