package com.cg.bookstore.beans;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	@NotNull
	@Column(unique=true)
	private String userEmailId;
	@NotNull
	private String password;
	private String userType;
	public User() {
		super();
	}
	public User(@NotNull String userEmailId, @NotNull String password) {
		super();
		this.userEmailId = userEmailId;
		this.password = password;
	}
	public User(long userId, @NotNull String userEmailId, @NotNull String password, String userType) {
		super();
		this.userId = userId;
		this.userEmailId = userEmailId;
		this.password = password;
		this.userType = userType;
	}
	public String getUserEmailId() {
		return userEmailId;
	}
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userEmailId == null) ? 0 : userEmailId.hashCode());
		result = prime * result + (int) (userId ^ (userId >>> 32));
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
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
		User other = (User) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userEmailId == null) {
			if (other.userEmailId != null)
				return false;
		} else if (!userEmailId.equals(other.userEmailId))
			return false;
		if (userId != other.userId)
			return false;
		if (userType == null) {
			if (other.userType != null)
				return false;
		} else if (!userType.equals(other.userType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userEmailId=" + userEmailId + ", password=" + password + ", userType="
				+ userType + "]";
	}
}
