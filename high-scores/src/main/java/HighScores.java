import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HighScores {

    private final ArrayList<Integer> scores;
    private final ArrayList<Integer> sorted_scores;

    public HighScores(List<Integer> highScores) {
        this.scores = new ArrayList<>(highScores);

        // Used in personalTopThree : not optimal of course! but simple here.
        this.sorted_scores = new ArrayList<>(highScores);
        this.sorted_scores.sort(null);
    }

    List<Integer> scores() {
        return this.scores;
    }

    Integer latest() {
        return this.scores.get(this.scores.size()-1);
    }

    Integer personalBest() {
        return Collections.max(this.scores);
    }

    // Assuming there is at least 3 elements in the list.
    List<Integer> personalTopThree() {
        // No neeed to sync sorted_scores with scores here since scores is final
        // Of course this is because the assignment didn't specify method mutating HighScores.
        int sz = this.sorted_scores.size();
        var res = new ArrayList<Integer>();

        if (sz == 0) {
          return res;
        }

        if (sz - 1 >= 0) {
            res.add(this.sorted_scores.get(this.sorted_scores.size() - 1));
        }
        if (sz - 2 >= 0) {
            res.add(this.sorted_scores.get(this.sorted_scores.size() - 2));
        }
        if (sz - 3 >= 0) {
            res.add(this.sorted_scores.get(this.sorted_scores.size() - 3));
        }
        return res;
    }

}
