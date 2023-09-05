public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 15;

    public void changeChannel(int anotherChannel) {
        canal = anotherChannel;
    }

    public void increaseVolume() {
        volume++;
    }

    public void decreaseVolume() {
        volume--;
    }

    public void turOn() {
        ligada = true;
    }

    public void turOff() {
        ligada = false;
    }

    public void nextChannel() {
        canal++;
    }

    public void previousChannel() {
        canal--;
    }

}
