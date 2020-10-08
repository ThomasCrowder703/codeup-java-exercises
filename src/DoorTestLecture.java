public class DoorTestLecture {
    public static void main(String[] args){
//        DoorLecture metalDoor = new DoorLecture("metal");
//        System.out.println("metalDoor.isOpen() = " + metalDoor.isOpen());
//        metalDoor.close();
//        metalDoor.open();
//        System.out.println("metalDoor.isOpen() = " + metalDoor.isOpen());

//        SlidingDoorLecture backGlassSlidingDoor = new SlidingDoorLecture("back glass");
//        System.out.println("backGlassSlidingDoor.isOpen() = " + backGlassSlidingDoor.isOpen());
//        backGlassSlidingDoor.close();
//        backGlassSlidingDoor.open();
//        System.out.println("backGlassSlidingDoor.isOpen() = " + backGlassSlidingDoor.isOpen());

        LockingDoorLecture backDoor = new LockingDoorLecture("back");
        backDoor.open();
        System.out.println("backDoor.isOpen() = " + backDoor.isOpen());
        System.out.println("backDoor.isLocked() = " + backDoor.isLocked());
        backDoor.unlock();
        backDoor.unlock(); //this will show the message stating the door is already unlocked
        backDoor.open();
        backDoor.lock();
        backDoor.open();
        backDoor.close();
        System.out.println("backDoor.isOpen() = " + backDoor.isOpen());
        System.out.println("backDoor.isLocked() = " + backDoor.isLocked());
    }
}
