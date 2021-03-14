public class Human implements Units {
    private final String name;
    private final int runDist;
    private final int jumpHeight;

    public Human(String name, int dist, int jumpHeight) {
        this.name = name;
        this.runDist = dist;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println(this.name + " бежит: " + this.getDist());
    }

    @Override
    public void jump() {
        System.out.println(this.name + " прыгает: " + this.getHeight());
    }

    @Override
    public int getDist() {
        return this.runDist;
    }

    @Override
    public int getHeight() {
        return this.jumpHeight;
    }

}
