public class GameMaster {
    public String describe(Character c) {
        // "You're a level <LEVEL> <CLASS> with <HIT_POINTS> hit points."
        return "You're a level " + c.getLevel() + " " + c.getCharacterClass() + 
            " with " + c.getHitPoints() + " hit points.";
    }

    public String describe(Destination d) {
        return "You've arrived at " + d.getName() + ", which has " + 
            d.getInhabitants() + " inhabitants.";
    }

    public String describe(TravelMethod tm) {
        return "You're traveling to your destination " + 
            ((tm == TravelMethod.HORSEBACK) 
            ? "on horseback."
            : "by walking.");
    }
    
    public String describe(Character c, Destination d, TravelMethod tm) {
        return describe(c) + " " + describe(tm) + " " + describe(d);
    }

    public String describe(Character c, Destination d) {
        return describe(c, d, TravelMethod.WALKING);
    }
}
