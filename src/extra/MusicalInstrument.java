package extra;

public abstract class MusicalInstrument implements Playable {
    private String instrumentClassification;

    MusicalInstrument(String classify){
      
    }

    public String getInstrumentClassification(){
        return this.instrumentClassification;
    }

    public abstract void setInstrumentClassification(String classify);

}
