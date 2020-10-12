package extra;

public abstract class MusicalInstrument implements Playable {
    private String instrumentClassification;

   public MusicalInstrument(String classify){
     this.instrumentClassification = classify;
    }

    public String getInstrumentClassification(){
        return this.instrumentClassification;
    }

    public abstract void setInstrumentClassification(String classify);

}
