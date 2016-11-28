
public class CalculateSphearAreaAndVolume {

	public static void main(String[] args) {
	
		int r = 5;
		double area = 4 * (22/7.0) * Math.pow(r, 2);
		double volume = 4 * (22/7.0) * Math.pow(r, 3)/3;
		System.out.printf("The area of the sphear is: %f \n", area);
		System.out.printf("The volume of the sphear is: %f", volume);

	}

}
