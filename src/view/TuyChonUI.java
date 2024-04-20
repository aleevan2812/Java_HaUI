package view;

import util.IOptionEvent;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class TuyChonUI {

    private static final int CHAP_NHAN = 0;
    private static final int HUY_BO = 1;

    private IOptionEvent iOptionEvent;

    public void setOnHandleOptionEvent(IOptionEvent iOptionEvent) {
        this.iOptionEvent = iOptionEvent;
    }

    public void onCallGUI(Component parentComponent, String message, String title) {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        String[] options = {"Chấp Nhận", "Hủy Bỏ"};
        int res = JOptionPane.showOptionDialog(parentComponent, message, title, JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        switch (res) {
            case CHAP_NHAN -> iOptionEvent.onAcceptEvent();
            case HUY_BO, JOptionPane.CLOSED_OPTION -> iOptionEvent.onCancelEvent();
            default -> {
            }
        }
    }
}
