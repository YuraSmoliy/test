
public class Cat extends Pet implements Voise {
	public Cat() {
		
	}

	public Cat(String name, int width, String location,int age) {
		super.setName(name);
		super.setWidth(width);
		super.setLocation(location);
		super.setAge(age);
	}

	@Override
	public String voise() {
		return "I am cat - My My";
	}


}
