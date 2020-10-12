package extra;

public class Piano extends MusicalInstrument implements Tunable, VolumeAdjustable{

    private int numberOfKeys;

    public Piano(String classify, int key){
        super(classify);
        this.numberOfKeys = key;
    }

    public int getNumberOfKeys(){
        return this.numberOfKeys;
    }

    @Override
    public void setInstrumentClassification(String classify){

    }

    @Override
    public void startMusic(){
        System.out.println("The music is playing");
    }

    @Override
    public void stopMusic(){
        System.out.println("The music has stopped");
    }

    @Override
    public void volumeUp(){
        System.out.println("Turning volume up");
    }

    @Override
    public void volumeDown(){
        System.out.println("Turning volume down");
    }

    @Override
    public void tuneInstrument(){
        System.out.println("Tuning the instrument");
    }

    @Override
    public void detuneInstrument(){
        System.out.println("detuning the instrument");
    }


}
