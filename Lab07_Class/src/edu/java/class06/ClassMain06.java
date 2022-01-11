package edu.java.class06;

public class ClassMain06 {

	public static void main(String[] args) {
		Account acc1 = new Account(123456,1000);
		acc1.info();

		Account acc2 = new Account(123789,1000);
		acc2.info();
		
		//acc1에 10,000원 입금
		acc1.deposit(10_000);
		acc1.info();
		
		//acc1에 3,000원 출금
		acc1.withdraw(3_000);
		acc1.info();
		
		System.out.println();
		//acc1에서 acc2으로 5,000원을 이체
		acc1.transfer(5_000, acc2);
		acc1.info();
		acc2.info();
	}

}
