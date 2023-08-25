import java.awt.*;


public class Exercício3 extends Canvas{

	public static void main(String[] args) {
		Frame frame = new Frame("Desenho Simples");
		Exercício3 canvas = new Exercício3();
		
		frame.add(canvas);
		frame.setSize(500, 200);
		frame.setVisible(true);
	}
	
	public void paint(Graphics g) {
		 // Bandeira do Brasil
		g.setColor(new Color(0, 56, 168));
        g.fillRect(0, 0, 200, 200);

        g.setColor(new Color(252, 209, 22));
        int[] xPoints = {100, 200, 100, 0};
        int[] yPoints = {0, 100, 200, 100};
        g.fillPolygon(xPoints, yPoints, 4);

        g.setColor(new Color(27, 102, 47));
        g.fillOval(50, 50, 100, 100);
    }
}
