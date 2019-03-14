package com.gupao.homework.strategy.model;

public class PayResult<T> {

    private int code;

    private String message;

    private T entry;

    public PayResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getEntry() {
        return entry;
    }

    public void setEntry(T entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        return "PayResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
