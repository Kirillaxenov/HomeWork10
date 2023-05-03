package org.example;

public class Radio {
    private int currentVolume;
    private int station;

    public int getCurrentVolume() {

        return currentVolume;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int newStation) {
        if (newStation > 9) {
            return;
        }
        if (newStation < 0) {
            return;
        }
        station = newStation;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume > 100) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        currentVolume = newVolume;
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
        if (station == 9) {
            setStation(0);
        } else {
            station++;
        }

    }

    public void previousStation() {
        if (station == 0) {
            setStation(9);
        } else {
            station--;
        }
    }
}