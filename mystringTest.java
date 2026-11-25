import static org.junit.Assert.*;

import org.junit.Test;

public class mystringTest {

	@Test
	public void test() {
		
		mystring S = new mystring();
	S.setString("?");
	assertEquals(" test case 1: " , "?" , S.invert() );
     S.setString("a");
     
     
     assertEquals("test case 2:", "A", S.invert());
     
     assertEquals("test case 3:", "a", S.invert());
     S.setString("kuwait");
     
     assertEquals("test case 4:", "KUWAIT", S.invert());
     
     assertEquals("test case 5:", "kuwait", S.invert());
     S.setString("KuwaIT");
     
     assertEquals("test case 6:", "kUWAit", S.invert());
     S.setString("[kuwait]!");
     
     assertEquals("test case 7:", "[KUWAIT]!", S.invert());
     
     assertEquals("test case 8:", "[kuwait]!", S.invert());
     S.setString("[kuW aiT]!");
     
     assertEquals("test case 9:", "[KUw AIt]!", S.invert());

     
     
 }

}
