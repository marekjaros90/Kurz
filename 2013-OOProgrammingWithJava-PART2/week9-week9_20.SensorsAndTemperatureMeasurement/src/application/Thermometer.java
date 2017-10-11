package application;

import java.util.*;

public class Thermometer implements Sensor {

    private boolean on;

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void on() {
        on = true;
    }

    @Override
    public void off() {
        on = false;
    }

    @Override
    public int measure() {
        if (!isOn()) {
            throw new IllegalStateException("Thermometer is off");
        }
        Random random = new Random();
        return random.nextInt(60) - 30;
    }

}
