public class Pegasus extends Horse {

    public Pegasus(String name, boolean isFantastic, boolean canFly, boolean canRun) {
        super(name, isFantastic, canFly, canRun);
    }

    public void fly() {
        System.out.println("Игого, я полетел(а)");
    }

}
