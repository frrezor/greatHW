public class Mammal extends Animal {
    protected int numberOfLegs;
    public Mammal( String name,int age ,int numberOfLegs) {
        super(name, age);
        this.numberOfLegs = numberOfLegs;
    }
     public int getNumberOfLegs() {
        return numberOfLegs;
     }

    public void  eat() {
        System.out.println("Mammal is eating");
    }

     @Override
      public void move () {
        System.out.println("Mammal is moving");
     }
     public void makeSound() {
        System.out.println("Mammal is making sound");
     }
     public void displayInformation() {
        super.displayInformation();
        System.out.println("Mammal has " + numberOfLegs + " legs");
     }

    public  void naturalHabitat() {
        System.out.println("Natural habitat of Mammals is terrestrial and aquatic");
    }



}
