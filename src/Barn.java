import java.util.ArrayList;

public class Barn {
    private ArrayList<Plant> storedPlants;

    public Barn() {
        this.storedPlants = new ArrayList<Plant>();
    }

    public void storePlant(Plant plant) {
        storedPlants.add(plant);
    }

    public void removePlant(Plant plant) {
        storedPlants.remove(plant);
    }

    public ArrayList<Plant> getStoredPlants() {
        return storedPlants;
    }
}
