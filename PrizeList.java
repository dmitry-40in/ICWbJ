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

    public boolean checkPrizeList() {
        if (prizeList.size() != 0 ) {
            return true;
        }
        else {
            return false;
        }
    }

    public String givePrize() {
        String prizeToGive = new String();
        if (prizeList.size() != 0 ) {
            prizeToGive = prizeList.get(0);
            prizeList.remove(0);
            
        }
        return prizeToGive;        
    }
}
