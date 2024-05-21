import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

public class DecoratorCheckBox {

    public static JCheckBox CheckBox(String decorate){
        JCheckBox check = new JCheckBox();
        check.setIcon(new ImageIcon("src/Decorate/"+ decorate +".png"));
        check.setRolloverIcon(new ImageIcon("src/DecorateHover/" + decorate + ".png"));
        check.setSelectedIcon(new ImageIcon("src/DecorateSelected/" + decorate + ".png"));
        return check;
    }

}
