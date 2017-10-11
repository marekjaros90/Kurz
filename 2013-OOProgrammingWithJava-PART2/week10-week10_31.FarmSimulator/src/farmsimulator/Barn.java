package farmsimulator;

import java.util.*;

public class Barn {

    private BulkTank tank;
    private MilkingRobot robot;

    public Barn(BulkTank tank) {
        this.tank = tank;
    }

    public BulkTank getBulkTank() {
        return tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        robot = milkingRobot;
        robot.setBulkTank(tank);
    }

    public void takeCareOf(Cow cow) {
        if (robot == null) {
            throw new IllegalStateException("");
        }
        robot.milk(cow);
    }

    public void takeCareOf(Collection<Cow> cows) {
        if (robot == null) {
            throw new IllegalStateException("");
        }
        for (Cow cow : cows) {
            robot.milk(cow);
        }
    }
    
    public String toString() {
        return "Barn bulk tank: " + tank.toString();
    }
}
