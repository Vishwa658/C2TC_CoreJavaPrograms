package dayfive;

public class Student {
    public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Student(int uid, String cname, String city) {
		super();
		this.uid = uid;
		this.cname = cname;
		this.city = city;
	}
	
}
