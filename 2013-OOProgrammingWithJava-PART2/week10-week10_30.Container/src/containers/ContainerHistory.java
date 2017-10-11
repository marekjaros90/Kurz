package containers;

import java.util.*;

public class ContainerHistory {

    private List<Double> history;

    public ContainerHistory() {
        history = new ArrayList<Double>();
    }

    public void add(double situation) {
        history.add(situation);
    }

    public void reset() {
        history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        }

        double max = 0;
        for (double value : history) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        }

        double min = 1000000;
        for (double value : history) {
            if (value < min) {
                min = value;
            }
        }

        return min;
    }

    public double average() {
        if (history.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for (double value : history) {
            sum += value;
        }

        return sum / history.size();
    }

    public double greatestFluctuation() {
        if (history.size() < 2) {
            return 0;
        }

        double fluctuation = 0;
        double previous = history.get(0);
        for (double value : history) {
            double sum = Math.abs(previous - value);
            if( sum > fluctuation) {
                fluctuation = sum;
            }
            previous = value;
        }

        return fluctuation;
    }

    public double variance() {
        if (history.size() < 2) {
            return 0;
        }
        
        double sum = 0;
        for(double value : history) {
            sum += (value - this.average())*(value - this.average());
        }
        
        return sum/(history.size() - 1);
    }
}
