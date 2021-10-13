package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementQueueThread extends Thread {

		private static ConcurrentLinkedQueue<ObjectQueueThread> queue_child = 
				new ConcurrentLinkedQueue<ObjectQueueThread>();
		
		public static void add(ObjectQueueThread objectQueueThread) {
			queue_child.add(objectQueueThread);
		}
		
		@Override
		public void run() {
						
			while(true) {
				
				synchronized (queue_child) {//Bloqueio de acesso a esta lista por outros processos. Ninguem acessa até terminar
					Iterator iterator = queue_child.iterator();		
					
					while (iterator.hasNext()) {//Enquanto tiver dados, continua
						
						ObjectQueueThread process = (ObjectQueueThread) iterator.next();
						
						System.out.println(process.getName());
						System.out.println(process.getEmail());
						
						iterator.remove();
						
						try {
							Thread.sleep(100);//Descarga de memória
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					try {
						Thread.sleep(1000);//Limpeza de memória
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}			
		}	
}
