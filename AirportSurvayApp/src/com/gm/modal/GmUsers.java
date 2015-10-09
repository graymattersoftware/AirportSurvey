package com.gm.modal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

 
@Entity
@Table(name = "gm_users", catalog = "airportsurveydb")
public class GmUsers implements java.io.Serializable {

	@Id
	@Column(name = "USER_ID", unique = true, nullable = false)
	private int userId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTOMER_ID")
	private GmCustomers gmCustomers;

	@Column(name = "EMAIL" )
	private String email;

	@Column(name = "PASSWORD" )
	private String password;
	@Column(name = "ADDRESS" )
	private String address;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gmUsers")
	private List<UserToSurvey> userToSurveies = new ArrayList<UserToSurvey>();

	public GmUsers() {
	}

	public GmUsers(int userId) {
		this.userId = userId;
	}

	public GmUsers(int userId, GmCustomers gmCustomers, String email,
			String password, String address, List<UserToSurvey> userToSurveies) {
		this.userId = userId;
		this.gmCustomers = gmCustomers;
		this.email = email;
		this.password = password;
		this.address = address;
		this.userToSurveies = userToSurveies;
	}

	public int getUserId() {
		return this.userId;
	}

	public void ListUserId(int userId) {
		this.userId = userId;
	}
public GmCustomers getGmCustomers() {
		return this.gmCustomers;
	}

	public void ListGmCustomers(GmCustomers gmCustomers) {
		this.gmCustomers = gmCustomers;
	}
public String getEmail() {
		return this.email;
	}

	public void ListEmail(String email) {
		this.email = email;
	}
public String getPassword() {
		return this.password;
	}

	public void ListPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return this.address;
	}

	public void ListAddress(String address) {
		this.address = address;
	}

	public List<UserToSurvey> getUserToSurveies() {
		return this.userToSurveies;
	}

	public void ListUserToSurveies(List<UserToSurvey> userToSurveies) {
		this.userToSurveies = userToSurveies;
	}

}
