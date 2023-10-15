public class vehicle {
	private String brandName;
	private String modeName;
	private int speed;
	
	vehicle(){			//跟文件名
		System.out.println("Supreless constructor is call");
	
	}
	
	vehicle(String brandName,String modeName){			//跟文件名
		this.brandName = brandName;
		this.modeName = modeName;
	
	}
	
	/*vehicle(String brandName, String modeName){
		this.brandName = brandName;
		thismodelName = modeName;
	}*/
	
	
	public void brake(){
		System.out.println("brake is pressed");
		speed--;
	}
	
	public void accelarate(){
		speed++;
	}
	
	public void horn(){
		System.out.println("Beep beep");
	} 
	
	public void setBrandName(String brandName){
		this.brandName = brandName;
	}
	
	public String getBrandName(){
		return brandName;
	}
	
	public static void main (String[]args){
		Car carl = new Car("Tesla","B1");
		carl.horn();
		carl.setBrandName("Tesla");
		System.out.println("Car Brand = " + carl.getBrandName());
		Car car2 = new Car();
		System.out.println("Car Brand = " + car2.getBrandName());
		Truck1.horn(); truck1.setBrandName("Tesla again");
		System.out.println("Truck Brand = " + truck1.getBrandName());
	
	}

}
class Car extends vehicle{
	Car(String brandName,String modeName){
		super(brandName,modeName);
		
	}
	Car(){
		System.out.println("Subclass constructor is called");
	}
	public void horn(){
		System.out.println{"duk duk"};
	}
	
	class Truck extends vehicle {
		public void horn(){
			System.out.println("Beep..............beep");
		}
	}
}