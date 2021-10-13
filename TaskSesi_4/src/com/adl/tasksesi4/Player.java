package com.adl.tasksesi4;

public class Player {
	
	private String model ="@";
	private int x=5;
	private int y=5;
	
	public Player(String model, int x, int y) {
		super();
		this.model = model;
		this.x = x;
		this.y = y;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void gerakKeatas() {
		this.y=this.y-1;
	}
	public void gerakKebawah() {
		this.y=this.y+1;
	}
	public void gerakKiri() {
		this.x=this.x-1;
	}
	public void gerakKanan() {
		this.x=this.x+1;
	}
}



