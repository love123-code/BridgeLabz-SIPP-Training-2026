package Smart Home Devices;

public class Main {

    public static void main(String[] args) {

        Thermostat thermostat =
                new Thermostat(
                        101,
                        "ON",
                        24
                );

        DeviceUtility utility =
                new DeviceUtility();

        utility.showDeviceStatus(thermostat);
    }
}