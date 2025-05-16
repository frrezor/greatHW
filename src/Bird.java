public class Bird  extends Animal{
    protected String season;
     public Bird( String name,int age, String season) {
         super(name, age);
         this.season = season;
     }

    public String getSeason() {
        return season;
    }

     public void checkCountry() {
         if (season.equals("Winter")) {
             System.out.println("Bird in the Africa");
         }
         else {
             System.out.println("Bird in the Europe");
         }
     }
    @Override
     public void move() {
         System.out.println("Bird is moving");
    }
    public void makeSound() {
         System.out.println("Bird is making sound");
    }
    public void displayInformation() {
         super.displayInformation();
         System.out.println("Current season: " + season);
    }
    public  void naturalHabitat() {
        System.out.println("Natural habitat of Birds is air-terrestrial");
    }


}
