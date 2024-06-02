package model;
import java.util.ArrayList;
import java.util.Collections;

public class PuzzleModel {

    private ArrayList<Integer> numlist;
    private ArrayList<ArrayList<Integer>> board;

    public PuzzleModel() {

        numlist = new ArrayList<Integer>();
        board = new ArrayList<ArrayList<Integer>>();

        for (int i = 1; i < 16; i++) {
            numlist.add(i);
        }
        
        Collections.shuffle(numlist);

        numlist.add(0);
        

        for (int i = 0; i < 4; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>();

            for (int j = 0; j < 4; j++) {
                row.add(numlist.get(i * 4 + j));
            }

            board.add(row);
        }
    }

    public ArrayList<ArrayList<Integer>> getBoard() {
        return board;
    }

    public ArrayList<Integer> getNumlist() {
        return numlist;
    }

    public void setNumlist(ArrayList<Integer> numlist) {
        this.numlist = numlist;
    }

    public void setBoard(ArrayList<ArrayList<Integer>> board) {
        this.board = board;
    }

    public boolean checkMoveVertical(int number) {
        int index = numlist.indexOf(number);
        int row = index / 4;
        int col = index % 4;



}