package view;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Frame;
import java.io.IOException;
import java.io.File;

/**
 * The PuzzleView class represents the view component of the puzzle game.
 * It is responsible for displaying the game board and updating it as the game progresses.
 */
public class PuzzleView {

    private String text;
    private ArrayList<JButton> buttons = new ArrayList<JButton>();
    private JFrame frame = new JFrame(" ");
    private Font customfont;

    /**
     * Constructs a PuzzleView object.
     * Initializes the frame and loads the custom font.
     */
    public PuzzleView() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setResizable(false);
        frame.setVisible(true);
        try {
            loadFont();
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads the custom font from a file.
     *
     * @throws FontFormatException if the font file is not in the correct format.
     * @throws IOException if an I/O error occurs while reading the font file.
     */
    public void loadFont() throws FontFormatException, IOException {
        customfont = Font.createFont(Font.TRUETYPE_FONT, new File("assets/font.ttf"));
        customfont = customfont.deriveFont(Font.PLAIN, 46);
    }

    /**
     * Displays the game board on the frame.
     *
     * @param board the game board represented as a 2D ArrayList of integers.
     * @param frame the frame on which the board will be displayed.
     */
    public void displayBoard(ArrayList<ArrayList<Integer>> board, Frame frame) {
        JPanel panel = new JPanel(new GridLayout(4, 4));

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                text = board.get(i).get(j) == 0 ? " " : Integer.toString(board.get(i).get(j));
                JButton button = new JButton(text);
                button.setIcon(new ImageIcon("assets/tile.png"));
                button.setHorizontalTextPosition(JButton.CENTER);
                button.setVerticalTextPosition(JButton.CENTER);
                button.setFont(customfont);
                button.setForeground(new java.awt.Color(188, 108, 37));
                button.setBorderPainted(false);
                button.setRolloverIcon(new ImageIcon("assets/tileHover.png"));
                panel.add(button);
                buttons.add(button);
            }
        }

        frame.add(panel);
        frame.revalidate();
    }

    /**
     * Updates the game board with the new values.
     *
     * @param board the updated game board represented as a 2D ArrayList of integers.
     */
    public void updateBoard(ArrayList<ArrayList<Integer>> board) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                text = board.get(i).get(j) == 0 ? " " : Integer.toString(board.get(i).get(j));
                buttons.get(i * 4 + j).setText(text);
            }
        }
    }

    /**
     * Displays a "Congratulations" message when the puzzle is solved.
     */
    public void solved() {
        frame.getContentPane().removeAll();
        JPanel panel2 = new JPanel(new GridLayout(2, 1));
        panel2.setBackground(new java.awt.Color(221, 161, 94));
        JLabel label1 = new JLabel("Congratulations!");
        label1.setFont(customfont.deriveFont(Font.PLAIN, 40));
        label1.setForeground(new java.awt.Color(188, 108, 37));
        label1.setHorizontalAlignment(JLabel.CENTER);
        JLabel label2 = new JLabel("You solved the puzzle!");
        label2.setFont(customfont.deriveFont(Font.PLAIN, 24));
        label2.setForeground(new java.awt.Color(188, 108, 37));
        label2.setHorizontalAlignment(JLabel.CENTER);
        panel2.add(label1);
        panel2.add(label2);
        frame.add(panel2);
    }

    /**
     * Returns the frame.
     *
     * @return the frame.
     */
    public JFrame getFrame() {
        return frame;
    }

    /**
     * Returns the list of buttons on the game board.
     *
     * @return the list of buttons.
     */
    public ArrayList<JButton> getButtons() {
        return buttons;
    }
}