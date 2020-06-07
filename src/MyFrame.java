import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

//import practice2016.Canvas;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame {

	
	public static Canvas panel;
	private JFrame frmMonkey;
	private Monkey curr;
	public static boolean rep;
	public static int curMonkeyNumber;
	//private curActionNumber;
	private Baboon baboon;
	private Orangutan orangutan;
	private Chimp chimp;
	private Human human;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame window = new MyFrame();
					window.frmMonkey.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void checkForPaint(int act) {
		switch(act) {
		case 1: {
			curr.performRun();
			rep = curr.isRun();
			break;
		}
		case 2: {
			curr.performSwim();
			rep = curr.isSwim();
			break;
		}
		case 3: {
			curr.performQuaver();
			rep = curr.isQuaver();
			break;
		}
		case 4: {
			curr.performImitate();
			rep = curr.isImitate();
			break;
		}
		}
	}
	
	/**
	 * Create the application.
	 */
	public MyFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		baboon = new Baboon();
		orangutan = new Orangutan();
		chimp = new Chimp();
		human = new Human();
		
		panel = new Canvas();
		panel.setBounds(220, 10, 200, 220);
		
		frmMonkey = new JFrame();
		frmMonkey.setTitle("Monkey");
		frmMonkey.setBounds(100, 100, 450, 300);
		frmMonkey.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMonkey.getContentPane().setLayout(null);
		frmMonkey.getContentPane().add(panel);
		panel.repaint();
		
		JRadioButton rdbtnBaboon = new JRadioButton("Baboon");
		rdbtnBaboon.setSelected(true);
		JRadioButton rdbtnOrangutan = new JRadioButton("Orangutan");
		JRadioButton rdbtnChimp = new JRadioButton("Chimp");
		JRadioButton rdbtnHuman = new JRadioButton("Human");

		rdbtnBaboon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				curr = baboon;
				curMonkeyNumber = 1;
			
				rdbtnOrangutan.setSelected(false);
				rdbtnChimp.setSelected(false);
				rdbtnHuman.setSelected(false);
				
			}
		});
		
		rdbtnBaboon.setBounds(10, 7, 100, 23);
		frmMonkey.getContentPane().add(rdbtnBaboon);
		
		
		rdbtnOrangutan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				curr = orangutan;
				curMonkeyNumber = 2;
		
				rdbtnBaboon.setSelected(false);
				rdbtnChimp.setSelected(false);
				rdbtnHuman.setSelected(false);
			}
		});
		rdbtnOrangutan.setBounds(10, 26, 109, 23);
		frmMonkey.getContentPane().add(rdbtnOrangutan);
		
	
		rdbtnChimp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				curr = chimp;
				curMonkeyNumber = 3;
			
				rdbtnOrangutan.setSelected(false);
				rdbtnBaboon.setSelected(false);
				rdbtnHuman.setSelected(false);
			}
		});
		rdbtnChimp.setBounds(10, 52, 109, 23);
		frmMonkey.getContentPane().add(rdbtnChimp);
		
		rdbtnHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				curr = human;
				curMonkeyNumber = 4;
			
				rdbtnOrangutan.setSelected(false);
				rdbtnChimp.setSelected(false);
				rdbtnBaboon.setSelected(false);
			}
		});
		rdbtnHuman.setBounds(10, 78, 109, 23);
		frmMonkey.getContentPane().add(rdbtnHuman);
		
		JButton btnRun = new JButton("Run");
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkForPaint(1);
				System.out.println(rep);
				panel.repaint();
			}
		});
		btnRun.setBounds(10, 108, 91, 23);
		frmMonkey.getContentPane().add(btnRun);
		
		JButton btnSwim = new JButton("Swim");
		btnSwim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkForPaint(2);
				System.out.println(rep);
				panel.repaint();
			}
		});
		btnSwim.setBounds(10, 142, 91, 23);
		frmMonkey.getContentPane().add(btnSwim);
		
		JButton btnQuaver = new JButton("Quaver");
		btnQuaver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkForPaint(3);
				System.out.println(rep);
				panel.repaint();
			}
		});
		btnQuaver.setBounds(10, 176, 91, 23);
		frmMonkey.getContentPane().add(btnQuaver);
		
		JButton btnImitate = new JButton("Imitate");
		btnImitate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				checkForPaint(4);
				System.out.println(rep);
				panel.repaint();
			}
		});
		btnImitate.setBounds(10, 210, 91, 23);
		frmMonkey.getContentPane().add(btnImitate);
	}
}
