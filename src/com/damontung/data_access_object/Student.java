/**
 * 
 */
package com.damontung.data_access_object;

/**
 * @author guangzhd
 *
 */
public class Student {
	private String name;
	private int rollNo;

	public Student(String name, int rollNo) {
		super();

		this.name = name;
		this.rollNo = rollNo;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}

	/**
	 * @param rollNo
	 *            the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		rollNo = rollNo;
	}

}
