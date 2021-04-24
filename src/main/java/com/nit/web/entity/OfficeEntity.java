package com.nit.web.entity;

import javax.persistence.*;

@Entity
@Table(name = "office")
public class OfficeEntity extends BaseEntity {

	@Column(name = "name")
	private String name;
	@Column(name = "gstin")
	private String gstNumber;
	@Column(name = "code")
	private String code;
	@Column(name = "is_dealer")
	private String isDealer;
	@Column(name = "is_billing")
	private String isBilling;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bank_id", referencedColumnName = "id")
	private  BankInfoEntity bankInfo;

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

	public String getIsDealer() {
		return isDealer;
	}

	public void setIsDealer(String isDealer) {
		this.isDealer = isDealer;
	}

	public String getIsBilling() {
		return isBilling;
	}

	public void setIsBilling(String isBilling) {
		this.isBilling = isBilling;
	}

	public BankInfoEntity getBankInfo() {
		return bankInfo;
	}

	public void setBankInfo(BankInfoEntity bankInfo) {
		this.bankInfo = bankInfo;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}
}
