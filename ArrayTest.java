import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayTest {

	@Test
	public void test() {
		 Array  X = new Array(); 

		  

		  int [] multiple = { 2, 1, 5, 2, 1, 2};            

		         int [] one = { 5 } ; 

		         X.setArray(one);  

		      assertEquals(" test case 1:", 0, X.OCCUR(3));  

		 

		            assertEquals(" test case 2:", 1, X.OCCUR(5));  

		      X.setArray(multiple);  

		assertEquals(" test case 3:" , 0, X.OCCUR(3));  

		assertEquals(" test case 4:" , 1, X.OCCUR(5));  

		assertEquals(" test case 5:" , 3, X.OCCUR(2));  

		             multiple[1]= multiple[2]= multiple[4]= 2; 

		X.setArray(multiple); 

		assertEquals(" test case 6:" , 6, X.OCCUR(2)); 

		}  

 
	}


