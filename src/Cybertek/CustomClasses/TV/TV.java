package Cybertek.CustomClasses.TV;

public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;
    String brand = "undefined";

    public TV() {
        System.out.println("Creating TV object using no Args- constructor");
    }

    public TV(String brand) {
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public void setVolumeLevel(int volumeLevel) {
        if (on) {
            if (volumeLevel < 1 || volumeLevel > 7) {
                System.out.println("ERROR: TV is either OFF or invalid Volume level");
            } else {
                this.volumeLevel = volumeLevel;
            }
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setChannel(int channel) {
        if (!on) {
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        } else {
            if (channel <= 0 || channel > 120) {
                System.out.println("ERROR: TV is either OFF or invalid Channel");
            } else {
                this.channel = channel;
            }
        }
    }

    public int getChannel() {
        return channel;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int channelUp() {
        return channel += 1;
    }

    public int channelDown() {
        return channel -= 1;
    }

    public int volumeUp(int volumeLevel) {
        return volumeLevel += 1;
    }

    public int volumeDown(int volumeLevel) {
        return volumeLevel -= 1;
    }

    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        if (on) {
            System.out.println("TV is already ON");
        }
    }

    public void turnOff() {
        if (!on) {
            System.out.println("TV is already OFF");
        }
    }
}