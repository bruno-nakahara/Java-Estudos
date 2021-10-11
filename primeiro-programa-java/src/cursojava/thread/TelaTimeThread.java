package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout());//Painel de componentes
	
	private JLabel hour = new JLabel("Time Thread 1");
	private JTextField showTime = new JTextField();
	
	private JLabel hour2 = new JLabel("Time Thread 2");
	private JTextField showTime2 = new JTextField();
	
	private JButton jButtonStart = new JButton("Start");
	private JButton jButtonStop = new JButton("Stop");
	private JButton jButtonRestart = new JButton("Restart");
	
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			while(true) {
				showTime.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	
	private Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			while(true) {
				showTime2.setText(new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(Calendar.getInstance().getTime()));
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	
	private Thread thread1Time;
	private Thread thread2Time;
	
	public TelaTimeThread() {
		// TODO Auto-generated constructor stub
		
		setTitle("Minha primeira tela");
		setSize(new Dimension(300, 300));
		setLocationRelativeTo(null);
		setResizable(false);
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();//Gerenciador de posicionamento de componentes
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
		hour.setPreferredSize(new Dimension(200, 25));
		jPanel.add(hour, gridBagConstraints);
		
		showTime.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		showTime.setEditable(false);
		jPanel.add(showTime, gridBagConstraints);
		
		hour2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(hour2, gridBagConstraints);
		
		showTime2.setPreferredSize(new Dimension(200, 25));
		showTime2.setEditable(false);
		gridBagConstraints.gridy ++;
		jPanel.add(showTime2, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1;
		
		jButtonStart.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(jButtonStart, gridBagConstraints);
		
		jButtonStop.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx ++;
		jPanel.add(jButtonStop, gridBagConstraints);
		
		jButtonRestart.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(jButtonRestart, gridBagConstraints);
		
		jButtonRestart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				showTime2.setText("");
				showTime.setText("");
			}
		});
		
		jButtonStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				thread1Time = new Thread(thread1);
				thread1Time.start();
				
				thread2Time = new Thread(thread2);
				thread2Time.start();
				
				jButtonStop.setEnabled(true);
				jButtonStart.setEnabled(false);
				jButtonRestart.setEnabled(false);
			}
		});
		
		jButtonStop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				thread1Time.stop();
				thread2Time.stop();
				
				jButtonStop.setEnabled(false);
				jButtonStart.setEnabled(true);
				jButtonRestart.setEnabled(true);
			}
		});
		
		jButtonStop.setEnabled(false);
		jButtonRestart.setEnabled(false);
		
		add(jPanel, BorderLayout.WEST);
		//Sempre será ultimo comando
		setVisible(true);//Torna a tela visivel
	}
}
