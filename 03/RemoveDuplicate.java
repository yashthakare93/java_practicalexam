// Write a program to remove duplicate elements of a given string.
import java.util.*;

public class RemoveDuplicate{
	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements to add :");
		int n = sc.nextInt();
		
		System.out.println("Enter elements");
		for(int i=0 ; i<n ; i++){
			int ele = sc.nextInt();
			list.add(ele);
		}
		

		Set<Integer> hs = new HashSet<Integer>();
		hs.addAll(list);

		System.out.println(hs);
		
	}
}