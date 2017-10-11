package farmsimulator;

public class MilkingRobot {

    private BulkTank tank;

    public BulkTank getBulkTank() {
        if (tank == null) {
            return null;
        }
        return tank;
    }

    public void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }

    public void milk(Milkable milkable) {
        if (this.getBulkTank() == null) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        } else {
            this.tank.addToTank(milkable.milk());
        }
    }
}
