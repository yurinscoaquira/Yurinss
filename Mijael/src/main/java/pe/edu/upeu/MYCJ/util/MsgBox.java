package pe.edu.upeu.MYCJ.util;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MsgBox {

    UtilsX obj = new UtilsX();
    JPanel p;
    ImageIcon icon = null;

    public MsgBox() {
    }
    

    public MsgBox(String msg, int tipoDialog, String iconPropio) {
        if (!iconPropio.trim().equals("")) {
            icon = new ImageIcon(obj.getFile(iconPropio));
            JOptionPane.showMessageDialog(p, msg, ":V", tipoDialog, icon);
        } else {
            JOptionPane.showMessageDialog(p, msg, ":V", tipoDialog);
        }
    }

    public int showConfirmCustom(String msg, String title, String iconPropio) {
        int input;
        // 0=ok, 2=cancel
        if (!iconPropio.trim().equals("")) {
            icon = new ImageIcon(obj.getFile(iconPropio));
            input = JOptionPane.showConfirmDialog(p, msg, title, JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            input = JOptionPane.showConfirmDialog(p, msg, title, JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return input;
    }

}
