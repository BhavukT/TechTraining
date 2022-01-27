class Inverter {
    private double current;
    private double operatingVoltage;

    public Inverter() {
    }

    public Inverter(double current, double operatingVoltage) {
        this.current = current;
        this.operatingVoltage = operatingVoltage;
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        this.current = current;
    }

    public double getOperatingVoltage() {
        return operatingVoltage;
    }

    public void setOperatingVoltage(double operatingVoltage) {
        this.operatingVoltage = operatingVoltage;
    }

    public void getDetails() {
        double powerRating = current * operatingVoltage;
        System.out.println("Power Rating is: " + powerRating);
    }
}

class SolarPanel {
    private double energyProduced;

    public SolarPanel() {
    }

    public SolarPanel(double energyProduced) {
        this.energyProduced = energyProduced;
    }

    public double getEnergyProduced() {
        return energyProduced;
    }

    public void setEnergyProduced(double energyProduced) {
        this.energyProduced = energyProduced;
    }

    public void getDetails() {
        System.out.println("Energy produced by solarPanel is " + energyProduced);
    }
}

class Battery {
    private int voltage;

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public Battery() {

    }

    public Battery(int voltage) {
        this.voltage = voltage;
    }

    public void getDetails() {
        System.out.println("This is a " + voltage + " volt" + " battery.");
    }
}

class SolarInverter extends Inverter {
    private SolarPanel solarPanel;

    public SolarInverter() {
    }

    public SolarInverter(double current, double operatingVoltage, SolarPanel solarPanel) {
        super(current, operatingVoltage);
        this.solarPanel = solarPanel;
    }

    public SolarPanel getSolarPanel() {
        return solarPanel;
    }

    public void setSolarPanel(SolarPanel solarPanel) {
        this.solarPanel = solarPanel;
    }

    public void getDetails() {
        super.getDetails();
        solarPanel.getDetails();
    }
}

class Zelio extends Inverter {
    private Battery battery;

    public Zelio() {

    }

    public Zelio(double current, double operatingVoltage, Battery battery) {
        super(current, operatingVoltage);
        this.battery = battery;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void getDetails() {
        super.getDetails();
        battery.getDetails();
    }

}

class ICruz extends Inverter {
    private Battery battery;

    public ICruz() {

    }

    public ICruz(double current, double operatingVoltage, Battery battery) {
        super(current, operatingVoltage);
        this.battery = battery;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void getDetails() {
        super.getDetails();
        battery.getDetails();
    }

}

class PCU extends SolarInverter {
    private boolean gridSystem = false;
    private Battery battery;

    public PCU() {
    }

    public PCU(double current, double operatingVoltage, SolarPanel solarPanel, Battery battery) {
        super(current, operatingVoltage, solarPanel);
        this.battery = battery;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void getDetails() {
        super.getDetails();
        battery.getDetails();
        System.out.println("Energy stored in the battery is : " + this.getSolarPanel().getEnergyProduced());
        System.out.println("GridOn feature is not available..");
    }
}

class Regalia extends SolarInverter {
    public Regalia() {
    }

    public Regalia(double current, double operatingVoltage, SolarPanel solarPanel) {
        super(current, operatingVoltage, solarPanel);
    }

    public void getDetails() {
        super.getDetails();
    }
}

class GTI extends SolarInverter {
    private boolean gridSystem = true;

    public GTI() {
    }

    public GTI(double current, double operatingVoltage, SolarPanel solarPanel) {
        super(current, operatingVoltage, solarPanel);
    }

    public void getDetails() {
        super.getDetails();
        System.out.println("GridOn feature available..");
    }
}

public class Solution {
    public static void main(String[] args) {
        // PCU inverter
        PCU inverterPCU = new PCU(12, 12, new SolarPanel(200.0), new Battery(20));
        inverterPCU.getDetails();

    }

}