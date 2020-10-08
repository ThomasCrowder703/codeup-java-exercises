public class LockingDoorLecture extends DoorLecture{
    private boolean locked;
    public LockingDoorLecture(String description){
        super(description);
        this.locked = true;
    }
    public boolean isLocked(){
        return locked;
    }

    public void unlock(){
        if(!this.locked){
            System.out.println("The door is already unlocked.");
            return;
        }
        System.out.printf("Unlocking the %s door\n", this.description);
        this.locked = false;
    }

    public void lock(){
        if(this.locked){
            System.out.println("The door is already locked.");
            return;
        }
        System.out.printf("Locking the %s door\n", this.description);
        this.locked = true;
    }

    public void open(){
        if(this.locked){
            System.out.printf(" The %s door is locked\n",this.description);
            return;
        }
        super.open();
    }
}
