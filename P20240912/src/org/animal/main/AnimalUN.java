package org.animal.main;

import org.animal.model.Animal;
import org.animal.model.Cat;
import org.animal.model.Dog;
import org.animal.model.Pet;
import org.animal.model.�̰�H;

public class AnimalUN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();//Polymorphism
		Cat c = new Cat();
		
		//d.speak(); //VMI(Virtual Method Invocation)
		//c.speak(); //Dynamic Binding
		
		//�W�x�o��(d);
		//�W�x�o��(c);
		
		�̰�H a = new �̰�H();
		
		//����|��(c, d);
		�h��|��(c, d, a);
		
		Pet.foo();
		d.bar();
		d.baz();
	}
	
	public static void �W�x�o��(Animal a) {
		a.speak();
	}

	public static void ����|��(Animal a1, Animal a2) {
		a1.speak();
		a2.speak();
	}
	
	public static void �h��|��(Animal... animals) {
		for (Animal animal : animals) {
			animal.speak();
		}
	}
}
