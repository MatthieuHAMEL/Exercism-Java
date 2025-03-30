import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<String>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return (!myCollection.containsAll(theirCollection) && !theirCollection.containsAll(myCollection));  
    }

    // Assuming there is at least one set in the list
    static Set<String> commonCards(List<Set<String>> collections) {
        // Copy the first set
        var res = new HashSet<>(collections.get(0));

        // Eliminates all elements of res that are not in set, and do this on every set
        for (var set : collections) {
            res.retainAll(set); 
        }
        return res;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        var res = new HashSet<>(collections.get(0));
        for (var set : collections) {
            res.addAll(set);
        }
        return res;
    }
}
