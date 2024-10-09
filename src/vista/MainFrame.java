package vista;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public JFrame frame = null;
	private ArrayList<JPanel> panels = null;
	
	
	public void intializePanel() {
		frame = new JFrame();
		frame.setBounds(0,0,597,402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panels = new ArrayList<JPanel>();
		
		PrinView prinView = new PrinView(panels);
		JPanel panel1 = prinView.getPanel();
		panel1.setVisible(true);
		panels.add(panel1);
		frame.getContentPane().add(panel1);
		
		
		PriorityView priorityView = new PriorityView(panels);
		JPanel panel2 = priorityView.getPanel2();
		panel2.setVisible(false);
		panels.add(panel2);
		frame.getContentPane().add(panel2);
		

		
		frame.setVisible(true);
		
	
	}

}
