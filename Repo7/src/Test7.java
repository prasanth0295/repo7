import java.util.Date;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<11;i++) {
			System.out.println("Iteration Number from Test6 class is :"+i);
			Thread.sleep(2500);
			System.out.println("***************************************************"+new Date().toString());
		}

	}

}