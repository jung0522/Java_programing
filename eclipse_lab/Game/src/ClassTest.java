import java.util.TimerTask;

import java.util.Timer;

public class ClassTest {

	public static void main(String[] args) throws InterruptedException {

		

		// daemon ���� ����.

		Timer t = new Timer(true);



		TimerTask task1 = new MyTimeTask();

		System.out.println("task1 �� ��� �Ŀ� ����˴ϴ�.");



		TimerTask task2 = new YourTimeTask();

		System.out.println("task2�� 10�� �Ŀ� ����˴ϴ�.");



		t.schedule(task1, 100000);

		t.schedule(task2, 1000000);



		Thread.sleep(11000); // ���� �ñ��� ���

		System.out.println("���� ��� ���� �����մϴ�.");



	}

}

class MyTimeTask extends TimerTask {



	@Override

	public void run() {

		// TODO Auto-generated method stub

		System.out.println("�̰��� ���� ���ϴ� �۾��Դϴ�.");

	}



}






class YourTimeTask extends TimerTask {



	@Override

	public void run() {

		// TODO Auto-generated method stub

		

	}

	

}






