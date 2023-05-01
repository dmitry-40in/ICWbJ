public abstract class AbstractToy {
    private int id;
    private String name;
    private int quantity;
    private int frequency;

    public AbstractToy (int id, String name, int quantity, int frequency) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.frequency = frequency;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void printInfo() {
        System.out.printf("Игрушка \"%s\": ID %d, кол-во %d шт., частота выпадения %d%%\n", name, id, quantity, frequency);
    }
}
