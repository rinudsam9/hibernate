package lti.ex7;

import lti.ex7.Estate;

public class Estate {
	private int number;
	private String estatename;
	
	private Owner own;
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getEstatename() {
		return estatename;
	}
	public void setEstatename(String estatename) {
		this.estatename = estatename;
	}
	public Owner getOwn() {
		return own;
	}
	public void setOwn(Owner own) {
		this.own = own;
	}
	
	
	
	

}
