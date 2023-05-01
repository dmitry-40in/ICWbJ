/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        
        Toy Cat = new Toy(1, "CAT", 2, 100);
        // Cat.printInfo();

        Toy Dog = new Toy(2, "DOG", 4, 50);
        System.out.println(Dog.getQuantity());
        System.out.println(Dog.getFrequency());


        System.out.println("Магазин:");

        ListToy shop = new ListToy();
        shop.addToy(Cat);
        shop.addToy(Dog);
        shop.showAllToys();
        // shop.show();

    }
}