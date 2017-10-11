package application;

import java.util.*;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors = new ArrayList<Sensor>();
    private List<Integer> readings = new ArrayList<Integer>();

    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }
    
    public List<Integer> readings() {
        return readings;
    }

    @Override
    public boolean isOn() {
        if(sensors.isEmpty()) {
            return false;
        }
        
        for(Sensor sensor : sensors) {
            if(!sensor.isOn()) {
                return false;
            }
        }
        
        return true;
    }

    @Override
    public void on() {
        for(Sensor sensor : sensors) {
            sensor.on();;
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : sensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.measure();

        }
        int average = sum/sensors.size();
        
        readings.add(average);
        
        return (average);
    }

}
