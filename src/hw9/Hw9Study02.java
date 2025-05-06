package hw9;

class Bank {   //銀行類別
	private int funds = 0; // 存款

	synchronized public void produce(int qty) {
		while (funds > 3000) {
			System.out.println("媽媽看到存款超過3000，暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		funds += qty;
		System.out.println("媽媽存了" + qty + "，帳戶共有:" + funds);
		notify();
	}

	synchronized public void consume(int qty) {
		while (funds < qty) {
			System.out.println("媽媽被熊大要求匯款!!");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		funds -= qty;
		System.out.println("熊大領了" + qty + "，帳戶共有:" + funds);
		if (funds < 2000) {
			System.out.println("熊大看到存款小於2000，要求匯款");
			notify();
		}
	}
}

class Producer extends Thread {
	Bank bank;

	public Producer(Bank bank) {
		this.bank = bank;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			bank.produce(2000); // 每次匯款2000元
	}
}

class Consumer extends Thread {
	Bank bank;

	public Consumer(Bank bank) {
		this.bank = bank;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			bank.consume(1000); // 每次消費1000元
	}
}

public class Hw9Study02 {
	
	public static void main(String[] args) {
//		熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領
//		錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
//		3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元
//		以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
//		大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢
//		已經入帳戶。假設媽媽一次匯款 2000 元,熊大一次提款
//		1000元,寫一個Java程式模擬匯款10次與提款10次的情
//		形。
		Bank bank = new Bank();
		Producer producer = new Producer(bank);
		Consumer consumer = new Consumer(bank);
		producer.start();
		consumer.start();
	}
}
