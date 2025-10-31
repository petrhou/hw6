package com.sibsutis.devices;

import java.utill.Objects;

public class PersonalComputer extends Device {

    public  PersonalComputer(int id, int price) {
        super(id, price, null);
    }

    public PersonalComputer(int id, int price, String ip) {
        super(id, price, ip);
    }

    @Override
    public String getDeviceType() {
        return "PersonalComputer";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalComputer that = (PersonalComputer) o;
        return id == that.id &&
                price == that.price &&
                Objects.equals(ip, that.ip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, ip);
    }
}