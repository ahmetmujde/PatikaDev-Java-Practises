package BoxingFight;

public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int firstFighter;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            firstFighter = isFirstFighter();
            System.out.println("First Fighter is ID = " + firstFighter);

            while (this.f1.health > 0 && this.f2.health > 0) {

                System.out.println("\n===== New Round =====");

                if (firstFighter == f1.fighterId) {
                    this.f2.health = this.f1.hit(f2);
                    if (isWİn()) {
                        break;
                    }

                    this.f1.health = this.f2.hit(f1);
                    if (isWİn()) {
                        break;
                    }
                } else {
                    this.f1.health = this.f2.hit(f1);
                    if (isWİn()) {
                        break;
                    }

                    this.f2.health = this.f1.hit(f2);
                    if (isWİn()) {
                        break;
                    }
                }

                System.out.println(this.f1.name + " Health " + this.f1.health);
                System.out.println(this.f2.name + " Health " + this.f2.health);
            }
        } else {
            System.out.println("Branch of sportsman's not same");
        }
    }

    boolean isCheck() {
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
    }

    boolean isWİn() {
        if (this.f1.health == 0) {
            System.out.println("\n" + this.f2.name + "Winner!");
            return true;
        }

        if (this.f2.health == 0) {
            System.out.println("\n" + this.f1.name + "Winner!");
            return true;
        }

        return false;
    }

    int isFirstFighter() {
        double randomNumber = Math.random() * 100;

        if (randomNumber < 50) {
            return 1;
        } else {
            return 2;
        }

    }
}
