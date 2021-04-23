package com.nit.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bank_info")
public class BankInfoEntity extends BaseEntity {

	@Column(name = "name")
	private String name;
	@Column(name = "branch")
	private String branch;
	@Column(name = "code")
	private String code;
	@Column(name = "ifsc")
	private String ifsc;
	@Column(name = "micr")
	private String micr;
	@Column(name = "address")
	private String address;

	@Column(name = "account_name")
	private String accountName;

	@Column(name = "account_type")
	private String accountType;

	@Column(name = "account_no")
	private String accountNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getMicr() {
		return micr;
	}

	public void setMicr(String micr) {
		this.micr = micr;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
}
