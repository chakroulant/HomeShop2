package com.ocr.chak.homeshop;

public interface Writer {
    /**
     * Start writing process
     */
    public void start();

    /**
     * Write on line
     * @param line
     */
    public void writeLine(String line);

    /**
     * Stop writing
     */
    public void stop();
}
