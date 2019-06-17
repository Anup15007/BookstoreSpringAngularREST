package com.cg.bookstore.beans;

public class Admin{
	User user;
	String adminFullname;
	public Admin() {
		super();
	}
	public Admin(User user,String adminFullname) {
		super();
		this.adminFullname = adminFullname;
		this.user = user;
	}
	public String getAdminFullname() {
		return adminFullname;
	}
	public void setAdminFullname(String adminFullname) {
		this.adminFullname = adminFullname;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adminFullname == null) ? 0 : adminFullname.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Admin other = (Admin) obj;
		if (adminFullname == null) {
			if (other.adminFullname != null)
				return false;
		} else if (!adminFullname.equals(other.adminFullname))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	
}
