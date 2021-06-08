/*
 * 2) ������ (���-�� ����(1-3), ���.����(����/���), ��������(����/���), wifi(����/���), ��������/�����)
 */
public class Room {
    private byte quantity;
    private boolean wc;
    private boolean eat;
    private boolean wifi;
    private boolean isFree;
    private byte roomNumber;

    public Room(byte quantity, boolean wc, boolean eat, boolean wifi,byte roomNumber) {
        this.quantity = quantity;
        this.wc = wc;
        this.eat = eat;
        this.wifi = wifi;
        this.isFree = true;
        this.roomNumber = roomNumber;
    }


    public byte getRoomNumber() {
        return roomNumber;
    }

    public byte getQuantity() {
        return quantity;
    }

    public boolean isWc() {
        return wc;
    }

    public boolean isEat() {
        return eat;
    }

    public boolean isWifi() {
        return wifi;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
