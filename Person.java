public class Person {
	private Name name;
	private Address address;
	
	public Person(Name name, Address address) {
		this.name = name;
		this.address = address;		
	}
	
	public Name getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return "name: " + name + "\naddress: " + address;
	}

}
