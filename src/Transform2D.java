import java.awt.*;
import javax.swing.*;

public class Transform2D extends JPanel {

    public static void main(String[] args) {
        var frame = new JFrame("My Pentagon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Transform2D());
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        var g2d = (Graphics2D) g;
        var x = getWidth() / 2;
        var y = getHeight() / 2;
        int[] xPoints = new int[5];
        int[] yPoints = new int[5];
        var angle = 2 * Math.PI / 5;
        for (int i = 0; i < 5; i++) {
            var theta = i * angle + Math.PI / 2;
            xPoints[i] = x + (int) (150 * Math.cos(theta));
            yPoints[i] = y - (int) (150 * Math.sin(theta));
        }
        g2d.setColor(Color.RED);
        g2d.drawPolygon(xPoints, yPoints, 5);
    }
}
