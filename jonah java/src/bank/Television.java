package bank;

public class Television {
    private int currentChannel;
    private int currentVolumeLevel;
    private boolean on;
    private static final int MAX_CHANNEL = 120;
    private static final int MIN_CHANNEL = 1;
    private static final int MAX_VOLUME = 15;
    private static final int MIN_VOLUME = 1;

    public Television(int initialChannel, int initialVolumeLevel) {
        if (initialChannel >= MIN_CHANNEL && initialChannel <= MAX_CHANNEL) {
            currentChannel = initialChannel;
        } else {
            currentChannel = MIN_CHANNEL;
        }

        if (initialVolumeLevel >= MIN_VOLUME && initialVolumeLevel <= MAX_VOLUME) {
            currentVolumeLevel = initialVolumeLevel;
        } else {
            currentVolumeLevel = MIN_VOLUME;
        }
        this.on = false;
    }

    public boolean turnOn(){
        on = true;
        return true;
    }

    public boolean turnOff(){
        on = false;
        return false;
    }

    public void setChannel(int channel) {
        if (on && channel >= 1 && channel <= 120);
        currentChannel = channel;
    }

    public int getChannel(){
        return currentChannel;
    }
    public void setVolumeLevel(int level) {
        if (on && level >= 1 && level <= 15)
            currentVolumeLevel = level;
    }
    public int getVolumeLevel(){
        return currentVolumeLevel;
    }
    public void increaseChannel(int newChannel) {
        if (newChannel >= MIN_CHANNEL && newChannel <= MAX_CHANNEL)
            currentChannel++;
    }
    public void decreaseChannel(int newChannel) {
        if (newChannel >= MIN_CHANNEL && newChannel <= MAX_CHANNEL)
            currentChannel--;
    }
    public void increaseVolumeLevel(int newVolumeLevel) {
        if (newVolumeLevel >= MIN_VOLUME && newVolumeLevel <= MAX_VOLUME)
            currentVolumeLevel++;
    }
    public void decreaseVolumeLevel(int newVolumeLevel) {
        if (newVolumeLevel >= MIN_VOLUME && newVolumeLevel <= MAX_VOLUME)
            currentVolumeLevel--;
    }
    public void resetChannel() {
        currentChannel = 1;
    }

}
