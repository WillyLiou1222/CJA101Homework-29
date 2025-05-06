import javax.swing.*;
import java.awt.*;

public class JavaGUITest025 extends JPanel {

    @Override
    public void paintComponent(Graphics g){
//        int width = getWidth();
//        int height = getHeight();
//
//        //g.drawString("Hello World", 100, 100);  //劃出string,位置
//        g.setColor(Color.BLACK);  //設定顏色
//        g.fillRect(0,0,width,height);  //畫長方形
//        // g.setColor(Color.RED);  //設定顏色
//        g.drawLine(10,10,50,50);  //畫線
//          g.drawOval(0,0,200,200); //畫圓形
          ImageIcon img = new ImageIcon("Pokemon_0007_Squirtle.png");
          img.paintIcon(null,g,50,50);  //畫圖形

    }

    public static void main(String[] args) {
        JFrame window = new JFrame();  //設定window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300,300);
        window.setContentPane(new JavaGUITest025());
        window.setVisible(true);
    }
}
