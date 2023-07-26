package com.training.tasks;

import com.training.bean.BankAccount;

public class WithdrawTask implements Runnable{
	
	BankAccount account;
	
	

	public WithdrawTask(BankAccount account) {
		super();
		this.account = account;
	}



	@Override
	public void run() {
		account.withdraw(25);
		
	}

}
