package view;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import controller.PuzzleController;

public class PuzzleView {

    private String text;

    public PuzzleView(ArrayList<Integer> numbers, ArrayList<ArrayList<Integer>> board, PuzzleController controller) {
        JFrame frame = new JFrame("Puzzle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(displayBoard(numbers, board, controller));
        frame.setVisible(true);
    }

    public JPanel displayBoard(ArrayList<Integer> numbers, ArrayList<ArrayList<Integer>> board, PuzzleController controller) {
        JPanel panel = new JPanel(new GridLayout(4, 4));

        for (Integer number : numbers) {
            
            if(number==0){
                text=" ";
            }
            else{
                text=number.toString();
            }
            JButton button = new JButton(text);
            button.addActionListener(e -> {
                controller.check_move_vertical(number);
            });
            panel.add(button);
        }

        return panel;
    }
}