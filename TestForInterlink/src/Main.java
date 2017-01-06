import java.lang.*;
public class Main {

	public static void main(String[] args) {

		Cat maru=new Cat("Maru", 12,"Ukraine",8);
		System.out.println(maru.getName());
		System.out.println(maru.voise());
		
		Dog like=new Dog("Like", 16,"Poland",5);
		System.out.println(like.getName());
		System.out.println(like.voise());
		
		Voise voiseMyPet=new Cat("Murka", 12,"Ukraine",8);
		System.out.println(voiseMyPet.voise());
	
    
	}

}
