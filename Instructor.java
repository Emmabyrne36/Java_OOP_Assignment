public class Instructor extends Person {
	private String position; // defines the position of the instructor
	private Module module;


	public Instructor(Name name, Address address, String position) {
		super(name, address);
		this.position = position;		
	}

	public void setModule(Module module) {
		this.module = module;	
	}

	@Override
	public String toString() {
		// Create a string builder to add the relevant information to
		StringBuilder sb = new StringBuilder("");
		sb.append(super.toString()+ "\nposition: " + this.position + "\nmodule: ");
		if (module == null) {
			sb.append("not set \n");
		} else {
			sb.append(module.getCode() + " (" + module.getTitle() + ") \n\t");	
		}
		return sb.toString();
	}
}
