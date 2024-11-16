package com.java13.service;

public class Service {

    public enum Event {
        PLAY, PAUSE, STOP
    }

    public void switchExpression(Event event){
        switch (event){
            case PLAY -> {
                System.out.println("Started");
                break;
            }
            case STOP, PAUSE -> {
                System.out.println("stoped");
                break;
            }
            default -> throw new IllegalStateException("Unexpected value: " + event);
        }
    }
}
