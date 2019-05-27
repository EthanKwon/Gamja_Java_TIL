package sec07Car;

public class Car {
	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
		
	}
	
	Car(String model){
		this(model,"은색",250);
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxspeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxspeed;
		
	}

	public String toString(int i) {
		return "Car"+i+" [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
	
	

}
