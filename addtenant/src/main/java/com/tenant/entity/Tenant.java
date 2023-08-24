package com.tenant.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tenant {
	
	@Id
	private long id;
	private String tenantName;
	private String occupation;
	private String identity;
	private String identityNumber;
	private String rentAgreement;
	private String description;
	private String tenantPhoto;
	private Date tenantEnterDate;
	private Date tenantExitDate;
	
	
	public Tenant(long id, String tenantName, String occupation, String identity, String identityNumber,
			String rentAgreement, String description, String tenantPhoto, Date tenantEnterDate, Date tenantExitDate) {
		super();
		this.id = id;
		this.tenantName = tenantName;
		this.occupation = occupation;
		this.identity = identity;
		this.identityNumber = identityNumber;
		this.rentAgreement = rentAgreement;
		this.description = description;
		this.tenantPhoto = tenantPhoto;
		this.tenantEnterDate = tenantEnterDate;
		this.tenantExitDate = tenantExitDate;
	}
	
	public Tenant( ) {
		super();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTenantName() {
		return tenantName;
	}
	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}
	public String isRentAgreement() {
		return rentAgreement;
	}
	public void setRentAgreement(String rentAgreement) {
		this.rentAgreement = rentAgreement;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTenantPhoto() {
		return tenantPhoto;
	}
	public void setTenantPhoto(String tenantPhoto) {
		this.tenantPhoto = tenantPhoto;
	}
	public Date getTenantEnterDate() {
		return tenantEnterDate;
	}
	public void setTenantEnterDate(Date tenantEnterDate) {
		this.tenantEnterDate = tenantEnterDate;
	}
	public Date getTenantExitDate() {
		return tenantExitDate;
	}
	public void setTenantExitDate(Date tenantExitDate) {
		this.tenantExitDate = tenantExitDate;
	}

	@Override
	public String toString() {
		return "Tenant [id=" + id + ", tenantName=" + tenantName + ", occupation=" + occupation + ", identity="
				+ identity + ", identityNumber=" + identityNumber + ", rentAgreement=" + rentAgreement
				+ ", description=" + description + ", tenantPhoto=" + tenantPhoto + ", tenantEnterDate="
				+ tenantEnterDate + ", tenantExitDate=" + tenantExitDate + "]";
	}
	
	
	
	
}
