package view;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PuzzleView {
    
    private String text;
    private ArrayList<JButton> buttons = new ArrayList<JButton>();

    public PuzzleView(ArrayList<Integer> numbers) {
        JFrame frame = new JFrame("Puzzle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(displayBoard(numbers));
        frame.setVisible(true);
    }

    public JPanel displayBoard(ArrayList<Integer> numbers) {
        JPanel panel = new JPanel(new GridLayout(4, 4));

        for (Integer number : numbers) {
            
            if(number==0){
                text=" ";
            }
            else{
                text=number.toString();
            }
            JButton button = new JButton(text);
            this.buttons.add(button);
            panel.add(button);
        }

        return panel;
    }

    public ArrayList<JButton> getButtons() {
        return buttons;
    }
}