import java.util.Scanner;
//https://www.w3schools.com/java/java_user_input.asp
public class ZooManagement {
    public static void main(String[] args){

        Animal lion = new Animal("lion family","Symba",10,true);
        Animal chat = new Animal("cat family","Tom",10,true);
        Animal chien = new Animal("dog family","Rex",10,true);
        Animal panda = new Animal("panda family","Red Panda",10,true);
        Animal cerf = new Animal("deer family","Ghozlen",10,true);


        Zoo myZoo = new Zoo("Friguia","Tunis");
        Zoo myZoo2 = new Zoo("Youbi","Kairouan");

        myZoo.displayZoo();

        // Affichage du zoo en utilisant System.out.println() et toString()
        //System.out.println(myZoo);
        //System.out.println(myZoo.toString());
        //ya3tiw nafs resultat
        myZoo.addAnimal(chat);
        myZoo.addAnimal(lion);
        myZoo.addAnimal(chien);
        myZoo.afficherAnimal();
        //System.out.println(myZoo.afficherAnimal());
        //System.out.println("La case de chien est : l"+myZoo.searchAnimal(chien));

        //System.out.println(myZoo.isZooFull());

        myZoo2.addAnimal(panda);
        myZoo2.addAnimal(cerf);
        //System.out.println(Zoo.comparerZoo(myZoo,myZoo2));

        //Prosit 3
        Aquatic a = new Aquatic();
        Dolphin d = new Dolphin();
        Penguin p = new Penguin();
        Terrestrial t = new Terrestrial();

        a.toString();
        d.toString();
        p.toString();
        t.toString();

        a.swim();
        d.swim();

    }
}
