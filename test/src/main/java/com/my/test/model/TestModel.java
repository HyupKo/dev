package com.my.test.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <pre>
 * com.my.test.controller
 * |_ TestModel.java
 * </pre>
 * 
 * @desc	: Xml Test Model.
 * @author	: ko
 * @date	: 2014. 3. 3. ¿ÀÈÄ 3:46:16
 * @version	: 1.0.0
 */
@XmlType
@XmlRootElement(name="root")
@XmlAccessorType(XmlAccessType.FIELD)
public class TestModel {
	
	private String testName;
	private String testDesc;
	private int testValue;
	
	/**
	 * Constructor of TestModel.java class.
	 */
	public TestModel() {
		this.testName = "test";
		this.testDesc = "This is Test Result.";
		this.testValue = 0;
	}
	
	/**
	 * Constructor of TestModel.java class.
	 * @param testName
	 * @param testDesc
	 * @param testValue
	 */
	public TestModel(String testName, String testDesc, int testValue) {
		this.testName = testName;
		this.testDesc = testDesc;
		this.testValue = testValue;
	}

	/**
	 * @return the testName
	 */
	public String getTestName() {
		return testName;
	}

	/**
	 * @param testName the testName to set
	 */
	public void setTestName(String testName) {
		this.testName = testName;
	}

	/**
	 * @return the testDesc
	 */
	public String getTestDesc() {
		return testDesc;
	}

	/**
	 * @param testDesc the testDesc to set
	 */
	public void setTestDesc(String testDesc) {
		this.testDesc = testDesc;
	}

	/**
	 * @return the testValue
	 */
	public int getTestValue() {
		return testValue;
	}

	/**
	 * @param testValue the testValue to set
	 */
	public void setTestValue(int testValue) {
		this.testValue = testValue;
	}
	
	

}
