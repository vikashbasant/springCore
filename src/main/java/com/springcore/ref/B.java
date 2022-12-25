package com.springcore.ref;

public class B {
	private int y;

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	public B(int y) {
		super();
		this.y = y;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "B [y=" + y + "]";
	}

}
