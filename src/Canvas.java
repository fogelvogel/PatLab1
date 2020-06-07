import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Canvas extends JPanel {
	private static final long serialVersionUID = 1L;
private String[] colors = {"black","white","gray","blue","cyan"};
private double color;
private boolean first;
	private void doDrawing(Graphics g) { //собственно рисование всего на форме
		Graphics2D g2d = (Graphics2D) g;
		
		
		if (MyFrame.rep) {
			color = (Math.random());
			color*=100;
			color %=5;
			color = (int)color;
			switch((int)color) {
			case 0: {
				g2d.setColor(Color.black);
				break;
			}
			case 1: {
				g2d.setColor(Color.white);
				break;
			}
			case 2: {
				g2d.setColor(Color.gray);
				break;
			}
			case 3: {
				g2d.setColor(Color.blue);
				break;
			}
			case 4: {
				g2d.setColor(Color.cyan);
				break;
			}
			}
			switch(MyFrame.curMonkeyNumber) {
			case 1: {
				g2d.fillRect(10,30,45,45);   //первый
				g2d.setColor(Color.gray);
				g2d.fillRect(100,30,45,45);   //второй
				g2d.fillRect(10,130,45,45);
				g2d.fillRect(100,130,45,45);
				break;
			}
			
			case 2:  {
				g2d.fillRect(100,30,45,45);   //второй
				g2d.setColor(Color.gray);
				g2d.fillRect(10,30,45,45);   //первый
				g2d.fillRect(10,130,45,45);   //третий
				g2d.fillRect(100,130,45,45);
				break;
			}
			case 3:  {
				g2d.fillRect(10,130,45,45);   //третий
				g2d.setColor(Color.gray);
				g2d.fillRect(100,30,45,45);   //второй
				g2d.fillRect(10,30,45,45);   //первый
				g2d.fillRect(100,130,45,45);
				break;
			}
			case 4:  {
				g2d.fillRect(100,130,45,45);
				g2d.setColor(Color.gray);
				g2d.fillRect(10,130,45,45);   //третий
				g2d.fillRect(100,30,45,45);   //второй
				g2d.fillRect(10,30,45,45);   //первый
				break;
			}
			}
			g2d.drawString("Baboon", 10, 10);
			g2d.drawString("Orangutan", 95, 10);
			g2d.drawString("Chimp", 12, 115);
			g2d.drawString("Human", 100, 115);
			
		}
		else {
			g2d.setColor(Color.gray);
			g2d.drawString("Baboon", 10, 10);
			g2d.drawString("Orangutan", 95, 10);
			g2d.drawString("Chimp", 12, 115);
			g2d.drawString("Human", 100, 115);
			g2d.fillRect(10,30,45,45);   //первый
			g2d.fillRect(100,30,45,45);   //второй
			g2d.fillRect(10,130,45,45);
			g2d.fillRect(100,130,45,45);
		}
	}

	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
}
