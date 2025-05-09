class Fighter {
    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10 : 6;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {
    private boolean spellPrepared;
    Wizard() {
        this.spellPrepared = false;
    }

    @Override
    boolean isVulnerable() {
        return !this.spellPrepared;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return this.spellPrepared ? 12 : 3;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    void prepareSpell() {
        this.spellPrepared = true;
    }


}
