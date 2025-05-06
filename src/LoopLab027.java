import javax.swing.*;
import java.awt.*;

public class LoopLab027 extends JPanel {
    String type;
    int n;
    public LoopLab027(){
        type = JOptionPane.showInputDialog("Do you want an addition table or multiplication table? (A or M)");
        n = Integer.parseInt(JOptionPane.showInputDialog("How big do you want the table to be?"));  //總共需要的格子數量
    }

    @Override
    public void paintComponent(Graphics g){


        int w = getWidth();  //JFrame的寬度
        int h = getHeight();  //JFrame的高度
        int x = 0;  //設定最左上角位置
        int y = 0;  //設定最左上角位置
        int cellWidth = w/n; //總寬度除以需要的格子數量就是一格的寬度
        int cellHeight = h/n;  //總高度除以需要的格子數量就是一格的高度
        //nest for loop
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i == 1 || j == 1){
                    g.setColor(Color.yellow);
                    g.fillRect(x,y,cellWidth,cellHeight);
                }
                g.setColor(Color.black);
                g.drawRect(x,y,cellWidth,cellHeight);

                if(i==1){
                    g.drawString("" + j,x+5,y+15);
                } else if (j == 1) {
                    g.drawString("" + i,x+5,y+15);
                }else {
                    int value;
                    if(type.toLowerCase().equals("a")){
                        value = i+j;
                    }else{
                        value = i*j;
                    }
                    g.drawString("" + value, x+5, y+15);
                }

                x += cellWidth;
            }
            x=0;
            y += cellHeight;
        }
    }



    public static void main(String[] args) {
        JFrame windows = new JFrame();
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windows.setSize(400,400);  //設定寬、高長度
        windows.setContentPane(new LoopLab027());
        windows.setVisible(true);
    }
}
