public class Hotel {

    Room[] rooms;

    public Hotel(Room[] rooms) {
        this.rooms = rooms;
    }

    public void getFreeRooms() {
        String freeRoomsList = "";
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isFree()) freeRoomsList += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("The numbers of free rooms: " + freeRoomsList);
    }

    public void getWithWiFiRooms() {
        String withWiFiList = "";
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isWifi()) withWiFiList += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("The numbers of rooms with Wi-Fi: " + withWiFiList);
    }

    public void getWithWcRooms() {
        String getWithWcList = "";
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isWc()) getWithWcList += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("The numbers of rooms with WC: " + getWithWcList);
    }

    public void getWithEatRooms() {
        String getWithEatList = "";
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isEat()) getWithEatList += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("The numbers of rooms with Eat: " + getWithEatList);
    }

    public void getRoomsByQuantityPlaces(byte places) {
        if (places < 1 || places > 3) {
            System.out.println("Doesn't exists room like this here!");
            return;
        }
        String getRoomsByQuantityPlaces = "";
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getQuantity() == places) getRoomsByQuantityPlaces += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("The numbers of rooms with equal quantity of places: " + getRoomsByQuantityPlaces);
    }

    public void reserveRoom(byte roomNumber) {
        String info = "Doesn't exists room like this here!";
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
            if (room.getRoomNumber() == roomNumber && room.isFree()) {
                room.setFree(false);
                info = ("The room number " + roomNumber + " was successfully reserved!");
                break;
            } else if (room.getRoomNumber() == roomNumber && !room.isFree()) {
                info = "The room " + roomNumber + " is already occupied!";
                break;
            }
        }
        System.out.println(info);
    }

    public void freeRoom(byte roomNumber) {
        String info = "Doesn't exists room like this here!";
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
            if (room.getRoomNumber() == roomNumber && !room.isFree()) {
                room.setFree(true);
                info = ("The room number " + roomNumber + " was successfully freed!");
                break;
            } else if (room.getRoomNumber() == roomNumber && room.isFree()) {
                info = "The room " + roomNumber + " is already freed!";
                break;
            }
        }
        System.out.println(info);

    }

    public void showRoomProperties(byte roomNumber) {
        String info = "Doesn't exists room like this here";
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
            if (room.getRoomNumber() == roomNumber) {
                info = "The room number " + roomNumber + " has: " +
                        "\nPlaces: " + rooms[i].getQuantity() + ";" +
                        "\n" + "WC: " + rooms[i].isWc() + ";" +
                        "\n" + "Eat: " + rooms[i].isEat() + ";" +
                        "\n" + "Wi-Fi: " + rooms[i].isWifi() + ";" +
                        "\n" + "Free now: " + rooms[i].isFree() + ".";
                break;
            }
        }
        System.out.println(info);
    }

}
