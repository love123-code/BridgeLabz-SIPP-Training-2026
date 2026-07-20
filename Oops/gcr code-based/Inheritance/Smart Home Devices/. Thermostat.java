package Smart Home Devices;

ppublic class Thermostat extends Device {

    private int temperatureSetting;

    public Thermostat(int deviceId,
                      String status,
                      int temperatureSetting) {

        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {

        System.out.println("Device ID : " + deviceId);
        System.out.println("Status : " + status);
        System.out.println("Temperature Setting : "
                           + temperatureSetting + "°C");
    }
}