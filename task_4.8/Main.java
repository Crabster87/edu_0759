import java.util.Arrays;
import java.util.Scanner;

/*
 *  ***Гостиница***
 *  1) Гостиница
 *  2) Номера (кол-во мест(1-3), сан.узел(есть/нет), питаение(есть/нет), wifi(есть/нет), свободен/занят)
 *
 *   *Задание для лабораторной работы №4*
 *   Освободить комнату
 *   Вывести свойства комнаты
 *   Показать комнаты с WiFi
 *   Показать комнаты с WC
 *   Показать комнаты с Eat
 *   Показать комнаты по кол-ву спальных мест
 *   Отобразить список команд
 * */
public class Main {
    public static void main(String[] args) {
        Room[] rooms = {
                new Room((byte) 1, false, false, true, (byte) 11),
                new Room((byte) 2, true, true, false, (byte) 12),
                new Room((byte) 1, false, true, true, (byte) 13),
                new Room((byte) 3, true, false, false, (byte) 21),
                new Room((byte) 2, false, false, false, (byte) 22),
                new Room((byte) 1, true, true, true, (byte) 23),
                new Room((byte) 3, false, true, false, (byte) 31),
                new Room((byte) 3, true, true, false, (byte) 32),
                new Room((byte) 1, false, false, true, (byte) 33),
        };
        Hotel hotel = new Hotel(rooms);
        Scanner scanner = new Scanner(System.in);
        String command;
        while (true) {
            System.out.println("\nChoose any command from the list: " + "\n" +
                               Arrays.asList(Commands.values()) + "\n" + "Enter the command");
            command = scanner.next();
            if (command.equalsIgnoreCase(Commands.GET_FREE_ROOMS.name())) {
                hotel.getFreeRooms();
            } else if (command.equalsIgnoreCase(Commands.RESERVE_ROOM.name())) {
                System.out.print("Enter room number for booking it: ");
                byte roomNumber = scanner.nextByte();
                hotel.reserveRoom(roomNumber);
            } else if (command.equalsIgnoreCase(Commands.FREE_ROOM.name())) {
                System.out.print("Enter room number for free it: ");
                byte roomNumber = scanner.nextByte();
                hotel.freeRoom(roomNumber);
            } else if (command.equalsIgnoreCase(Commands.SHOW_ROOM_PROPERTIES.name())) {
                System.out.print("Enter room number for watching its properties: ");
                byte roomNumber = scanner.nextByte();
                hotel.showRoomProperties(roomNumber);
            } else if (command.equalsIgnoreCase(Commands.GET_WITH_WIFI_ROOMS.name())) {
                hotel.getWithWiFiRooms();
            } else if (command.equalsIgnoreCase(Commands.GET_WITH_WC_ROOMS.name())) {
                hotel.getWithWcRooms();
            } else if (command.equalsIgnoreCase(Commands.GET_WITH_EAT_ROOMS.name())) {
                hotel.getWithEatRooms();
            } else if (command.equalsIgnoreCase(Commands.GET_ROOMS_BY_QUANTITY_PLACES.name())) {
                System.out.print("Enter quantity of places for watching a list of suitable rooms: ");
                byte places = scanner.nextByte();
                hotel.getRoomsByQuantityPlaces(places);
            } else if (command.equalsIgnoreCase(Commands.EXIT.name())) {
                break;
            }
        }

    }
}

