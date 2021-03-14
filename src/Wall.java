public class Wall extends Interference {
    private final int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    protected boolean moving(Units units) {
        System.out.println(super.getName() + "Высота: " + this.height);
        units.jump();

        if (getHeight() <= units.getHeight()) {
            System.out.println("хорошо");
            return true;
        } else {
            System.out.println("плохо");
            return false;
        }
    }
}
