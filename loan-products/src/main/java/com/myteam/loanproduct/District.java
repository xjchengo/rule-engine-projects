package com.myteam.loanproduct;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("行政区划")
public class District implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "\u884C\u653F\u533A\u5212\u7801")
	private java.lang.Integer id;
	@org.kie.api.definition.type.Label(value = "\u7EA7\u522B")
	private java.lang.Integer type;
	@org.kie.api.definition.type.Label(value = "\u884C\u653F\u533A\u540D\u79F0")
	private java.lang.String name;

	public District() {
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.Integer getType() {
		return this.type;
	}

	public void setType(java.lang.Integer type) {
		this.type = type;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public District(java.lang.Integer id, java.lang.Integer type,
			java.lang.String name) {
		this.id = id;
		this.type = type;
		this.name = name;
	}

}