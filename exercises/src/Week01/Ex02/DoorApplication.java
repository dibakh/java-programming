package Ex02;

public class DoorApplication {
    public static void main(String[] args) {
        Door door = new Door(12);
        Key key = new Key();
        key.open(door);
    }
}


//    Hansel arrived home after a hard day of work and he reaches his key to open the door.
//        Develop the code that Hansel uses to create a key and open the door.
//        Follow the instructions below:
//        You need the following classes: Key, Door and DoorApplication.
//        The Door has a number. It also has a getNumber method.
//        The Key has no attributes. It has the open method that receives a door and says that it’s opening the door with its door number.

//        In the DoorApplication class main method, create a Door and a Key, and open the door with the key.
