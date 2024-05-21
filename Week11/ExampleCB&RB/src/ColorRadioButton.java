import javax.swing.JRadioButton;
import javax.swing.ImageIcon;

public class ColorRadioButton{

    public static JRadioButton Color(String color){
        JRadioButton radio = new JRadioButton();
        radio.setIcon(new ImageIcon("src/color/"+ color +".png"));
        radio.setRolloverIcon(new ImageIcon("src/colorHover/" + color + ".png"));
        radio.setSelectedIcon(new ImageIcon("src/colorSelected/" + color + ".png"));
        return radio;
    }

}
