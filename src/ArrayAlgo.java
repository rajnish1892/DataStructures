import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayAlgo {
	private static String exp = "ABAAABBBFGDJJSKRTRTALKHISGHFNASD";

	public static void main(String a[]) {
		Map<Character, Integer> expMap = new HashMap<Character, Integer>();
		for (int i = 0; i < exp.length(); i++) {
			if (expMap.containsKey(exp.charAt(i))) {
				expMap.put(exp.charAt(i), expMap.get(exp.charAt(i)) + 1);
			} else {
				expMap.put(exp.charAt(i), 1);
			}
		}
		for (Character c : expMap.keySet()) {

			//System.out.print(expMap.get(c) + "" + c);

		}
		arrayRearrange();
	}

	public static void arrayRearrange() {
		String str = "AAAAAAAAAAABAAABBBFGDJJSKRTRTALKHISGHFNASDAAAAAAAAAAAAA";
		//String str = "ABCDEF";
		int strLength = str.length();
		int arrLength = strLength*2 + 100;
		int rearrangeLength = strLength+1;
		int count =0;
		char[] exp = new char[ arrLength ];
		for (int i = 0; i < strLength; i++) {
			exp[i] = str.charAt(i);
		}
		for (int i = 0; i < strLength; i++) {
			int characterIndex = strLength*2 + exp[i];
			if ( exp[i] != ' ' && exp[ characterIndex ] >= 1 ){
				exp[ characterIndex ] = (char)(exp[characterIndex] +1);
			} else if ( exp[i] != ' ' ){
				exp[ characterIndex ] = 1;
			}
		}
		for (int i = 0; i < strLength; i++) {
			if((int)exp[ strLength*2 + (int)exp[i]] != 65535){
			exp[ rearrangeLength ] = exp[ strLength*2 + (int)exp[i]];
			exp[ rearrangeLength + 1 ] = exp[i];
			exp[ strLength*2 + (int)exp[i]] = (char)(-1);
			rearrangeLength = rearrangeLength + 2;
			count++;
			}
		}
		for (int i = strLength+1; i < strLength+count*2+1; i++) {
			exp[i - strLength -1 ] = exp[i];
			if((i - strLength -1)%2 ==0){
				System.out.print((int)exp[i - strLength -1]);
			}else {
				System.out.print((char)exp[i - strLength -1]);
			}
		}
	}
}
