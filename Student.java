public class Student extends Person {
	private String programme;
	private final int MAX_NUMBER_MODULES = 12;
	private Module[] modules = new Module[MAX_NUMBER_MODULES];  // how do we know what size to make the array?  Module as the type??
	private int number_of_modules = 0;
	

	public Student(Name name, Address address, String programme){
		super(name,address);
		this.programme = programme;
	}
	
	public boolean addModule(Module m){
		// Start counter at 0, add module at that index, increase counter
		if (this.number_of_modules < MAX_NUMBER_MODULES) {
			modules[number_of_modules] = m;
			this.number_of_modules ++;
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString(){
		// Create a string builder to add the relevant information to
		StringBuilder sb = new StringBuilder("");
		sb.append(super.toString() +"\nprogramme: " + programme + "\nmodules: \n");
		// If the module array is empty, append "null", else iterate through the array and add the codes and titles of the modules to the array
		if (modules[0] == null){
			sb.append("\t none \n");			
		} else {
			for (Module m: modules) {
				if (m == null)
					break;
			   sb.append("\t" + m.getCode() + " (" + m.getTitle() + ") \n");
			}
		}
		return sb.toString();
	}
}
