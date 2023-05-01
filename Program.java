import java.util.Scanner;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean inShop = true;

        System.out.println("Магазин детских товар. Кое-что уже есть, проверь...");
        ListToy shop = new ListToy();
        Toy Cat = new Toy(1, "CAT", 2, 100);
        Toy Dog = new Toy(2, "DOG", 4, 50);
        shop.addToy(Cat);
        shop.addToy(Dog);

        while (inShop) {
            System.out.println();
            System.out.println("1 -> Добавить новые игрушки.");
            System.out.println("2 -> Посмотреть что есть в наличии.");

            // System.out.println("3 -> текст.");
            System.out.println("6 -> Выход.");

            System.out.println();
            System.out.printf("Твой выбор: ");
            int choice = console.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Добавляем новые игрушки:");

                    System.out.printf("Введите id игрушки: ");
                    int id = console.nextInt();
                    System.out.printf("Введите название игрушки: ");
                    String name = console.next();
                    System.out.printf("Введите количество игрушек: ");
                    int quantity = console.nextInt();
                    while (quantity <= 0) {
                        System.out.println("Количество должно быть больше 0.");
                        System.out.printf("Введите количество игрушек: ");
                        quantity = console.nextInt();
                    }

                    System.out.printf("Введите частоту выпадения игрушки: ");
                    int frequency = console.nextInt();
                    while (frequency < 0 || frequency > 100) {
                        System.out.println("Частота должна быть больше или равана 0 и меньше или равна 100.");
                        System.out.printf("Введите частоту выпадения игрушки: ");
                        frequency = console.nextInt();
                    }
                    Toy Toy = new Toy(id, name, quantity, frequency);
                    shop.addToy(Toy);
                    break;

                case 2:
                    shop.showAllToys();
                    break;

                case 6:
                    inShop = false;
                    break;
            
                default:
                    System.out.println();
                    System.out.println("Неверное значение, повторите выбор!");
                    break;
            }
        }
        console.close();
    }
}