package com.cg.bookstore.beans;

import javax.persistence.Embedded;
import javax.persistence.OneToMany;

public class Customer extends User{
	User user;
	String customerEmailId;
	String customerFullName;
	@OneToMany(mappedBy = "customer")
	@Embedded
	Address customerAddress;
	String customerPhone;
	public Customer() {
		super();
	}
	public Customer(User user, String customerEmailId, String customerFullName, Address customerAddress,
			String customerPhone) {
		super();
		this.user = user;
		this.customerEmailId = customerEmailId;
		this.customerFullName = customerFullName;
		this.customerAddress = customerAddress;
		this.customerPhone = customerPhone;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + ((customerEmailId == null) ? 0 : customerEmailId.hashCode());
		result = prime * result + ((customerFullName == null) ? 0 : customerFullName.hashCode());
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
		return "Customer [user=" + user + ", customerEmailId=" + customerEmailId + ", customerFullName="
				+ customerFullName + ", customerAddress=" + customerAddress + ", customerPhone=" + customerPhone + "]";
	}	
}
