package com.cg;

public class Account {
private int id;
private String holdername;
private int balance;
private Customer cust;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getHoldername() {
	return holdername;
}
public void setHoldername(String holdername) {
	this.holdername = holdername;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public Customer getCust() {
	return cust;
}
public void setCust(Customer cust) {
	this.cust = cust;
}
public Account(int id, String holdername, int balance, Customer cust) {
	super();
	this.id = id;
	this.holdername = holdername;
	this.balance = balance;
	this.cust = cust;
}
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Account [id=" + id + ", holdername=" + holdername + ", balance=" + balance + ", cust=" + cust + "]";
}

}
