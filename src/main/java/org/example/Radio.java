package org.example;

public class Radio {
    public int currentVolume;
    public int station;

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


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;

        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
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