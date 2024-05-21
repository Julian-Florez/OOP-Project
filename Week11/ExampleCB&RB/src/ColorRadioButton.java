import javax.swing.JRadioButton;
import javax.swing.ImageIcon;

/**
 * The ColorRadioButton class represents a custom radio button with different color options.
 */
public class ColorRadioButton {

    /**
     * Creates a new JRadioButton with the specified color.
     *
     * @param color the color of the radio button
     * @return a JRadioButton with the specified color
     */
    public static JRadioButton Color(String color) {
        JRadioButton radio = new JRadioButton();
        radio.setIcon(new ImageIcon("src/color/" + color + ".png"));
        radio.setRolloverIcon(new ImageIcon("src/colorHover/" + color + ".png"));
        radio.setSelectedIcon(new ImageIcon("src/colorSelected/" + color + ".png"));
        return radio;
    }

}
