class Vehicle {
	
    public static void main(String[] args) {	// создание класса
        Vehicle car = new Vehicle();			// создание объекта car класса Vehicle
		Vehicle bicycle = new Vehicle();
		
		car.sound();							// вызов метода sound для объекта car
		bicycle.tone();
	}

	void sound(){								// создание метода sound
		System.out.println("Bi-bi!");
	}

	void tone(){
		System.out.println("Dzin-dzin!");
	}

}
