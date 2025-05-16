
public class ZooManagement {
    public static void main(String[] args) {

        System.out.println("MAMMALS:");
       Mammal lion = new Mammal( "Criro",12,4);
       Mammal kangaroo = new Mammal( "Ronney",12,2);
        System.out.println("ACTIONS:");
       lion.eat();
       kangaroo.eat();
       kangaroo.makeSound();
       lion.eat();

        System.out.println();
        System.out.println("Information about mammals:");
       kangaroo.displayInformation();
       kangaroo.naturalHabitat();

        System.out.println("BIRDS:");
       Bird  eagle = new Bird("Yamal", 7,"Summer");
       Bird sparrow = new Bird("Pedri", 3,"Winter");
        System.out.println("ACTIONS:");
        eagle.makeSound();
        sparrow.move();
        System.out.println();
        System.out.println(" Location of birds:");
        sparrow.checkCountry();
        eagle.checkCountry();
        System.out.println();
        System.out.println("Information about birds:");
        eagle.displayInformation();
        eagle.naturalHabitat();
        System.out.println();

        System.out.println("REPTILES:");
        Reptile turtle = new Reptile("Mbappe", 23,"Brown and Green");
        Reptile chameleon = new Reptile("Gavi", 5,"Orange");
        System.out.println("ACTIONS:");
        turtle.makeSound();
        chameleon.move();
        chameleon.setColor("Blue");
        System.out.println("Information about reptiles:");
        chameleon.displayInformation();
        chameleon.naturalHabitat();
        System.out.println();
        turtle.displayInformation();
        turtle.naturalHabitat();
    }
}