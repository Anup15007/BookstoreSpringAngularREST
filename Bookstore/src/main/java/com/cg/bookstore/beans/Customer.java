package com.cg.bookstore.beans;

import java.util.Map;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;

@Entity
public class Customer{
	@Id
	String customerEmailId;
	String password;
	private String customerFullName;
	@Embedded
	private Address customerAddress;
	@OneToMany(mappedBy = "customer")
	private Map<Long, OrderItem> customerOrders;
	private String customerPhone;
	public Customer() {
		super();
	}
	public Customer(String customerEmailId, String password, String customerFullName, String customerPhone) {
		super();
		this.customerEmailId = customerEmailId;
		this.password = password;
		this.customerFullName = customerFullName;
		this.customerPhone = customerPhone;
	}
	public Customer(String customerEmailId, String password, String customerFullName, Address customerAddress,
			String customerPhone) {
		super();
		this.customerEmailId = customerEmailId;
		this.password = password;
		this.customerFullName = customerFullName;
		this.customerAddress = customerAddress;
		this.customerPhone = customerPhone;
	}
	public Customer(@Email String customerEmailId, String password, String customerFullName, Address customerAddress,
			Map<Long, OrderItem> customerOrders, String customerPhone) {
		super();
		this.customerEmailId = customerEmailId;
		this.password = password;
		this.customerFullName = customerFullName;
		this.customerAddress = customerAddress;
		this.customerOrders = customerOrders;
		this.customerPhone = customerPhone;
	}
	public String getCustomerEmailId() {
		return customerEmailId;
	}
	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustomerFullName() {
		return customerFullName;
	}
	public void setCustomerFullName(String customerFullName) {
		this.customerFullName = customerFullName;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	public Map<Long, OrderItem> getCustomerOrders() {
		return customerOrders;
	}
	public void setCustomerOrders(Map<Long, OrderItem> customerOrders) {
		this.customerOrders = customerOrders;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + ((customerEmailId == null) ? 0 : customerEmailId.hashCode());
		result = prime * result + ((customerFullName == null) ? 0 : customerFullName.hashCode());
		result = prime * result + ((customerOrders == null) ? 0 : customerOrders.hashCode());
		result = prime * result + ((customerPhone == null) ? 0 : customerPhone.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customerAddress == null) {
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
			return false;
		if (customerEmailId == null) {
			if (other.customerEmailId != null)
				return false;
		} else if (!customerEmailId.equals(other.customerEmailId))
			return false;
		if (customerFullName == null) {
			if (other.customerFullName != null)
				return false;
		} else if (!customerFullName.equals(other.customerFullName))
			return false;
		if (customerOrders == null) {
			if (other.customerOrders != null)
				return false;
		} else if (!customerOrders.equals(other.customerOrders))
			return false;
		if (customerPhone == null) {
			if (other.customerPhone != null)
				return false;
		} else if (!customerPhone.equals(other.customerPhone))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [customerEmailId=" + customerEmailId + ", password=" + password + ", customerFullName="
				+ customerFullName + ", customerAddress=" + customerAddress + ", customerOrders=" + customerOrders
				+ ", customerPhone=" + customerPhone + "]";
	}
}
