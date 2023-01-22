import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Farm myFarm = new Farm("Moja farma", 0, 0, 1000);
        int landPrice = 250;
        int start_week = 1;
        int current_week = start_week;

        System.out.println("Witaj w grze tekstowej symulującej pracę właściciela farmy!");
        System.out.println("Twoja farma nazywa się " + myFarm.getName() + " i ma rozmiar " + myFarm.getSize() + " hektarów.");
        System.out.println("Posiadasz " + myFarm.getNumberOfBuildings() + " budynków i " + myFarm.getCash() + " PLN.");
        System.out.println("Twoim zadaniem w tej grze jest jak najszybsze osiągnięcie statusu rolnika doskonałego, który posiada co najmniej 20 hektarów, 5 różnych gatunków zwierząt hodowlanych, 5 różnych gatunków upraw i jedzenie dla wszystkich swoich zwierząt na rok.");

        if (current_week == start_week) {
            System.out.println("Rozpoczynamy grę w pierwszym tygodniu roku 2020!");
        } else {
            System.out.println("Gra trwa od pierwszego tygodnia roku 2020");
        }
        while (true) {
            System.out.println("Co chcesz zrobić? (wpisz help, jeśli potrzebujesz pomocy)");
            String input = scanner.nextLine();

            if (input.equals("help")) {
                System.out.println("Lista dostępnych poleceń:");
                System.out.println("- buy land [size]: Zakup pola o podanym rozmiarze (cena bazowa wynosi 500 oraz co cztery tygodnie zwiększa się ona co 500)");
                System.out.println("- buy building [cost]: Zakup budynku za podaną cenę");
                System.out.println("- buy animal [name] [cost]: Zakup zwierzęcia o podanej nazwie i cenie");
                System.out.println("- plant [name]: Posadź roślinę o podanej nazwie na twoim polu uprawnym");
                System.out.println("- harvest [name]: Zbierz roślinę o podanej nazwie");
                System.out.println("- sell animal [name]: Sprzedaj zwierzę o podanej nazwie");
                System.out.println("- feed animal [name]: Karm zwierzę o podanej nazwie");
                System.out.println("- status: Wyświetl stan Twojej farmy oraz obecny tydzień");
                System.out.println("- sw: Przejdź do następnego tygodnia");
                System.out.println("- exit: Wyjdź z gry");
                continue;
            }
            if (input.startsWith("buy land")) {
                String[] commands = input.split(" ");
                int size = Integer.parseInt(commands[2]);
                int cost = landPrice * size;
                if(myFarm.getCash() < cost) {
                    System.out.println("Nie masz wystarczającej ilości gotówki, aby kupić to pole.");
                    continue;
                }
                myFarm.buyLand(size, cost);
                System.out.println("Zakupiłeś " + size + " hektarów ziemi za " + cost + " PLN.");
                continue;
            }
            if (input.startsWith("buy building")) {
                String[] commands = input.split(" ");
                int cost = Integer.parseInt(commands[2]);
                myFarm.buyBuilding(cost);
                System.out.println("Zakupiłeś budynek za " + cost + " PLN.");
                continue;
            }
            if (input.startsWith("buy animal")) {
                String[] commands = input.split(" ");
                String name = commands[2];
                int cost = Integer.parseInt(commands[3]);
                myFarm.buyAnimal(name, cost);
                System.out.println("Kupiłeś " + name + " za " + cost + " PLN.");
                continue;
            }
            if (input.startsWith("plant")) {
                String[] commands = input.split(" ");
                String name = commands[1];
                myFarm.plant(name);
                System.out.println("Posadziłeś " + name + ".");
                continue;
            }
            if (input.startsWith("harvest")) {
                String[] commands = input.split(" ");
                String name = commands[1];
                myFarm.harvest(name);
                System.out.println("Zebrano " + name + ".");
                continue;
            }
            if (input.startsWith("sell animal")) {
                String[] commands = input.split(" ");
                String name = commands[2];
                myFarm.sellAnimal(name);
                System.out.println("Sprzedałeś " + name + ".");
                continue;
            }
            if (input.startsWith("feed animal")) {
                String[] commands = input.split(" ");
                String name = commands[2];
                myFarm.feedAnimal(name);
                System.out.println("Nakarmiłeś " + name + ".");
                continue;
            }
            if (input.equals("status")) {
                System.out.println("Stan Twojej farmy:");
                System.out.println("- Rozmiar: " + myFarm.getSize() + " hektarów");
                System.out.println("- Liczba budynków: " + myFarm.getNumberOfBuildings());
                System.out.println("- Gotówka: " + myFarm.getCash() + " PLN");
                System.out.println("- Aktualny tydzień roku 2020: " + current_week);
                continue;
            }
            if (input.equals("sw")) {
                current_week++;
                if (current_week % 4 == 0) {
                    landPrice += 500;
                    System.out.println("Cena za hektar wzrosła do " + landPrice + " PLN");
                }
                System.out.println("Przeskoczono do tygodnia " + current_week);
                continue;
            }
            if (input.equals("exit")) {
                System.out.println("Dziękujemy za grę! Do zobaczenia!");
                break;
            }
            System.out.println("Nieznane polecenie. Wpisz help, jeśli potrzebujesz pomocy.");

        }
    }
}