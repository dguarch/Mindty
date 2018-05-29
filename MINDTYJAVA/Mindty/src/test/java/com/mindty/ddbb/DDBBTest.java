/*package com.mindty.ddbb;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.mindty.ddbb.BBDD;



public class DDBBTest {
@Test
	public void testUsuarioOkContraseñaOk(){
		
		boolean isOK = BBDD.getInstance().AnalisisLogin("Youssef","Youssef");
		assertTrue(isOK);
	}

@Test
public void testUsuarioErrContraseñaStringErr(){
	
	boolean isOK = BBDD.getInstance().AnalisisLogin("Feota","Si lo es");
	assertTrue(isOK);
}
@Test
public void testUsuarioNContraseñaN(){
	
	boolean isOK = BBDD.getInstance().AnalisisLogin("","");
	assertTrue(isOK);
}
@Test
public void testUsuarioNullContraseñaNull(){
	
	boolean isOK = BBDD.getInstance().AnalisisLogin("null","null");
	assertTrue(isOK);
}
@Test
public void testUsuarioNumContraseñaNum(){
	
	boolean isOK = BBDD.getInstance().AnalisisLogin("25","1");
	assertTrue(isOK);
}
@Test
public void testUsuarioMinContraseñaMin(){
	
	boolean isOK = BBDD.getInstance().AnalisisLogin("youssef","youssef");
	assertTrue(isOK);
}

//@Test
//public void testUpdateBBDDsalvado(){
//	Amigo miAmigo =DDBB.getInstance().getAmigo1(2);
//			
//	
//	assertTrue(miAmigo);
//}



}*/
