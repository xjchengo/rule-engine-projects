package com.myteam.loanproduct;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Shares implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "\u6301\u80A1\u6BD4\u4F8B")
	private java.lang.Float ratio;
	@org.kie.api.definition.type.Label(value = "\u6301\u80A1\u65F6\u95F4")
	private java.util.Date date;

	public Shares() {
	}

	public java.lang.Float getRatio() {
		return this.ratio;
	}

	public void setRatio(java.lang.Float ratio) {
		this.ratio = ratio;
	}

	public java.util.Date getDate() {
		return this.date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public Shares(java.lang.Float ratio, java.util.Date date) {
		this.ratio = ratio;
		this.date = date;
	}

}