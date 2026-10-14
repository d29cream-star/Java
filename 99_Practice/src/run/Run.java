package run;

import objectpractice01.BankAccount;
import objectpractice01.Book;
import objectpractice01.Box;
import objectpractice01.Car;
import objectpractice01.Cat;
import objectpractice01.Chair;
import objectpractice01.Dog;
import objectpractice01.GameCharacter;
import objectpractice01.ShoppingCart;
import objectpractice01.SmartPhone;

public class Run {

	public static void main(String[] args) {

		Dog dog1 = new Dog(); 
			dog1.name = "마루";
			dog1.age = 10;
			dog1.color	= "brown";	
			dog1.gender = "Female";
			dog1.species = "푸들";
		
		Dog dog2 = new Dog();
			dog2.name = "똘이";
			dog2.age = 8;
			dog2.color = "white";
			dog2.gender = "Male";
			dog2.species = "말티즈";
			
			
		dog1.walk();
		dog2.bark();
		
		
		Cat cat1 = new Cat();
			cat1.name = "다찌";
			cat1.age = 11;
			cat1.color = "cheeze";
			
		Cat cat2 = new Cat();
			cat2.name = "등이";
			cat2.age = 6;
			cat2.color = "고등어";
			
		cat1.meow();
		cat2.purr();
		
		
		Car car1 = new Car();
			car1.carNumber = 4885;
			car1.color	= "black";
			car1.manufacturer = "hyundai";
			car1.model = "avante";
			car1.seatCapacity = 5;
			
		Car car2 = new Car();
			car2.carNumber = 8547;
			car2.color = "white";
			car2.manufacturer = "Mercedes-Benz";
			car2.model = "EQS SUV";
			car2.seatCapacity = 5;
					
		car1.drive();
		car2.accelerate();
	
		
		Box box1 = new Box();
			box1.color = "brown";
			box1.contents = "clothes";
			box1.material = "paper";
			box1.size = "200*800*500";
			
		Box box2 = new Box();
			box2.color = "blue";
			box2.contents = "이사짐";
			box2.material = "plastic";
			box2.size = "800*800*1600";
			
		box1.carry();
		box2.pile();
		

		GameCharacter gc1 = new GameCharacter();
			gc1.gender = "Female";
			gc1.nickName = "울라울라";
			gc1.level = 1;
			gc1.job = "archer";
			
		GameCharacter gc2 = new GameCharacter();
			gc2.gender = "Male";
			gc2.nickName = "아몬드";
			gc2.level = 1;
			gc2.job = "warrior";
			
		gc1.attack();
		gc2.defend();
			
		
		BankAccount ba1 = new BankAccount();
			ba1.accountNumber = "110-144-448822";
			ba1.bankName = "신한";
			ba1.accountHolder = "조안나";
			ba1.checkCard = true;
			ba1.pinNumber = "1234";
			
		BankAccount	ba2 = new BankAccount();
			ba2.accountHolder = "조나단";
			ba2.accountNumber = "458-28-44851-456";
			ba2.bankName = "농협";
			ba2.checkCard = false;
			ba2.pinNumber = "0123";
			
		ba1.deposit();
		ba2.transfer();
		
		Book b1	= new Book();
			b1.author = "한강";
			b1.edition = "2007.10.30";
			b1.genre = "novel";
			b1.publisher = "창비";
			b1.title = "채식주의자";
		
		Book b2 = new Book();
			b2.title = "절창";
			b2.publisher = "문학동네";
			b2.author = "구병모";
			b2.edition = "2025.09.17";
			b2.genre = "novel";
			
		b1.publish();
		b2.read();
		
		
		Chair c1 = new Chair();
			c1.manufacturer = "한샘";
			c1.material = "fabric";
			c1.seats = 4;
			c1.site = "living room";
			c1.use = "sofa";
			
		Chair c2 = new Chair();
			c2.manufacturer = "시디즈";
			c2.material = "fabric and steel";
			c2.seats = 1;
			c2.site = "office";
			c1.use = "work";
			
		c1.shift();
		c2.sitdown();
		
		ShoppingCart sc1 = new ShoppingCart();
			sc1.marketName = "emart";
			sc1.charge = true;
			sc1.type = "big cart";
			sc1.babySeat = true;
			
		ShoppingCart sc2 = new ShoppingCart();
			sc2.marketName = "우리마켓";
			sc2.charge = false;
			sc2.type = "small cart";
			sc2.babySeat = false;
		
		sc1.addItem();
		sc2.checkOut();
		
		
		SmartPhone sp1 = new SmartPhone();
			sp1.manufacturer = "SamSung";
			sp1.color = "white";
			sp1.model = "z fold 8";
			sp1.phoneNumber = "010-4588-7522";
			sp1.networkProvider = "KT";
			
		SmartPhone sp2 = new SmartPhone();
			sp2.color = "cherry";
			sp2.manufacturer = "Apple";
			sp2.model = "Duo";
			sp2.phoneNumber = "010-4568-9878";
			sp2.networkProvider = "SKT";
		
		sp1.call();
		sp2.powerOn();
			
			
		
		
					
		

		
	}

}
