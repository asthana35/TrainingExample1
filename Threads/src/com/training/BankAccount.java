package com.training;

public class BankAccount {
	
	public void display(){
		System.out.println("Hello World");
	}
	
	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}
	
	private double balance=2000;

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public synchronized double deposit(double amt){ 
		
		balance = balance+amt;
		
		System.out.println("Amount Deposited: "+balance);
		notify();
		return balance;
		}
	public synchronized double withdraw(double amt){ 
		if(balance < amt) {
			
			System.out.println("Insufficient balance-Will wait for transfer");
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else{
			balance = balance - amt;
		}
			System.out.println("Got the money - Amount Withdrawn: "+balance);
		
	return balance;
}}
