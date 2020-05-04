package LabOne;

public class SmartSpeaker extends Speaker {

    private boolean isSmart;


    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    public SmartSpeaker(boolean isSmart, int amountOfSpeakers, String brand) {
        super(amountOfSpeakers, brand);
        this.isSmart = isSmart;
    }
}
