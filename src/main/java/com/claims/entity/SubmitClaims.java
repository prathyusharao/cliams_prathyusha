package com.claims.entity;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/*
 * SubmitClaims entity
 */
@Document("submitclaims")
public class SubmitClaims {
	/*
	 * id
	 */

	@Id
	protected ObjectId id;
	/*
	 * member name
	 */
	protected String membername;
	/*
	 * date of birth
	 */
	protected Date dob;
	/*
	 * date of admission
	 */
	protected Date dateofadmission;
	/*
	 * date of discharge
	 */
	protected Date dateofdischarge;
	/*
	 * provider name
	 */
	protected String providername;
	/*
	 * bill amount
	 */
	protected double billamount;
	/*
	 * status
	 */
	protected String status;
	/**
	 * @return the memberid
	 */
	
	/**
	 * @return the membername
	 */
	public String getMembername() {
		return membername;
	}
	/**
	 * @param membername the membername to set
	 */
	public void setMembername(String membername) {
		this.membername = membername;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/**
	 * @return the dateofadmission
	 */
	public Date getDateofadmission() {
		return dateofadmission;
	}
	/**
	 * @param dateofadmission the dateofadmission to set
	 */
	public void setDateofadmission(Date dateofadmission) {
		this.dateofadmission = dateofadmission;
	}
	/**
	 * @return the dateofdischarge
	 */
	public Date getDateofdischarge() {
		return dateofdischarge;
	}
	/**
	 * @param dateofdischarge the dateofdischarge to set
	 */
	public void setDateofdischarge(Date dateofdischarge) {
		this.dateofdischarge = dateofdischarge;
	}
	/**
	 * @return the providername
	 */
	public String getProvidername() {
		return providername;
	}
	/**
	 * @param providername the providername to set
	 */
	public void setProvidername(String providername) {
		this.providername = providername;
	}
	/**
	 * @return the billamount
	 */
	public double getBillamount() {
		return billamount;
	}
	/**
	 * @param billamount the billamount to set
	 */
	public void setBillamount(double billamount) {
		this.billamount = billamount;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "SubmitClaims [membername=" + membername + ", dob=" + dob + ", dateofadmission=" + dateofadmission
				+ ", dateofdischarge=" + dateofdischarge + ", providername=" + providername + ", billamount="
				+ billamount + ", status=" + status + "]";
	}
	
	
}
