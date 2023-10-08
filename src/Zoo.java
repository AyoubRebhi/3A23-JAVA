import java.util.Arrays;

public class Zoo {

    private Animal[] animals;
    private String name;
    private String city ;
    private static final int NBR_CAGES=5;
    private int nbrAnimal;
    Zoo(String name,String city){
        this.name=name;
        this.city=city;
        this.animals=new Animal[5];
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public int getNbrAnimal() {
        return nbrAnimal;
    }

    public static int getNbrCages() {
        return NBR_CAGES;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setNbrAnimal(int nbrAnimal) {
        this.nbrAnimal = nbrAnimal;
    }

    public void displayZoo() {
        System.out.println("Nom du zoo: " + this.name);
        System.out.println("Ville du zoo: " + this.city);
        System.out.println("Nombre de cages: " + this.NBR_CAGES);
        System.out.println("Nombre d'animals: " + this.nbrAnimal);
    }
    boolean addAnimal(Animal animal){
        if(!isZooFull()){
            animals[nbrAnimal]=animal;
            nbrAnimal++;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isZooFull(){
        if(nbrAnimal>=NBR_CAGES){
            return true;
        }
        return false;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if(z1.nbrAnimal>z2.nbrAnimal){
            return z1;
        }
        else{
            return z2;
        }
    }

    public String afficherAnimal(){
        String s="";
        for (int i=0;i<this.nbrAnimal;i++){
            s+=animals[i].toString()+"\n";
        }
        return s;
    }

    public int searchAnimal(Animal animal){
        int j = -1;
        for(int i=0;i<=this.nbrAnimal;i++){
            if(animal.getName() == animals[i].getName()){
                return i;
            }
        }

        return j;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + NBR_CAGES +
                ", nbrAnimal=" + nbrAnimal +
                '}';
    }
}
