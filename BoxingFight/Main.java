package BoxingFight;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter(1, "Rocky", 10, 120, 100, 100);
        Fighter f2 = new Fighter(2, " Ivan", 20, 85, 85, 0);

        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }
}
