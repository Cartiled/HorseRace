package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

import funtion.Threads;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrinView extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private JPanel panel = null;
	
	
	private int prio1 = 0;
	private int prio2 = 0;
	private int prio3 = 0;
	private int prio4 = 0;
	
	private Threads h1 = null;
	private Threads h2 = null;
	private Threads h3 = null;
	private Threads h4 = null;
	
	private JProgressBar caballo1 = null;
	private JProgressBar caballo2 = null;
	private JProgressBar caballo3 = null;
	private JProgressBar caballo4 = null;
	
	public PrinView(ArrayList<JPanel> panels) {
		panel = new JPanel();
		panel.setBounds(0,0,597,402);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Caballo 1");
		lblNewLabel.setBounds(23, 66, 75, 34);
		panel.add(lblNewLabel);
		
		caballo1 = new JProgressBar();
		caballo1.setForeground(new Color(255, 128, 192));
		caballo1.setBounds(109, 55, 325, 46);
		panel.add(caballo1);
		caballo1.setStringPainted(true);
		
		JLabel lblCaballo = new JLabel("Caballo 2");
		lblCaballo.setBounds(23, 132, 75, 34);
		panel.add(lblCaballo);
		
		caballo2 = new JProgressBar();
		caballo2.setForeground(new Color(128, 0, 255));
		caballo2.setBounds(109, 120, 325, 46);
		panel.add(caballo2);
		caballo2.setStringPainted(true);
		
		JLabel lblNewLabel_1_1 = new JLabel("Caballo 3");
		lblNewLabel_1_1.setBounds(23, 202, 75, 34);
		panel.add(lblNewLabel_1_1);
		
		caballo3 = new JProgressBar();
		caballo3.setForeground(new Color(0, 255, 255));
		caballo3.setBounds(109, 190, 325, 46);
		panel.add(caballo3);
		caballo3.setStringPainted(true);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Caballo 4");
		lblNewLabel_1_1_1.setBounds(23, 268, 75, 34);
		panel.add(lblNewLabel_1_1_1);
		
		caballo4 = new JProgressBar();
		caballo4.setForeground(new Color(255, 128, 0));
		caballo4.setBounds(109, 256, 325, 46);
		panel.add(caballo4);
		caballo4.setStringPainted(true);
		
		JLabel lblGanador = new JLabel("Ganador:");
		lblGanador.setBounds(190, 10, 219, 34);
		panel.add(lblGanador);
		
		JButton btnNewButton = new JButton("Empezar a la carreara");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				runThread();
			}
		});
		btnNewButton.setBounds(162, 326, 219, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Gestionar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panels.get(0).setVisible(false);
				panels.get(1).setVisible(true);

			}
		});
		btnNewButton_1.setBounds(476, 326, 89, 23);
		panel.add(btnNewButton_1);
	}

	public JPanel getPanel() {
		return panel;
	}
	
	public void runThread() {
		
		h1 = new Threads("hilo1",caballo1);
		h2 = new Threads("hilo2",caballo2);
		h3 = new Threads("hilo3",caballo3);
		h4 = new Threads("hilo4",caballo4);
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		
	}
	public void setPrio() {
		h1.setPriority(prio1);
		h2.setPriority(prio2);
		h3.setPriority(prio3);
		h4.setPriority(prio4);
	}

	public int getPrio1() {
		return prio1;
	}

	public void setPrio1(int prio1) {
		this.prio1 = prio1;
	}

	public int getPrio2() {
		return prio2;
	}

	public void setPrio2(int prio2) {
		this.prio2 = prio2;
	}

	public int getPrio3() {
		return prio3;
	}

	public void setPrio3(int prio3) {
		this.prio3 = prio3;
	}

	public int getPrio4() {
		return prio4;
	}

	public void setPrio4(int prio4) {
		this.prio4 = prio4;
	}
	
}
