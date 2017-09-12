package com.myteam.loanproduct;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class House implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "\u623F\u4EA7\u8BC1")
	private com.myteam.loanproduct.HouseCertificate certificate;
	@org.kie.api.definition.type.Label(value = "\u6309\u63ED\u8D37\u6B3E")
	private com.myteam.loanproduct.Repayment loanRepayment;
	@org.kie.api.definition.type.Label(value = "\u623F\u9F84")
	private java.lang.Integer age;
	@org.kie.api.definition.type.Label(value = "\u662F\u5426\u88AB\u62B5\u62BC")
	private java.lang.Boolean isCollateral;
	@org.kie.api.definition.type.Label(value = "\u8BC4\u4F30\u4EF7")
	private java.lang.Integer evaluatedPrice;

	public House() {
	}

	public com.myteam.loanproduct.HouseCertificate getCertificate() {
		return this.certificate;
	}

	public void setCertificate(
			com.myteam.loanproduct.HouseCertificate certificate) {
		this.certificate = certificate;
	}

	public com.myteam.loanproduct.Repayment getLoanRepayment() {
		return this.loanRepayment;
	}

	public void setLoanRepayment(com.myteam.loanproduct.Repayment loanRepayment) {
		this.loanRepayment = loanRepayment;
	}

	public java.lang.Integer getAge() {
		return this.age;
	}

	public void setAge(java.lang.Integer age) {
		this.age = age;
	}

	public java.lang.Boolean getIsCollateral() {
		return this.isCollateral;
	}

	public void setIsCollateral(java.lang.Boolean isCollateral) {
		this.isCollateral = isCollateral;
	}

	public java.lang.Integer getEvaluatedPrice() {
		return this.evaluatedPrice;
	}

	public void setEvaluatedPrice(java.lang.Integer evaluatedPrice) {
		this.evaluatedPrice = evaluatedPrice;
	}

	public House(com.myteam.loanproduct.HouseCertificate certificate,
			com.myteam.loanproduct.Repayment loanRepayment,
			java.lang.Integer age, java.lang.Boolean isCollateral,
			java.lang.Integer evaluatedPrice) {
		this.certificate = certificate;
		this.loanRepayment = loanRepayment;
		this.age = age;
		this.isCollateral = isCollateral;
		this.evaluatedPrice = evaluatedPrice;
	}

}