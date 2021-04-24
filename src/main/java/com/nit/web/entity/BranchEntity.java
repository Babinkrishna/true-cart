package com.nit.web.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "branch")
public class BranchEntity extends BaseEntity {

	@Column(name = "name")
	private String name;
	@Column(name = "regional_office")
	private String regionalOffice;
	@Column(name = "gstin")
	private String gstin;
	@Column(name = "office")
	private String office;
	@Column(name = "code")
	private String code;
	@Column(name = "client")
	private String client;
	@Column(name = "order_frequency")
	private Integer orderFrequency;
	@Column(name = "order_limit")
	private Integer orderLimit;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private  AddressEntity address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegionalOffice() {
		return regionalOffice;
	}

	public void setRegionalOffice(String regionalOffice) {
		this.regionalOffice = regionalOffice;
	}

	public String getGstin() {
		return gstin;
	}

	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public Integer getOrderFrequency() {
		return orderFrequency;
	}

	public void setOrderFrequency(Integer orderFrequency) {
		this.orderFrequency = orderFrequency;
	}

	public Integer getOrderLimit() {
		return orderLimit;
	}

	public void setOrderLimit(Integer orderLimit) {
		this.orderLimit = orderLimit;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}
}
