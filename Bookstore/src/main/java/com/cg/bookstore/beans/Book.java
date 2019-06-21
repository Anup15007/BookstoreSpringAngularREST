package com.cg.bookstore.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Book {
	@Id
	private long bookIsbn;
	private String bookTitle;
	private double bookPrice;
	private String authorName;
	private String bookPublishDate;
	private String bookDescription;
	private String bookImage;
	private String bookCategory;
	@ManyToOne
	OrderItem order;
	public Book() {
		super();
	}
	public Book(long bookIsbn, String bookTitle, double bookPrice) {
		super();
		this.bookIsbn = bookIsbn;
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
	}
	public Book(long bookIsbn, String bookTitle, double bookPrice, String authorName,
			String bookPublishDate, String bookDescription, String bookImage, String bookCategory, OrderItem order) {
		super();
		this.bookIsbn = bookIsbn;
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
		this.authorName = authorName;
		this.bookPublishDate = bookPublishDate;
		this.bookDescription = bookDescription;
		this.bookImage = bookImage;
		this.bookCategory = bookCategory;
		this.order = order;
	}
	public long getBookIsbn() {
		return bookIsbn;
	}
	public void setBookIsbn(long bookIsbn) {
		this.bookIsbn = bookIsbn;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getBookPublishDate() {
		return bookPublishDate;
	}
	public void setBookPublishDate(String bookPublishDate) {
		this.bookPublishDate = bookPublishDate;
	}
	public String getBookDescription() {
		return bookDescription;
	}
	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}
	public String getBookImage() {
		return bookImage;
	}
	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	public OrderItem getOrder() {
		return order;
	}
	public void setOrder(OrderItem order) {
		this.order = order;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + ((bookCategory == null) ? 0 : bookCategory.hashCode());
		result = prime * result + ((bookDescription == null) ? 0 : bookDescription.hashCode());
		result = prime * result + ((bookImage == null) ? 0 : bookImage.hashCode());
		result = prime * result + (int) (bookIsbn ^ (bookIsbn >>> 32));
		long temp;
		temp = Double.doubleToLongBits(bookPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((bookPublishDate == null) ? 0 : bookPublishDate.hashCode());
		result = prime * result + ((bookTitle == null) ? 0 : bookTitle.hashCode());
		result = prime * result + ((order == null) ? 0 : order.hashCode());
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
		Book other = (Book) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (bookCategory == null) {
			if (other.bookCategory != null)
				return false;
		} else if (!bookCategory.equals(other.bookCategory))
			return false;
		if (bookDescription == null) {
			if (other.bookDescription != null)
				return false;
		} else if (!bookDescription.equals(other.bookDescription))
			return false;
		if (bookImage == null) {
			if (other.bookImage != null)
				return false;
		} else if (!bookImage.equals(other.bookImage))
			return false;
		if (bookIsbn != other.bookIsbn)
			return false;
		if (Double.doubleToLongBits(bookPrice) != Double.doubleToLongBits(other.bookPrice))
			return false;
		if (bookPublishDate == null) {
			if (other.bookPublishDate != null)
				return false;
		} else if (!bookPublishDate.equals(other.bookPublishDate))
			return false;
		if (bookTitle == null) {
			if (other.bookTitle != null)
				return false;
		} else if (!bookTitle.equals(other.bookTitle))
			return false;
		if (order == null) {
			if (other.order != null)
				return false;
		} else if (!order.equals(other.order))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Book [bookIsbn=" + bookIsbn + ", bookTitle=" + bookTitle + ", bookPrice=" + bookPrice + ", authorName="
				+ authorName + ", bookPublishDate=" + bookPublishDate + ", bookDescription=" + bookDescription
				+ ", bookImage=" + bookImage + ", bookCategory=" + bookCategory + ", order=" + order + "]";
	}
}
