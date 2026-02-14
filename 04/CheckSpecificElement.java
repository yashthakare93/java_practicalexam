import java.util.*;

public class CheckSpecificElement{
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
		
		System.out.println("Enter element to check:");
		int ele = sc.next();
		
	
        boolean found = false;
        
        for(int i=0 ; i<list.length ; i++){
            if(list[i] == ele){
                found = true;
                break;
            }
        }
        
        if(found){
            System.out.println("Element found ");
        }else{
            System.out.println("Element not found");
        }
        
    } 
}