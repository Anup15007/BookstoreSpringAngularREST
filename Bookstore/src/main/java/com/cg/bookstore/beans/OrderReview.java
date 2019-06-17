package com.cg.bookstore.beans;

public class OrderReview {
	String emailId;
	String bookName;
	String customerReviewComment;
	String customerReviewHeadline;
	double rating;
	public OrderReview() {
		super();
	}
	public OrderReview(String emailId, String bookName, String customerReviewComment, String customerReviewHeadline,
			double rating) {
		super();
		this.emailId = emailId;
		this.bookName = bookName;
		this.customerReviewComment = customerReviewComment;
		this.customerReviewHeadline = customerReviewHeadline;
		this.rating = rating;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
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
		result = prime * result + ((customerReviewComment == null) ? 0 : customerReviewComment.hashCode());
		result = prime * result + ((customerReviewHeadline == null) ? 0 : customerReviewHeadline.hashCode());
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
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
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OrderReview [emailId=" + emailId + ", bookName=" + bookName + ", customerReviewComment="
				+ customerReviewComment + ", customerReviewHeadline=" + customerReviewHeadline + ", rating=" + rating
				+ "]";
	}
}
