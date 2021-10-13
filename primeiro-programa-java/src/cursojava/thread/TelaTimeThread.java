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
	
	private JLabel hour = new JLabel("Nome:");
	private JTextField showTime = new JTextField();
	
	private JLabel hour2 = new JLabel("E-mail:");
	private JTextField showTime2 = new JTextField();
	
	private JButton jButtonAdd = new JButton("Add");
	private JButton jButtonStop = new JButton("Stop");
	
	private ImplementQueueThread queue = new ImplementQueueThread();
	
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
		jPanel.add(showTime, gridBagConstraints);
		
		hour2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(hour2, gridBagConstraints);
		
		showTime2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(showTime2, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1;
		
		jButtonAdd.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(jButtonAdd, gridBagConstraints);
		
		jButtonStop.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx ++;
		jPanel.add(jButtonStop, gridBagConstraints);
		
		jButtonAdd.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (queue == null) {
					queue = new ImplementQueueThread();
					queue.start();
				}
				
				for(int qtd = 0; qtd < 50; qtd++) {
					ObjectQueueThread queueThread = new ObjectQueueThread();
					queueThread.setName(showTime.getText());
					queueThread.setEmail(showTime2.getText() + " - " + qtd);
					
					queue.add(queueThread);
				}
			}
		});
		
		jButtonStop.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				queue.stop();
				queue = null;
			}
		});
		
		queue.start();
		add(jPanel, BorderLayout.WEST);
		//Sempre será ultimo comando
		setVisible(true);//Torna a tela visivel
	}
}
