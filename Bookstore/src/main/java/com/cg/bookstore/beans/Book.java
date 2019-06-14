package com.cg.bookstore.beans;

import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

public class Book {
	@Id
	long bookId;
	@NotNull
	String bookName;
	@NotNull
	double bookPrice;
	String authorName;
	public Book() {
		super();
	}
	public Book(@NotNull String bookName, @NotNull double bookPrice, String authorName) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.authorName = authorName;
	}
	public Book(@NotNull String bookName, @NotNull double bookPrice) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
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
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", authorName="
				+ authorName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + (int) (bookId ^ (bookId >>> 32));
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(bookPrice);
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
		Book other = (Book) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (bookId != other.bookId)
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (Double.doubleToLongBits(bookPrice) != Double.doubleToLongBits(other.bookPrice))
			return false;
		return true;
	}
}
