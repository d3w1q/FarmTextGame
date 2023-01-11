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
}
