package com.gm.modal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

 
@Entity
@Table(name = "gm_customers", catalog = "airportsurveydb")
public class GmCustomers implements java.io.Serializable {
	
	@Id
	@Column(name = "CUSTOMER_ID", unique = true, nullable = false)
	private int customerId;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "VALID_FROM", length = 10)
	private Date validFrom;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "VALID_TO", length = 10)
	private Date validTo;

	@Column(name = "CUSTOMER_NAME", length = 30)
    private String customerName;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gmCustomers")
    private List<GmUsers> gmUserses = new ArrayList<GmUsers>(0);

	public GmCustomers() {

	}

	public GmCustomers(  Date validFrom, Date validTo, String customerName,
			List<GmUsers> gmUserses) {
		super();
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.customerName = customerName;
		this.gmUserses = gmUserses;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Date getValidTo() {
		return validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<GmUsers> getGmUserses() {
		return gmUserses;
	}

	public void setGmUserses(List<GmUsers> gmUserses) {
		this.gmUserses = gmUserses;
	}



}
