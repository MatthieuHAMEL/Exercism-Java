import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    private Random random = new Random();

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    // Constructor is important ; I initialize the characteristics 
    // once for all : don't roll the dices every time we run getters like getStrength() ! ..
    DnDCharacter() {
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
    }
    /**
     * @param scores 4 dice scores (1 to =6)
     * @return
     */
    int ability(List<Integer> scores) {
        int min = 7;
        int sum = 0;
        for (int elt : scores) {
            if (elt < min) {
                min = elt;
            }
            sum += elt;
        }
        return sum - min;
    }

    List<Integer> rollDice() {
        var res = new ArrayList<Integer>(4);
        for (int i = 0; i < 4; i++) {
            res.add(i, 1 + this.random.nextInt(6)); 
        }
        return res;
    }

    int modifier(int input) {
        return (int) Math.floor(((double) input - 10.0) / 2.0);
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return 10 + this.modifier(this.constitution);   
    }
}
