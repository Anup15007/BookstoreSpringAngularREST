package com.cg.bookstore.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class OrderReview {
	@Id
	String customerEmailId;
	String bookName;
	String customerReviewComment;
	String customerReviewHeadline;
	double rating;
	public OrderReview() {
		super();
	}
	public OrderReview(@Email String customerEmailId, String bookName, String customerReviewComment,
			String customerReviewHeadline, double rating) {
		super();
		this.customerEmailId = customerEmailId;
		this.bookName = bookName;
		this.customerReviewComment = customerReviewComment;
		this.customerReviewHeadline = customerReviewHeadline;
		this.rating = rating;
	}
	public String getCustomerEmailId() {
		return customerEmailId;
	}
	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getCustomerReviewComment() {
		return customerReviewComment;
	}
	public void setCustomerReviewComment(String customerReviewComment) {
		this.customerReviewComment = customerReviewComment;
	}
	public String getCustomerReviewHeadline() {
		return customerReviewHeadline;
	}
	public void setCustomerReviewHeadline(String customerReviewHeadline) {
		this.customerReviewHeadline = customerReviewHeadline;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + ((customerEmailId == null) ? 0 : customerEmailId.hashCode());
		result = prime * result + ((customerReviewComment == null) ? 0 : customerReviewComment.hashCode());
		result = prime * result + ((customerReviewHeadline == null) ? 0 : customerReviewHeadline.hashCode());
		long temp;
		temp = Double.doubleToLongBits(rating);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		OrderReview other = (OrderReview) obj;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (customerEmailId == null) {
			if (other.customerEmailId != null)
				return false;
		} else if (!customerEmailId.equals(other.customerEmailId))
			return false;
		if (customerReviewComment == null) {
			if (other.customerReviewComment != null)
				return false;
		} else if (!customerReviewComment.equals(other.customerReviewComment))
			return false;
		if (customerReviewHeadline == null) {
			if (other.customerReviewHeadline != null)
				return false;
		} else if (!customerReviewHeadline.equals(other.customerReviewHeadline))
			return false;
		if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OrderReview [customerEmailId=" + customerEmailId + ", bookName=" + bookName + ", customerReviewComment="
				+ customerReviewComment + ", customerReviewHeadline=" + customerReviewHeadline + ", rating=" + rating
				+ "]";
	}
}
