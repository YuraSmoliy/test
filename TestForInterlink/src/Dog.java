
public class Dog extends Pet implements Voise{
	public Dog() {
			
		}
	
		public Dog(String name, int width, String location,int age) {
			super.setName(name);
			super.setWidth(width);
			super.setLocation(location);
			super.setAge(age);
		}
	
		@Override
		public String voise() {
			return "I am dog - Gav Gav";
		}
}
