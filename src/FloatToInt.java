
public class FloatToInt {
	
	float y = 10.64f;

	public static void main(String[] args) {
		System.out.println(turnFloatToInt(10.4f));

	}
	
	
	public static int turnFloatToInt(float input)
	{
		int answer = (int) input;
		return answer;
	}
}
