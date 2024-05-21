import javax.swing.*;
import java.awt.*;

/**
 * The Window class represents a graphical window that allows users to select colors and apply decorators to an image.
 * It extends the JFrame class to create a window with a specific layout and components.
 */
public class Window extends JFrame {

    /**
     * Constructs a new Window object.
     * Sets up the frame with a title, size, layout, and default close operation.
     * Creates radio buttons for color selection and checkboxes for decorator selection.
     * Adds action listeners to the radio buttons to set the selected color in the ImageManager.
     * Adds an action listener to the "Show Image" button to process the selected decorators and display the image.
     * Displays the frame.
     */
    public Window() {

        // Set up the frame
        setTitle("Color Selection");
        setSize(650, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 4));

        ImageManager imageManager = new ImageManager();

        ButtonGroup group = new ButtonGroup();


        // Create the radio buttons

        JRadioButton red = ColorRadioButton.Color("red");
        JRadioButton orange = ColorRadioButton.Color("orange");
        JRadioButton yellow = ColorRadioButton.Color("yellow");
        JRadioButton green = ColorRadioButton.Color("green");
        JRadioButton blue = ColorRadioButton.Color("blue");
        JRadioButton purple = ColorRadioButton.Color("purple");

        // Add the radio buttons to the group
        group.add(red);
        group.add(orange);
        group.add(yellow);
        group.add(green);
        group.add(blue);
        group.add(purple);

        // Add an action listener to the radio buttons

        red.addActionListener(e -> {
            imageManager.setColor("red");
        });
        orange.addActionListener(e -> {
            imageManager.setColor("orange");
        });
        yellow.addActionListener(e -> {
            imageManager.setColor("yellow");
        });
        green.addActionListener(e -> {
            imageManager.setColor("green");
        });
        blue.addActionListener(e -> {
            imageManager.setColor("blue");
        });
        purple.addActionListener(e -> {
            imageManager.setColor("purple");
        });


        // create the CheckBoxes

        JCheckBox check1 = DecoratorCheckBox.CheckBox("Dec1");
        JCheckBox check2 = DecoratorCheckBox.CheckBox("Dec2");
        JCheckBox check3 = DecoratorCheckBox.CheckBox("Dec3");

        // Add the radio buttons to the frame
        add(red);
        add(orange);
        add(yellow);
        add(green);
        add(blue);
        add(purple);
        add(check1);
        add(check2);
        add(check3);

        JButton showImage = new JButton("Show Image");
        showImage.addActionListener(e -> {
            imageManager.ProcessImages(check1.isSelected(), check2.isSelected(), check3.isSelected());
            imageManager.showImage();
        });
        add(showImage);

        // Display the frame
        setVisible(true);
    }

    /**
     * The entry point of the program.
     * Creates a new Window object to start the application.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Window();
    }
}
