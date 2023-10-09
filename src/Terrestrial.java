public class Terrestrial extends Animal {
    private int nbrLegs;

    public Terrestrial(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
    public Terrestrial(){
        super();
    }

    @Override
    public String toString(){
        return super.toString() +
                "Nbr Legs = "+ nbrLegs;
    }
}
