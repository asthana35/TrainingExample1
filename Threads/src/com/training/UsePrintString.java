package com.training;

public class UsePrintString implements Runnable {
	
	private String str1;
	private String str2;
	
	

	public UsePrintString() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UsePrintString(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		
		Thread t = new Thread(this);
		t.start();
	}



	@Override
	public void run() {

		PrintStrings.printString(str1,str2);
	}
	
}
