package hw9;


public class Hw9Study01 implements Runnable {
	int counter = 1;
	 //產生 500~3000 的隨機整數（毫秒）
    int sleepTime = (int)(Math.random() * (3000 - 500 + 1)) + 500;
    private String joinMan;
    
    public Hw9Study01(String joinMan) {
    	this.joinMan = joinMan;
	}
	
	@Override
	public void run() { // 執行緒執行的地方
		while (counter <= 10) {
			System.out.println(joinMan+"吃第"+counter+"碗飯");
			counter++;

			try {
				Thread.sleep(sleepTime); // 暫停一秒
			} catch (Exception e) {
			}
			
		}
		System.out.println("吃完了");
	}
	public static void main(String[] args) {
//		開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//		競賽過程。
//		• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//		Sleep時間由亂數產生500~3000之間的毫秒數,如圖所示
//		• 參考範例:CounterRunnable.java
//		• 需留意主執行緒執行順序
		Hw9Study01 r1 = new Hw9Study01("饅頭人");// 產生Runnable物件
		Thread t1 = new Thread(r1); // 再由Runnable物件, 產生執行緒Thread物件
		Hw9Study01 r2 = new Hw9Study01("詹姆士");
		Thread t2 = new Thread(r2);
		t1.start(); // 呼叫執行緒物件的start()方法(即啟動執行緒) , 隨即執行物件中的run方法
		t2.start();
		
		try {
			t1.join(); // 主執行緒等饅頭人吃完
			t2.join(); // 主執行緒等詹姆士吃完
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("比賽結束!!");
	}
}
