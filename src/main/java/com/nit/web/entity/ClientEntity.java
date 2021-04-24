package com.nit.web.entity;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class ClientEntity extends BaseEntity {

	@Column(name = "name")
	private String name;
	@Column(name = "gstin")
	private String gstNumber;
	@Column(name = "code")
	private String code;
	@Column(name = "auto_approve")
	private String autoApprove;

	@Column(name = "regional_office")
	private boolean regionalOffices;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private  AddressEntity address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAutoApprove() {
		return autoApprove;
	}

	public void setAutoApprove(String autoApprove) {
		this.autoApprove = autoApprove;
	}

	public boolean getRegionalOffices() {
		return regionalOffices;
	}

	public void setRegionalOffices(boolean regionalOffices) {
		this.regionalOffices = regionalOffices;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}
}
