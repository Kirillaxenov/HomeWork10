package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTests {
    @Test
    public void volumeUp() {
        Radio radio = new Radio();
        radio.currentVolume = 100;
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUp2() {
        Radio radio = new Radio();
        radio.currentVolume = 10;
        radio.increaseVolume();
        int expected = 11;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDown() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDown2() {
        Radio radio = new Radio();
        radio.currentVolume = 48;
        radio.reduceVolume();
        int expected = 47;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setStation(9);
        ;
        radio.nextStation();
        int expected = 0;
        int actual = radio.station;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation1() {
        Radio radio = new Radio();
        radio.setStation(5);
        radio.nextStation();
        int expected = 6;
        int actual = radio.station;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousStation() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.previousStation();
        int expected = 9;
        int actual = radio.station;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void previousStation1() {
        Radio radio = new Radio();
        radio.setStation(7);
        radio.previousStation();
        int expected = 6;
        int actual = radio.station;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationPositive() {
        Radio radio = new Radio();
        radio.setStation(8);
        int expected = 8;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetStationOutOfRange() {
        Radio radio = new Radio();
        radio.setStation(15);
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testSetStationNegative() {
        Radio radio = new Radio();
        radio.setStation(-15);
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }
}