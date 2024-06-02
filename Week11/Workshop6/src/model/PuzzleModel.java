package model;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PuzzleModel{
    private ArrayList<Integer> numlist;
    private ArrayList<ArrayList<Integer>> board;
    
    public PuzzleModel(){

        numlist = new ArrayList<Integer>();
        board = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i < 15; i++){
            numlist.add(i+1);
        }

        Collections.shuffle(numlist);
        numlist.add(0);

        for (int i = 0; i < 4; i++){
            ArrayList<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < 4; j++){
                row.add(numlist.get(i*4+j));
            }
            board.add(row);
        }
    }

    public void move(int row, int col){
        if (row > 0 && board.get(row-1).get(col) == 0){
            board.get(row-1).set(col, board.get(row).get(col));
            board.get(row).set(col, 0);
        }
        else if (row < 3 && board.get(row+1).get(col) == 0){
            board.get(row+1).set(col, board.get(row).get(col));
            board.get(row).set(col, 0);
        }
        else if (col > 0 && board.get(row).get(col-1) == 0){
            board.get(row).set(col-1, board.get(row).get(col));
            board.get(row).set(col, 0);
        }
        else if (col < 3 && board.get(row).get(col+1) == 0){
            board.get(row).set(col+1, board.get(row).get(col));
            board.get(row).set(col, 0);
        }
 
    }

    public ArrayList<ArrayList<Integer>> getBoard(){
        return board;
        }

    public boolean isSolved(){
        ArrayList<ArrayList<Integer>> targetBoard = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> row2 = new ArrayList<>(Arrays.asList(5, 6, 7, 8));
        ArrayList<Integer> row3 = new ArrayList<>(Arrays.asList(9, 10, 11, 12));
        ArrayList<Integer> row4 = new ArrayList<>(Arrays.asList(13, 14, 15, 0));
        targetBoard.add(row1);
        targetBoard.add(row2);
        targetBoard.add(row3);
        targetBoard.add(row4);

        return board.equals(targetBoard);
        }
}