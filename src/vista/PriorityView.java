package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;

import funtion.Threads;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PriorityView extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel2 = null;
	private JTextField prioCaballo1 = null;
	private JTextField prioCaballo2 = null;
	private JTextField prioCaballo3 = null;
	private JTextField prioCaballo4 = null;


	
	public PriorityView(ArrayList<JPanel> panels) {
		
		panel2 = new JPanel();
		panel2.setBounds(0,0,450,342);
		panel2.setLayout(null);
		JLabel lblNewLabel = new JLabel("Caballo 1");
		lblNewLabel.setBounds(39, 67, 84, 27);
		panel2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Caballo 2");
		lblNewLabel_1.setBounds(39, 118, 84, 27);
		panel2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Caballo 3");
		lblNewLabel_2.setBounds(39, 172, 84, 27);
		panel2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Caballo 4");
		lblNewLabel_3.setBounds(39, 228, 84, 27);
		panel2.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Gestionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrinView printView = new PrinView(panels);
				printView.setPrio1(Integer.parseInt(prioCaballo1.getText()));
				printView.setPrio2(Integer.parseInt(prioCaballo2.getText()));
				printView.setPrio3(Integer.parseInt(prioCaballo3.getText()));
				printView.setPrio4(Integer.parseInt(prioCaballo4.getText()));
				printView.setPrio();
			}
			
		});
		btnNewButton.setBounds(80, 278, 101, 27);
		panel2.add(btnNewButton);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panels.get(0).setVisible(true);
				panels.get(1).setVisible(false);
			}
		});
		btnVolver.setBounds(238, 280, 101, 27);
		panel2.add(btnVolver);
		
		PrinView printView = new PrinView(panels);
		
		
		prioCaballo1 = new JTextField();
		prioCaballo1.setBounds(115, 70, 181, 20);
		panel2.add(prioCaballo1);
		prioCaballo1.setColumns(10);
		
		prioCaballo1.setText(printView.getPrio1() + "");
		
		prioCaballo2 = new JTextField();
		prioCaballo2.setColumns(10);
		prioCaballo2.setBounds(115, 121, 181, 20);
		panel2.add(prioCaballo2);
		
		prioCaballo2.setText(printView.getPrio2() + "");
		
		prioCaballo3 = new JTextField();
		prioCaballo3.setColumns(10);
		prioCaballo3.setBounds(115, 175, 181, 20);
		panel2.add(prioCaballo3);
		
		prioCaballo3.setText(printView.getPrio3() + "");
		
		prioCaballo4 = new JTextField();
		prioCaballo4.setColumns(10);
		prioCaballo4.setBounds(115, 231, 181, 20);
		panel2.add(prioCaballo4);
		
		prioCaballo4.setText(printView.getPrio4() + "");
		
	}


	public JPanel getPanel2() {
		return panel2;
	}
	

}
