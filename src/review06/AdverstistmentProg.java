package review06;

public class AdverstistmentProg {

	public static void main(String[] args) {
		
	}
		   public static void calculatePrice(String input,double width,double height){
		        int numberOfDays=input.substring(7).length();
		        double tax=0.5;
		        double areaFee=width*height;
		        double advertisingFee=areaFee+numberOfDays*tax;
		        System.out.println((int)advertisingFee);

	}

}
