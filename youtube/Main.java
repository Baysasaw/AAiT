public class Main {
    public static void main(String[] args){
       // Animal animal = new Animal();
        //animal.whoAmI();

        Mammal mammal = new Mammal();
        mammal.whoAmI();

        Bird bird = new Bird();
        bird.whoAmI();

        Animal animal = new Bird();
        animal.whoAmI();
    }
    
}