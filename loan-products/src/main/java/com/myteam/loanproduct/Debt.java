package com.myteam.loanproduct;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Debt implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "\u8D1F\u503A\u7387")
	private java.lang.Float debtToIncomeRatio;

	public Debt() {
	}

	public java.lang.Float getDebtToIncomeRatio() {
		return this.debtToIncomeRatio;
	}

	public void setDebtToIncomeRatio(java.lang.Float debtToIncomeRatio) {
		this.debtToIncomeRatio = debtToIncomeRatio;
	}

	public Debt(java.lang.Float debtToIncomeRatio) {
		this.debtToIncomeRatio = debtToIncomeRatio;
	}

}