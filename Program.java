import java.util.Scanner;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean inShop = true;
        int id;
        String name;
        int quantity;
        int frequency;
        String prize;
        int choice;

        System.out.println("Магазин детских товар. Кое-что уже есть, проверь...");
        ListToy shop = new ListToy();
        Toy Cat = new Toy(1, "CAT", 2, 10);
        Toy Dog = new Toy(2, "DOG", 4, 20);
        shop.addToy(Cat);
        shop.addToy(Dog);

        PrizeList prizeList = new PrizeList();

        while (inShop) {
            System.out.println();
            System.out.println("1 -> Добавить новые игрушки.");
            System.out.println("2 -> Посмотреть, что есть в наличии.");
            System.out.println("3 -> Изменить частоту выпадания игрушки.");
            System.out.println("4 -> Разыграть игрушку.");
            System.out.println("5 -> Посмотреть список призов.");
            System.out.println("6 -> Выдать призовую игрушку.");
            System.out.println("7 -> Выход.");

            System.out.println();
            System.out.printf("Твой выбор: ");
            choice = console.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Добавляем новые игрушки:");

                    System.out.printf("Введите id игрушки: ");
                    id = console.nextInt();
                    while (shop.checkId(id)) {
                        System.out.printf("Игрушка с таким id уже существует, введите новый: ");
                        id = console.nextInt();
                    }
                    System.out.printf("Введите название игрушки: ");
                    name = console.next();
                    System.out.printf("Введите количество игрушек: ");
                    quantity = console.nextInt();
                    while (quantity <= 0) {
                        System.out.println("Количество должно быть больше 0.");
                        System.out.printf("Введите количество игрушек: ");
                        quantity = console.nextInt();
                    }

                    System.out.printf("Введите частоту выпадения игрушки: ");
                    frequency = console.nextInt();
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

                case 3:
                    System.out.printf("Введите id игрушки: ");
                    id = console.nextInt();
                    System.out.printf("Новая частота равна: ");
                    frequency = console.nextInt();
                    shop.changeFrequency(id, frequency);
                    System.out.println("Частота выпадания игрушки изменена");
                    break;
                
                case 4:
                    System.out.println("Разыгрываем игршку...");
                    prize = shop.playAToy();
                    prizeList.addPrize(prize);
                    System.out.printf("Приз: %s\n", prize);
                    break;
                
                case 5:
                    System.out.println("Список призов:");
                    prizeList.showAllPrizes();
                    break;

                case 6:
                    
                    // System.out.printf("Призовая игрушка: \"%s:%s\"выдана.", prizeList[0]);
                    break;
                    
                case 7:
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