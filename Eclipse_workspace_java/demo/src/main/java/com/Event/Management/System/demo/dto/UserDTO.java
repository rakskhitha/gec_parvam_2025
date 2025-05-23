package com.Event.Management.System.demo.dto;

public class UserDTO {
	   private String name;
	    private String email;
	    private String phone;
	    private String password;
	    private String role;
	    
	    
	    public UserDTO() {}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		@Override
		public String toString() {
			return "userDTO [name=" + name + ", email=" + email + ", phone=" + phone + ", password=" + password
					+ ", role=" + role + "]";
		}
	    
	    
}
