package com.cg.bookstore.beans;

import java.util.List;
import java.util.Map;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

@Entity
public class OrderItem {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long orderId;
	@ManyToOne
	private Customer customer;
	@OneToMany(mappedBy = "order")
	@MapKey
	private Map<Long, Book> booklist;
	@Embedded
	private Address shippingAddress;
	private String recepientName;
	private String orderType;
	private double orderPrice;
	private int orderQuantity;
	private String orderDate;
	private String orderStatus;
	private String orderPaymentMethod;
	public OrderItem() {
		super();
	}
	public OrderItem(long orderId, Customer customer, Map<Long, Book> booklist, Address shippingAddress,
			String recepientName, String orderType, double orderPrice, int orderQuantity, String orderDate,
			String orderStatus, String orderPaymentMethod) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.booklist = booklist;
		this.shippingAddress = shippingAddress;
		this.recepientName = recepientName;
		this.orderType = orderType;
		this.orderPrice = orderPrice;
		this.orderQuantity = orderQuantity;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.orderPaymentMethod = orderPaymentMethod;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Map<Long, Book> getBooklist() {
		return booklist;
	}
	public void setBooklist(Map<Long, Book> booklist) {
		this.booklist = booklist;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getRecepientName() {
		return recepientName;
	}
	public void setRecepientName(String recepientName) {
		this.recepientName = recepientName;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public double getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderPaymentMethod() {
		return orderPaymentMethod;
	}
	public void setOrderPaymentMethod(String orderPaymentMethod) {
		this.orderPaymentMethod = orderPaymentMethod;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((booklist == null) ? 0 : booklist.hashCode());
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
		result = prime * result + (int) (orderId ^ (orderId >>> 32));
		result = prime * result + ((orderPaymentMethod == null) ? 0 : orderPaymentMethod.hashCode());
		long temp;
		temp = Double.doubleToLongBits(orderPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + orderQuantity;
		result = prime * result + ((orderStatus == null) ? 0 : orderStatus.hashCode());
		result = prime * result + ((orderType == null) ? 0 : orderType.hashCode());
		result = prime * result + ((recepientName == null) ? 0 : recepientName.hashCode());
		result = prime * result + ((shippingAddress == null) ? 0 : shippingAddress.hashCode());
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
		OrderItem other = (OrderItem) obj;
		if (booklist == null) {
			if (other.booklist != null)
				return false;
		} else if (!booklist.equals(other.booklist))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (orderId != other.orderId)
			return false;
		if (orderPaymentMethod == null) {
			if (other.orderPaymentMethod != null)
				return false;
		} else if (!orderPaymentMethod.equals(other.orderPaymentMethod))
			return false;
		if (Double.doubleToLongBits(orderPrice) != Double.doubleToLongBits(other.orderPrice))
			return false;
		if (orderQuantity != other.orderQuantity)
			return false;
		if (orderStatus == null) {
			if (other.orderStatus != null)
				return false;
		} else if (!orderStatus.equals(other.orderStatus))
			return false;
		if (orderType == null) {
			if (other.orderType != null)
				return false;
		} else if (!orderType.equals(other.orderType))
			return false;
		if (recepientName == null) {
			if (other.recepientName != null)
				return false;
		} else if (!recepientName.equals(other.recepientName))
			return false;
		if (shippingAddress == null) {
			if (other.shippingAddress != null)
				return false;
		} else if (!shippingAddress.equals(other.shippingAddress))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OrderItem [orderId=" + orderId + ", customer=" + customer + ", booklist=" + booklist
				+ ", shippingAddress=" + shippingAddress + ", recepientName=" + recepientName + ", orderType="
				+ orderType + ", orderPrice=" + orderPrice + ", orderQuantity=" + orderQuantity + ", orderDate="
				+ orderDate + ", orderStatus=" + orderStatus + ", orderPaymentMethod=" + orderPaymentMethod + "]";
	}
	
}
