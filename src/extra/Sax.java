package extra;

public class Sax extends MusicalInstrument implements Tunable, VolumeAdjustable{

    private String saxType;

    public Sax(String classify, String mySax){
        super(classify);
        this.saxType = mySax;
    }

    public String getSaxType(){
        return this.saxType;
    }

//    public void setSaxType(){
//
//    }


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
