package leetcode.april.competition.leetcodes.codes.leetcode.oldcodes;

import java.util.Map.Entry;
import java.util.*;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int arr[] = new int[range];
		for (int i = 0; i < range; i++)
			arr[i] = sc.nextInt();
		int val = sc.nextInt();
		int ans = SearchInsertPosition(arr, val);
		System.out.println(ans);

	}

	private static int SearchInsertPosition(int[] arr, int val) {

		if (arr.length == 0 || arr == null)

			return 0;
		else {
			int l = 0;
			int r = arr.length - 1;
			while (l <= r) {
				int mid = l + (r - 1) / 2;
				if (arr[mid] == val)
					return mid;
				else if (arr[mid] > val)
					r = mid - 1;
				else
					l = mid + 1;
			}
			return l;

		}
	}
}

//		Iterator<Integer> itr = map.keySet().iterator();
//		 
//		while (itr.hasNext()) 
//		{
//		    Integer key = itr.next();
//		    String value = map.get(key);
//		     
//		    System.out.println("The key is :: " + key + ", and value is :: " + value );
//		}
//		 
//		System.out.println("//Iterate over entries set");
//		 
//		Iterator<Entry<Integer, String>> entryIterator = map.entrySet().iterator();
//		 
//		while (entryIterator.hasNext()) 
//		{
//		    Entry<Integer, String> entry = entryIterator.next();
//		     
//		    System.out.println("The key is :: " + entry.getKey() + ", and value is :: " + entry.getValue() );
//		}
//		

//		 Set set=map.entrySet();//Converting to Set so that we can traverse  
//		    Iterator itr=set.iterator();  
//		    while(itr.hasNext()){  
//		        //Converting to Map.Entry so that we can get key and value separately  
//		        Map.Entry entry=(Map.Entry)itr.next();  
//		        System.out.println(entry.getKey()+" "+entry.getValue());  
//		    }  

//		Set<Integer> keySet= new HashSet<Integer>(map.keySet());
//        keySet.forEach(key-> System.out.println(key));
