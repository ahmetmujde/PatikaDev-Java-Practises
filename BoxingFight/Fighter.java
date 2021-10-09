package BoxingFight;

public class Fighter {
    int fighterId;
    String name;
    int damage;
    int health;
    int weight;
    int dodge;


    Fighter(int fighterId, String name, int damage, int health, int weight, int dodge) {
        this.fighterId = fighterId;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;


        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }

    }

    int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " took - " + this.damage + " damage");

        if (foe.isDodge()) {
            System.out.println("************************");
            System.out.println(foe.name + "damage is blocked +" + this.damage);
            System.out.println("************************");
        }

        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }

}
