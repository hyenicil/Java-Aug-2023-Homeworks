package csd;

import java.util.Random;
import java.util.Scanner;

class App {

    public static void main(String[] args) {
        CrapsSimulationApp.run();
    }
}

class CrapsSimulationApp {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            System.out.print("Kaç oyun oynancak: ");
            int count = Integer.parseInt(scanner.nextLine());
            if(count <= 0)
                return;

            System.out.println("=======================================");
            CrapsSimulation simulation = new CrapsSimulation(rand);

            simulation.run(count);
            System.out.printf("Kazanma Olasılığı:%f%n", simulation.p);
            System.out.println("------------------------------------------------");
        }
    }
}

class CrapsSimulation {
    public double p;
    public Random random;

    public CrapsSimulation() {
        random = new Random();
    }

    public CrapsSimulation(Random r) {
        random = r;
    }

    public void run(int count) {
        int winCount = 0;
        for(int i = 0; i < count; i++) {
            Craps craps = new Craps(random);
            craps.play();
            if(craps.win)
                winCount++;
        }
        p = (double) winCount / count;
    }
}

class Craps {
    public boolean win;
    public Random random;

    public int rollDice()
    {
        return random.nextInt(1, 7) + random.nextInt(1, 7);
    }

    public void rollDiceForIndeterminate(int result) {
        int total = 0;
        while ((total = rollDice()) != result && total != 7)
            ;

        win = total == result;
    }

    public Craps()
    {
        random = new Random();
    }

    public Craps(Random r)
    {
        random = r;
    }

    public void play()
    {
        int total = rollDice();

        switch (total) {
            case 7, 11 -> win = true;
            case 2, 3, 12 -> win = false;
            default -> rollDiceForIndeterminate(total);
        }
    }
}