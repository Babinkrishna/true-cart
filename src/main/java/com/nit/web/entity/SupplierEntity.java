package com.nit.web.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "supplier")
public class SupplierEntity extends BaseEntity {

	@Column(name = "name")
	private String name;
	@Column(name = "gstin")
	private String gstNumber;
	@Column(name = "code")
	private String code;

	@Column(name = "email")
	private String email;

	@Column(name = "website")
	private String website;
	@Column(name = "contact_person")
	private String contactPerson;
	@Column(name = "opening_balance")
	private BigDecimal openingBalance;
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

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public BigDecimal getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(BigDecimal openingBalance) {
		this.openingBalance = openingBalance;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}
}
