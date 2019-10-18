
public class Address {

	String country;
	String city;
	String streetname;
	int streetnumber;
	int doornumber;
	
	Address()
	{
		 country ="TR";
		 city ="Izmir";
		 streetname = "Non";
		 streetnumber = 0;
		 doornumber = 0;
	}
	
	Address(String country,String city,String streetname,int streetnumber,int doornumber)
	{
		this.country = country;
		this.city = city;
		this.streetname = streetname;
		this.streetnumber = streetnumber;
		this.doornumber = doornumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public int getStreetnumber() {
		return streetnumber;
	}

	public void setStreetnumber(int streetnumber) {
		this.streetnumber = streetnumber;
	}

	public int getDoornumber() {
		return doornumber;
	}

	public void setDoornumber(int doornumber) {
		this.doornumber = doornumber;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", streetname=" + streetname + ", streetnumber="
				+ streetnumber + ", doornumber=" + doornumber + "]";
	}
	
	
	
}
