import javax.swing.*;
import java.awt.*;

public class JFrame02 {
    public static void buildConstraints(GridBagConstraints con, int gx, int gy, int gw, int gh, int wx, int wy){
        con.gridx = gx;
        con.gridy = gy;
        con.gridwidth = gw;
        con.gridheight = gh;
        con.weightx = wx;
        con.weighty = wy;
    }

    public static void main(String[] args){
        JFrame mainFrame = new JFrame("Title");
        mainFrame.setSize(290, 150);
        JPanel panel = new JPanel();
        GridBagLayout gbLayout = new GridBagLayout();
        GridBagConstraints gbBagContraints = new GridBagConstraints();
        panel.setLayout(gbLayout);

        //新增 標籤
        JLabel nameLB = new JLabel("Name", JLabel.LEFT);
        buildConstraints(gbBagContraints, 0, 0, 1, 1, 10, 10);
        gbBagContraints.fill = GridBagConstraints.NONE;
        gbBagContraints.anchor = GridBagConstraints.EAST;
        gbLayout.setConstraints(nameLB, gbBagContraints);
        panel.add(nameLB);
        //新增標籤
        JLabel nameLB2 = new JLabel("HEllo");
        buildConstraints(gbBagContraints, 1, 0, 1, 1, 90, 0);
        gbBagContraints.fill = GridBagConstraints.HORIZONTAL;
        gbBagContraints.anchor=GridBagConstraints.EAST;
        gbLayout.setConstraints(nameLB2, gbBagContraints);
        panel.add(nameLB2);

        mainFrame.setContentPane(panel);
        mainFrame.setVisible(true);
    }
}
