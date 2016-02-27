import puzzle.Puzzle;
import puzzle.PuzzleGenerator;
import rules.Rule;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String args[]) {
        List<Rule> rules = new ArrayList<Rule>();
        int[][] puzzle = new int[6][6];
        PuzzleGenerator.genPuzzle(puzzle, rules);
        PuzzleGenerator.printPuzzle(puzzle);
        PuzzleGenerator.printRules(rules);
    }

}
