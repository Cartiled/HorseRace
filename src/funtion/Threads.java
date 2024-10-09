package funtion;

import javax.swing.JProgressBar;

public class Threads extends Thread {
	private JProgressBar bar = null;
	public Threads(String nom,JProgressBar bar) {
		
		super(nom);
		this.bar = bar;
	}
	
	public void run() {
		for(int i = 0; i < 101; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			bar.setValue(i);
		}
	}
}
