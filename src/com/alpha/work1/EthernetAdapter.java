package com.alpha.work1;

import java.util.Objects;

public class EthernetAdapter extends Device{
    private int speed;
    private String mac;

    public EthernetAdapter(String serialNumber, String manufacturer, double price, int speed, String mac) {
        super(serialNumber, manufacturer, price);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", speed=" + speed +
                ", mac='" + mac + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EthernetAdapter)) return false;
        if (!super.equals(o)) return false;
        EthernetAdapter adapter = (EthernetAdapter) o;
        return speed == adapter.speed && mac.equals(adapter.mac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, mac);
    }
}
