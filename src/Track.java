public class Track extends Interference {
    private final int length;

    public Track(String name, int length) {
        super(name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Units units) {
        System.out.println(super.getName() + "Длинна: " + this.length);
        units.run();
        if (getLength() <= units.getDist()) {
            System.out.println("хорошо");
            return true;
        } else {
            System.out.println("плохо");
            return false;
        }
    }
}
