package org.example;

public class Radio {
    private int currentVolume;
    private int station;
    private int maxStation = 10;

    public Radio(int station, int maxStation) {
        this.station = station;
        this.maxStation = maxStation;

    }

    public Radio(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getStation() {
        return station;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setStation(int newStation) {
        if (newStation > getMaxStation()) {
            station = 0;
            return;
        }
        if (newStation < 0) {
            station = 0;
            return;
        }
        station = newStation;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            setCurrentVolume(currentVolume + 1);

        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            setCurrentVolume(currentVolume - 1);
        }
    }

    public void nextStation() {
        if (station == getMaxStation() - 1) {
            setStation(0);
        } else {
            station++;
        }

    }

    public void previousStation() {
        if (station == 0) {
            setStation(getMaxStation() - 1);
        } else {
            station--;
        }
    }
}