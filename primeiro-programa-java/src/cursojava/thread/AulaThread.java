package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		new Thread() {
			public void run() {//executa código da rotina
				for (int pos = 0; pos < 10; pos++) {
					
					System.out.println("============Testando===========");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();	
		
		System.out.println("=============Fim=============");
		JOptionPane.showMessageDialog(null, "Sistema continua executando no fundo");
	}
}
