package AUG_19;


public class Armstrong01 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 125;
        System.out.println(generateArmstrongNums(num1, num2));
    }
    
    public static String generateArmstrongNums(int start, int limit) {
    	int n;
    	String result = "";
		if (start <= 0 || limit <= 0)
			return "-1";
		else if (start >= limit)
			return "-2";
		else {
			for (int num = start; num <= limit; num++) {
				if (isArmstrong(num))
					result += num + ",";
			}
			int length = result.length();
			if (length == 0)
				return "-3";
		}
		result = result.substring(0, result.length() - 1);
		return result;
    }

    public static boolean isArmstrong(int num) {
    	int sumOfPowersOfDigits = sumOfPowersOfDigits(num);
		if (num == sumOfPowersOfDigits)
			return true;

		return false;
    }

    public static int sumOfPowersOfDigits(int n) {
    	int sum = 0;
    	int[] digits = getDigits(n);
    	for(int i = 0; i<digits.length; i++){
    		sum += power(digits[i], digits.length);
    	}
        return sum;
    }

    public static int[] getDigits(int n) {
    	String s = String.valueOf(n);
    	int size = s.length();
    	int[] digits = new int [size];
    	int index = 0;
    	while (n> 0){
    		int d = n% 10;
    		digits[index] = d;
    		index++;
    		n/= 10;
    	
    	}
		return digits;
    }

    public static int power(int d, int p) {
        int power = 1;
        while (p > 0){
        	power *= d;
        	p--;
        }
        return power;
    }
}