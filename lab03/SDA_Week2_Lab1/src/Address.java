public class Address {

	private String house;
	private String street;
	private String city;
	private String postcode;



	public Address(String house, String street, String city, String postcode) {
		this.house = house;
		this.street = street;
		this.city = city;
		this.postcode = postcode;
	}

	@Override
    public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(String.format("House:%s ", house));
    	if(street!=null) {
    		
    		sb.append(String.format("Street:%s, ", street));
    	}
    	if(city!=null) {
    		
    		sb.append(String.format("City:%s ", city));
    	}
    	sb.append(String.format("Postcode:%s%n", postcode));
    	return sb.toString();
    }

}
