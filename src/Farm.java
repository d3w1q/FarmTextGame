public class Farm {
    private String name;
    private int size;
    private int numberOfBuildings;
    private int availableLand;
    private int cash;
    private int numberOfAnimals;
    private Barn barn;

    public Farm(String name, int size, int numberOfBuildings, int cash) {
        this.name = name;
        this.size = size;
        this.numberOfBuildings = numberOfBuildings;
        this.availableLand = size;
        this.cash = cash;
        this.barn = new Barn();
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getNumberOfBuildings() {
        return numberOfBuildings;
    }

    public int getAvailableLand() {
        return availableLand;
    }

    public int getCash() {
        return cash;
    }

    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public void buyLand(int size, int cost) {
        if (cash >= cost) {
            availableLand += size;
            cash -= cost;
        } else {
            System.out.println("Nie masz wystarczającej ilości gotówki, aby kupić to pole.");
        }
    }

    public void buyBuilding(int cost) {
        if (cash >= cost) {
            numberOfBuildings++;
            cash -= cost;
        } else {
            System.out.println("Nie masz wystarczającej ilości gotówki, aby kupić ten budynek.");
        }
    }

    public void buyAnimal(int number, int cost) {
        if (cash >= cost) {
            numberOfAnimals += number;
            cash -= cost;
        } else {
            System.out.println("Nie masz wystarczającej ilości gotówki, aby kupić te zwierzęta.");
        }
    }

    public Barn getBarn() {
        return barn;
    }

    public void buyAnimal(String name, int cost) {
    }

    public void plant(String name) {
    }

    public void harvest(String name) {
    }

    public void sellAnimal(String name) {
    }

    public void feedAnimal(String name) {
    }
}