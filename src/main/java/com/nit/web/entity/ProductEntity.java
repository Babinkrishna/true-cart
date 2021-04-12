package com.nit.web.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class ProductEntity extends BaseEntity {

	@Column(name = "code")
	private String code;
	@Column(name = "name")
	private String name;
	@Column(name = "type")
	private String type;
	@Column(name = "company")
	private String company;
	@Column(name = "hsn")
	private String hsn;
	@Column(name = "rate")
	private BigDecimal rate;
	@Column(name = "sgst")
	private BigDecimal sgst;
	@Column(name = "cgst")
	private BigDecimal cgst;
	@Column(name = "igst")
	private BigDecimal igst;
	@Lob
	@Column(name = "image")
	private String image;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getHsn() {
		return hsn;
	}
	public void setHsn(String hsn) {
		this.hsn = hsn;
	}
	public BigDecimal getRate() {
		return rate;
	}
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
	public BigDecimal getSgst() {
		return sgst;
	}
	public void setSgst(BigDecimal sgst) {
		this.sgst = sgst;
	}
	public BigDecimal getCgst() {
		return cgst;
	}
	public void setCgst(BigDecimal cgst) {
		this.cgst = cgst;
	}
	public BigDecimal getIgst() {
		return igst;
	}
	public void setIgst(BigDecimal igst) {
		this.igst = igst;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}	
	

}
