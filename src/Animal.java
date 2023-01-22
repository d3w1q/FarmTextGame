public class Animal {
    private String name;
    private int buyCost;
    private int growDuration; //w tygodniach
    private int profit;
    private int age;
    private boolean isAdult;
    private String usage;

    public Animal(String name, int buyCost, int growDuration, int profit, String usage) {
        this.name = name;
        this.buyCost = buyCost;
        this.growDuration = growDuration;
        this.profit = profit;
        this.age = 0;
        this.isAdult = false;
        this.usage = usage;
    }

    public String getName() {
        return name;
    }

    public int getBuyCost() {
        return buyCost;
    }

    public int getGrowDuration() {
        return growDuration;
    }

    public int getProfit() {
        return profit;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public String getUsage() {
        return usage;
    }

    public void grow() {
        age++;
        if (age >= growDuration) {
            isAdult = true;
        }
    }

    Animal cow = new Animal("cow", 1000, 12, 200, "milk and meat");
    Animal pig = new Animal("pig", 2500, 8, 150, "meat");
    Animal chicken = new Animal("chicken", 50, 6, 75, "eggs and meat");
    Animal sheep = new Animal ("sheep", 80, 7, 200, "Wool, meat");
    Animal goose = new Animal("goose", 300, 12, 250, "Blood, feather");

    public Animal createAnimal(String name, int growDuration) {
        switch(name) {
            case "cow":
                return new Animal("cow", 100, growDuration, 200, "milk and meat");
            case "pig":
                return new Animal("pig", 80, growDuration, 150, "meat");
            case "chicken":
                return new Animal("chicken", 50, growDuration, 75, "eggs and meat");
            default:
                throw new IllegalArgumentException("Invalid animal name");
        }
    }


}
