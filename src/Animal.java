public class Animal {
    //les attributs
    private String family;
    private String name;
    private int age;
    boolean isMammal;

    Animal(){

    }
    //na3mlou l consturcteur bech n3ayytoulou f class main
    Animal(String family, String name, int age, boolean isMammal){
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=0){
            this.age = age;
        }else{
            System.out.println("L'age doit etre positif");
        }

    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==""){
            System.out.println("Le nom d'un zoo ne doit pas etre vide");
            return;
        }
        this.name = name;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    //les methodes
    @Override
    public String toString() {
        return "Animal [family=" + family + ", name=" + name + ", age=" + age + ", isMammal=" + isMammal + "]";
    }

    
}
