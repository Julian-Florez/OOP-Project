import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

/**
 * The DecoratorCheckBox class provides a static method to create a customized JCheckBox with decorated icons.
 */
public class DecoratorCheckBox {

    /**
     * Creates a customized JCheckBox with decorated icons.
     * 
     * @param decorate The name of the decoration to be applied to the checkbox.
     * @return The customized JCheckBox.
     */
    public static JCheckBox CheckBox(String decorate){
        JCheckBox check = new JCheckBox();
        check.setIcon(new ImageIcon("src/Decorate/"+ decorate +".png"));
        check.setRolloverIcon(new ImageIcon("src/DecorateHover/" + decorate + ".png"));
        check.setSelectedIcon(new ImageIcon("src/DecorateSelected/" + decorate + ".png"));
        return check;
    }

}
