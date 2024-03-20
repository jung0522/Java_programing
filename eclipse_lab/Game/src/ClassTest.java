import java.util.TimerTask;

import java.util.Timer;

public class ClassTest {

	public static void main(String[] args) throws InterruptedException {

		

		// daemon 으로 지정.

		Timer t = new Timer(true);



		TimerTask task1 = new MyTimeTask();

		System.out.println("task1 은 잠시 후에 실행됩니다.");



		TimerTask task2 = new YourTimeTask();

		System.out.println("task2는 10초 후에 실행됩니다.");



		t.schedule(task1, 100000);

		t.schedule(task2, 1000000);



		Thread.sleep(11000); // 실행 시까지 대기

		System.out.println("이제 모든 것을 종료합니다.");



	}

}

class MyTimeTask extends TimerTask {



	@Override

	public void run() {

		// TODO Auto-generated method stub

		System.out.println("이것은 제가 원하는 작업입니다.");

	}



}






class YourTimeTask extends TimerTask {



	@Override

	public void run() {

		// TODO Auto-generated method stub

		

	}

	

}






