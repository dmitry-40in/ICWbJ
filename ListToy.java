import java.util.ArrayList;

public class ListToy {
    private ArrayList<Toy> toyList;

    public ListToy() {
        this.toyList = new ArrayList<Toy>();
    }

    public void addToy(Toy toyInShop) {
        this.toyList.add(toyInShop);
    }

    // public void remove Toy - может и не нуден, удалять автоматически как колв-во =0
    
    public void showAllToys() {
        for (Toy toy : toyList) {
            toy.printInfo();
        }
    }

    // public void show() {
    //     for (int i = 0; i < toyShop.size(); i++) {
    //         System.out.println(i);
    //     }
    // }
}
