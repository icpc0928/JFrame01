import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrame01 {
    int click_count = 0;

    public void addGridLayout(Container pane){
        pane.setLayout(new BorderLayout());
        Container inPane = new Container();
        inPane.setLayout(new GridLayout(3,3));

        JLabel label1 = new JLabel("01");
        JLabel label2 = new JLabel("02");
        JLabel label3 = new JLabel("03");
        JLabel label4 = new JLabel("04");
        JLabel label5 = new JLabel("05");
        JLabel label6 = new JLabel("06");
        JLabel label7 = new JLabel("07");
        JLabel label8 = new JLabel("08");
        JLabel label9 = new JLabel("09");
        inPane.add(label1);
        inPane.add(label2);
        inPane.add(label3);
        inPane.add(label4);
        inPane.add(label5);
        inPane.add(label6);
        inPane.add(label7);
        inPane.add(label8);
        inPane.add(label9);
        pane.add(inPane);

    }

    public void addComponentsToPane(Container pane){
        pane.setLayout(new BorderLayout());





        JButton btn = new JButton("ClickMe");
        btn.setFont(new Font("Courier New", Font.BOLD, 30));
        //監聽器 關鍵Code:
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                click_count++;
                btn.setText("Click: " + click_count + " times");
//                label1.setText("Click: " + click_count + "times");
            }
        });

//        pane.add(panel0,BorderLayout.NORTH);
        pane.add(btn,BorderLayout.CENTER);
    }

    //建構式
    public JFrame01(){
        JFrame frame = new JFrame("Title");
        //獲取螢幕解析度
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        //設定視窗大小佔螢幕四分之一
        frame.setSize(dimension.width / 2, dimension.height / 2);

        //設定視窗顯示在螢幕畫面正中間位置
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //在Pane 畫面中加入元件
        addComponentsToPane(frame.getContentPane());
        addGridLayout(frame.getContentPane());

        //frame.pack();
        frame.setVisible(true);
    }

    //程式進入點
    public static void main(String[] args){
        //使用invokeLater 確保UI在排程執行緒內
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrame01();
            }
        });
    }
}
