public class Aquatic extends Animal {
    private String habitat;

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public Aquatic(String habitat) {
        this.habitat = habitat;
    }
    public Aquatic(){
        super();
    }

    public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString(){
        return super.toString() +
                "Habitat = "+ habitat;
    }
}
