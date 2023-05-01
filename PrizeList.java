import java.util.ArrayList;

public class PrizeList {
    private ArrayList<String> prizeList;

    public PrizeList() {
        this.prizeList = new ArrayList<String>();
    }

    public void addPrize(String prize) {
        this.prizeList.add(prize);
    }

    public void showAllPrizes() {
        for (String prize : prizeList) {
            System.out.println(prize);
        }
    }

    public String givePrize() {
        String prizeToGive = prizeList.get(0);
        prizeList.remove(0);
        return prizeToGive;
    }
}
