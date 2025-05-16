public class Reptile extends Animal {
    protected  String color;
     public Reptile( String name,int age ,String color) {
         super(name,age);
         this.color = color;
     }
      public void setColor(String Newcolor) {
         this.color = Newcolor;


      }
     @Override
    public void move() {
         System.out.println("Reptile is moving");
     }
     public void makeSound() {
         System.out.println("Reptile is making sound");
     }
     public void displayInformation() {
         super.displayInformation();
         System.out.println("Reptile color is " + color);
     }
    public  void naturalHabitat() {
        System.out.println("Natural habitat of Reptiles is terrestrial and aquatic");
    }
}
