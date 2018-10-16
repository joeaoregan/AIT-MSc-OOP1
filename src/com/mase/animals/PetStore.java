package com.mase.animals;

public class PetStore {

	public static void main(String[] args) {
		Animal a;
		// test a spider with a spider reference
		Lizard l = new Lizard();
		l.eat();
		l.walk();
		// test a spider with an animal reference
		a = new Lizard();
		a.eat();
		a.walk();
		
		Pet p;
		
		Dog d = new Dog("Spot");
		d.eat();
		d.walk();
		d.play();
		a = new Dog();
		a.eat();
		a.walk();
		p = new Dog();
		p.setName("Brownie");
		p.play();
		
		Goldfish g = new Goldfish();
		g.setName("Nemo");
		g.eat();
		g.walk();
		g.play();
		
		// playWithThePets(1);
		
		playWithGoldfish(g);
		playWithDogs(d);
		
		playWithPets(d);
		playWithPets(g);
	}

	public static void playWithGoldfish(Goldfish gf) {
		gf.play();
	}
	public static void playWithDogs(Dog dog) {
		dog.play();
	}
	public static void playWithPets(Pet pet) {
		pet.play();
		if(pet instanceof Animal) {
			Animal a = (Animal) pet;
			a.walk();
		}
	}
}
