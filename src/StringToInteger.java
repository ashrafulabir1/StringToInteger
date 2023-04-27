
public class StringToInteger {

	public static void main(String[] args) {
		String number1String="10";
		String number2String="20";
		String sumOf2String = "30";
		
		int number1Integer = Integer.parseInt(number1String);
		int number2Integer = Integer.parseInt(number2String);
		int sumOfInteger = Integer.parseInt(sumOf2String);
		int sum=0;
		sum=number1Integer+number2Integer;
		if (sum == sumOfInteger) {
		System.out.print("Print of 2 integer= "+sum);
		}
	}

}
