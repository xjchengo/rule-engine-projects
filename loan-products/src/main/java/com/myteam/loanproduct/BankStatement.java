package com.myteam.loanproduct;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("银行流水")
public class BankStatement implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "\u6708\u6D41\u6C34")
	private java.lang.Integer monthlyAmount;

	public BankStatement() {
	}

	public java.lang.Integer getMonthlyAmount() {
		return this.monthlyAmount;
	}

	public void setMonthlyAmount(java.lang.Integer monthlyAmount) {
		this.monthlyAmount = monthlyAmount;
	}

	public BankStatement(java.lang.Integer monthlyAmount) {
		this.monthlyAmount = monthlyAmount;
	}

}