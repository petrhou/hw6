package com.sibsutis.devices;

import com.sibsutis.Printable;

public abstract class Device implements Printable {
    protected int id;
    protected int price;
    protected String ip;

    public Device (int id, int price, String ip) {
        this.id = id;
        this.price = price;
        this.ip = ip;
    }

    public abstract String getDeviceType();

    @Override
    public String sprint() {
        return "Device{" +
                "id=" + id +
                ", price=" + price +
                ", ip=" + (ip != null ? ip : "null") + '\'' + 
                ", type='" + getDeviceType() + '\'' +
                '}';
    }

    public int getId() = { return id; }
    public int getPrice() = { return price; }
    public String getIp() = { return ip; }

    public void setId(int id) { this.id = id; }
    public void setPrice(int price) { this.price = price; }
    public void setIp(String ip) { this.ip = ip; }

    public int split() {
        return id;
    } 
}