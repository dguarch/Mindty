import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ricardo.db.DDBB;

public class DDBBTest {
@Test
	public void testUpdateAmigoValid(){
		DDBB.getInstance().actualizarAmigo(2,"Marta", 4);
		
		assertTrue(isOK);
	}
	
}
