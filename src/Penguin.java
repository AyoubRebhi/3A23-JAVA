public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
    public Penguin(){
        super();
    }

    @Override
    public String toString(){
        return super.toString() +
                "Swimming Depth = "+ swimmingDepth;
    }
}
