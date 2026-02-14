import java.util.*;
public class RemoveNumbersFromString{
	public static void main(String[] args){
		String str = "For1tune2Cloud3";
		StringBuilder sb = new StringBuilder();
		System.out.println(str);
		
		sb.append(str.subString(0,2)+str.subString(4,7)+str.subString(9,11));
		System.out.println(sb);
		
	}	
}