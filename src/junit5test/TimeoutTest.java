package junit5test;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeoutTest {
	@Test
	@Timeout(2)
	public void timeoutsTest() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Test passed within the 1 second");
	}
	@Test
	@Timeout(2)
	public void timeoutTest1() throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Test passed within the 1 second");
	}
	@Test
	public void timeoutTest2() throws InterruptedException {
		assertTimeout(Duration.ofSeconds(2), ()->delaySeconds(1));
		System.out.println("Test passed within the 1 second");
	}
	private void delaySeconds(int seconds) throws InterruptedException {
		TimeUnit.SECONDS.sleep(seconds);
//		Thread.sleep(seconds*1000);
	}
}
