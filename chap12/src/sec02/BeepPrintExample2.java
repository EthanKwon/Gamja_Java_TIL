package sec02;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		
		//how1
//		Thread thread = new Thread();
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5;i++) {
					toolkit.beep();
					try { Thread.sleep(500);} catch(Exception e) {}
				}
			}
		};
//		Runnable beepTask = new BeepTask();
		
		//how2
		/*Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5;i++) {
					toolkit.beep();
					try { Thread.sleep(500);} catch(Exception e) {}
				}
			}
		});*/
		
		//how3
		/*Thread thread = new Thread(()-> {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5;i++) {
					toolkit.beep();
					try { Thread.sleep(500);} catch(Exception e) {}
				}
		});*/
		
		thread.start();
		
		for(int i=0; i<5;i++) {
			System.out.println("띵");
			try { Thread.sleep(500);} catch(Exception e) {}
		}
	}

}
