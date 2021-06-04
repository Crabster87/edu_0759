public class Horse extends Animal {

    public Horse(String name, boolean isFantastic, boolean canFly, boolean canRun) {
        super(name, isFantastic, canFly, canRun);
    }

    public void run() {
        System.out.println("Игого, я поскакал(а)");
    }

}
