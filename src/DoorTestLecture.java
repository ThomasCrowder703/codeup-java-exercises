public class DoorTestLecture {
    public static void main(String[] args){
//        DoorLecture metalDoor = new DoorLecture("metal");
//        System.out.println("metalDoor.isOpen() = " + metalDoor.isOpen());
//        metalDoor.close();
//        metalDoor.open();
//        System.out.println("metalDoor.isOpen() = " + metalDoor.isOpen());

        SlidingDoorLecture backGlassSlidingDoor = new SlidingDoorLecture("back glass");
        System.out.println("backGlassSlidingDoor.isOpen() = " + backGlassSlidingDoor.isOpen());
        backGlassSlidingDoor.close();
        backGlassSlidingDoor.open();
        System.out.println("backGlassSlidingDoor.isOpen() = " + backGlassSlidingDoor.isOpen());
    }
}
