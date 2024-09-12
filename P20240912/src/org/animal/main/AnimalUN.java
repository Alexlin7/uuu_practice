package org.animal.main;

import org.animal.model.Animal;
import org.animal.model.Cat;
import org.animal.model.Dog;
import org.animal.model.Pet;
import org.animal.model.米國人;

public class AnimalUN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();//Polymorphism
		Cat c = new Cat();
		
		//d.speak(); //VMI(Virtual Method Invocation)
		//c.speak(); //Dynamic Binding
		
		//上台發言(d);
		//上台發言(c);
		
		米國人 a = new 米國人();
		
		//雙邊會談(c, d);
		多邊會談(c, d, a);
		
		Pet.foo();
		d.bar();
		d.baz();
	}
	
	public static void 上台發言(Animal a) {
		a.speak();
	}

	public static void 雙邊會談(Animal a1, Animal a2) {
		a1.speak();
		a2.speak();
	}
	
	public static void 多邊會談(Animal... animals) {
		for (Animal animal : animals) {
			animal.speak();
		}
	}
}
