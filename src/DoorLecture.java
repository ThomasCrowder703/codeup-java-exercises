public class DoorLecture {
    private boolean open;
    private String description;

    public DoorLecture(String description){
        this.description = description;
        this.open = false;
    }

    public boolean isOpen(){
        return this.open;
    }

    public void close(){
        if(!this.isOpen()){
            System.out.printf("The %s door is already closed.\n", this.description);
            return;
        }
        System.out.printf("Closing the %s door.\n", this.description);
        this.open = false;
    }

    public void open(){
        if(this.open){
            System.out.printf("The %s door is already opened.\n", this.description);
            return;
        }
        System.out.printf("Opening the %s door.\n", this.description);
        this.open = true;
    }
}
