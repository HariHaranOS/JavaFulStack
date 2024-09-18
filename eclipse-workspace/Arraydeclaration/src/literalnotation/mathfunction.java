package literalnotation;

public class mathfunction {

	public static void main(String[] args) {
		double angleInDegrees=10.0;
		double angleInRadians=Math.toRadians(angleInDegrees);
		double sineValue=Math.sin(angleInRadians);
		double cosinValue=Math.cos(angleInRadians);
		double tangentValue=Math.tan(angleInRadians);
		
		System.out.println("sine of "+angleInDegrees+"degrees:"+sineValue);
		System.out.println("cosin of "+angleInDegrees+"degrees:"+cosinValue);
		System.out.println("Tangent of"+angleInDegrees+"degrees:"+tangentValue);
		}
	
}
