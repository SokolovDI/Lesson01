public abstract class Interference {
    private final String name;

    public Interference(String name) {
        this.name = name;
    }

    abstract boolean moving(Units units);

    public String getName() {
        return name;
    }
}

