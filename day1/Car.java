package week1.day1;

public class Car {
	
	public void driveCar() {
		System.out.println("Long drive is preferred");
	}
	
	void applyBrake() {
		System.out.println("Need to control");
	}
	
	public void soundHorn() {
		System.out.println("To alert others");
	}
	
	private void isPuncture() {
		System.out.println("Check the tyre condition");
	}
	

	public static void main(String[] args) {
		
		Car func=new Car();
		
		 func.driveCar();
		 func.applyBrake();
		 func.soundHorn();
		 func.isPuncture();

	}

}
