package com.vitkulov.console_war.utils;

public interface IO {

    /**
     * Read data from input
     */
    String read();

    /**
     * Print value to output
     *
     * @param value value to string
     */
    void println(Object value);
}
