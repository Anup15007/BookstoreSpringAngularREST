package com.cg.bookstore.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;

public class Customer{
	User user;
	private String customerFullName;
	@OneToMany(mappedBy = "customer")
	@Embedded
	private Address customerAddress;
	@OneToMany(mappedBy = "customer")
	private List<Order> customerOrders;
	private String customerPhone;
	public Customer() {
		super();
	}
	public Customer(User user, String customerFullName, Address customerAddress, List<Order> customerOrders,
			String customerPhone) {
		super();
		this.user = user;
		this.customerFullName = customerFullName;
		this.customerAddress = customerAddress;
		this.customerOrders = customerOrders;
		this.customerPhone = customerPhone;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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
	public List<Order> getCustomerOrders() {
		return customerOrders;
	}
	public void setCustomerOrders(List<Order> customerOrders) {
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
		int result = super.hashCode();
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + ((customerFullName == null) ? 0 : customerFullName.hashCode());
		result = prime * result + ((customerOrders == null) ? 0 : customerOrders.hashCode());
		result = prime * result + ((customerPhone == null) ? 0 : customerPhone.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customerAddress == null) {
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
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
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Customer [user=" + user + ", customerFullName=" + customerFullName + ", customerAddress="
				+ customerAddress + ", customerOrders=" + customerOrders + ", customerPhone=" + customerPhone + "]";
	}
}
