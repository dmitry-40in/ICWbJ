import java.util.ArrayList;
import java.util.Random;

public class ListToy {
    private ArrayList<Toy> toyList;

    public ListToy() {
        this.toyList = new ArrayList<Toy>();
    }

    public void addToy(Toy toyInShop) {
        this.toyList.add(toyInShop);
    }

    public void showAllToys() {
        for (Toy toy : toyList) {
            toy.printInfo();
        }
    }

    public void changeFrequency(int id, int frequency) {
        for (Toy toy : toyList) {
            if (toy.getId() == id) {
                toy.setFrequency(frequency);
                break;
            }
        }
    }

    public boolean checkId(int id) {
        for (Toy toy : toyList) {
            if (toy.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public String playAToy() {
        Random random = new Random();

        int totalFrequency = 0;
        for (Toy toy : toyList) {
            totalFrequency += toy.getFrequency();
        }

        int selectedFrequency = random.nextInt(totalFrequency);
        int currentFrequency = 0;

        for (Toy toy : toyList) {
            currentFrequency += toy.getFrequency();
            if (selectedFrequency < currentFrequency) {
                toy.setQuantity(toy.getQuantity() - 1);
                if (toy.getQuantity() <= 0) {
                    toyList.remove(toy);
                }
                return toy.printInfoForPrize();
            }
        }
        return null;
    }

    public void writePrizeToyToFile(Toy toy, String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
        writer.write(toy.getId() + "," + toy.getName() + "\n");
        writer.close();
    }

    

}
