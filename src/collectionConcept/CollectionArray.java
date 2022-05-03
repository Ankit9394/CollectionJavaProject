package collectionConcept;

import java.util.ArrayList;

public class CollectionArray {

	public static void main(String[] args) {
		
		ArrayList<String> ar =new ArrayList<>();
		
		
		//find duplicate Array

		String arr[]= {"Selenium", "Cypress", "TestNG", "Selenium"};
		System.out.println(arr.length);
		
		
		boolean flag= false;
		for(int i=0; i<4; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				
				if(arr[i]==arr[j])
				{
					System.out.println("display the duplicate element"  + " " + arr[i]);
					flag=true;
				}
			}
			
		}
		if(flag==false) {
			System.out.println("duplicate not found");
		}
		
	/*Arrays.sort() vs Collections.sort()
Arrays.sort works for arrays which can be of primitive data type also. Collections.sort() works for objects Collections like ArrayList, LinkedList, etc.

We can use Collections.sort() to sort an array after creating a ArrayList of given array items.
	*/
	}

}
