package sec06_newinstance;

public class NewInstanceExample {
	public static void main(String[] args) {
		Class clazz = null;
		long time = System.currentTimeMillis();
		
		try {
			if(time % 2 == 0)
				clazz = Class.forName("sec06_newinstance.SendAction");
			else
				clazz = Class.forName("sec06_newinstance.ReceiveAction");
			//Class clazz = Class.forName("sec06_newinstance.SendAction");
			//Class clazz = Class.forName("sec06_newinstance.ReceiveAction");
			
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
