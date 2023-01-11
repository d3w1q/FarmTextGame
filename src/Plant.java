public class Plant {
    private String name;
    private int costOfPreparation; //w przeliczeniu na hektar
    private int costOfProtection; //w przeliczeniu na hektar
    private int yield; //w tonach z hektara
    private int growDuration; //w tygodniach
    private int sowingPeriodStart; // tydzień roku, kiedy można siać
    private int sowingPeriodEnd; // tydzień roku, kiedy można siać
    private int harvestingCost; //w przeliczeniu na hektar
    private int sellPricePerKg;

    public Plant(String name, int costOfPreparation, int costOfProtection, int yield, int growDuration, int sowingPeriodStart, int sowingPeriodEnd, int harvestingCost, int sellPricePerKg) {
        this.name = name;
        this.costOfPreparation = costOfPreparation;
        this.costOfProtection = costOfProtection;
        this.yield = yield;
        this.growDuration = growDuration;
        this.sowingPeriodStart = sowingPeriodStart;
        this.sowingPeriodEnd = sowingPeriodEnd;
        this.harvestingCost = harvestingCost;
        this.sellPricePerKg = sellPricePerKg;
    }

    public String getName() {
        return name;
    }

    public int getCostOfPreparation() {
        return costOfPreparation;
    }

    public int getCostOfProtection() {
        return costOfProtection;
    }

    public int getYield() {
        return yield;
    }

    public int getGrowDuration() {
        return growDuration;
    }

    public int getSowingPeriodStart() {
        return sowingPeriodStart;
    }

    public int getSowingPeriodEnd() {
        return sowingPeriodEnd;
    }

    public int getHarvestingCost() {
        return harvestingCost;
    }

    public int getSellPricePerKg() {
        return sellPricePerKg;
    }

}
