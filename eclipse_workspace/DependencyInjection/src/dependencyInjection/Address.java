package dependencyInjection;

public class Address {
 private String city;
 private String state;
 
 //no args for setter injection
 
public Address() {
	super();
	
}
//full args for constructor injection
public Address(String city, String state) {
	super();
	this.city = city;
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
 
 
}
