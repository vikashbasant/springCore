package com.springcore.ci;

public class Person {
	private String name;
	private int personId;

	public Person(String name, int persionId) {
		super();
		this.name = name;
		personId = persionId;
	}

	@Override
	public String toString() {

		return name + " : " + personId;
	}

}
