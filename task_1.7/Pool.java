public class Pool {

    private int length;
    private int width;
    private int height;

    public Pool(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int calculateVolume() {
        return length * width * height * 1000;
    }
}
