package dayfive;

public class Trainer extends person {
  private String session;
  public String getSession() {
	return session;
}
  public void setSession(String session) {
	this.session = session;
  }
  public String getDesig() {
	return desig;
  }
  public void setDesig(String desig) {
	this.desig = desig;
  }
  public String getBatchNo() {
	return batchNo;
  }
  public void setBatchNo(String batchNo) {
	this.batchNo = batchNo;
  }
  private String desig;
  private String batchNo;
  @Override
  public String toString() {
	return "Trainer [ "]";
  }
  
 
}
