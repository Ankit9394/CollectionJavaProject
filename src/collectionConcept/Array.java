package collectionConcept;

import java.util.Iterator;
public class Array {
     // size is fixed can ot changed once declared
	public static void main(String[] args) {
	 int[] ankit= new int[4] ;
	 
	 ankit[0]=10;
	 ankit[1]=11;
	 ankit[2]=12;
	 ankit[3]=9;
	 ankit[0]=15;// remove and new value to the array
	 
	 System.out.println(ankit.length);
	 
	 for(int i=0; i<4; i++) {
		 System.out.println(ankit[i]);
	 }	
	
	}

}
