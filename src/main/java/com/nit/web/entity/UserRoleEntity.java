package com.nit.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name ="user_role")
public class UserRoleEntity extends BaseEntity{
	
	@Column(name = "role_code")
	private String roleCode;
	@Column(name ="role_desc")
	private String roleDesc;
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getRoleDesc() {
		return roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}	
	

}
