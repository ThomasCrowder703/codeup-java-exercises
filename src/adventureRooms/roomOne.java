package adventureRooms;

public class roomOne {
    private String welcomeMessage;
    private int keyComponents;
    private String name;
    private String note;
    private boolean dagger;
    private boolean bandages;
    private boolean lute;

    public roomOne(String welcomeMessage, int keyComponents,String name, String note, boolean dagger, boolean bandages, boolean lute){
        this.welcomeMessage = welcomeMessage;
        this.keyComponents = keyComponents;
        this.name = name;
        this.note = note;
        this.dagger = dagger;
        this.bandages = bandages;
        this.lute = lute;
    }

    public String getWelcomeMessage(){
        return welcomeMessage;
    }
    public void setWelcomeMessage(String message){
        this.welcomeMessage = message;
    }

    public int getKeyComponents(){
        return keyComponents;
    }

    public void setKeyComponents(int keyComponents){
        this.keyComponents = keyComponents;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getNote(){
        return this.note;
    }
    public void setNote(){
        this.note = note;
    }

    public boolean isDagger(){
        return dagger;
    }

    public void setDagger(boolean dagger) {
        this.dagger = dagger;
    }

    public boolean isBandages(){
        return this.bandages;
    }

    public void setBandages(boolean bandages){
        this.bandages = bandages;
    }

    public boolean isLute() {
        return lute;
    }

    public void setLute(boolean lute) {
        this.lute = lute;
    }

}
