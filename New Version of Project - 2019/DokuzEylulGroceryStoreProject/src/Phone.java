
public class Phone {

	String countrycode;
	String tennumber;
	
	Phone()
	{
		countrycode = "+90";
		tennumber = "0000000000"; 
	}
	
	Phone(String countrycode,String tennumber)
	{
		this.countrycode = countrycode;
		this.tennumber = tennumber;
	}

	@Override
	public String toString() {
		return "[countrycode=" + countrycode + ", tennumber=" + tennumber + "]";
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public String getTennumber() {
		return tennumber;
	}

	public void setTennumber(String tennumber) {
		this.tennumber = tennumber;
	}
	
	
}
