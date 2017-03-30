package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquirrelMonkeyTest {
	SquirrelMonkey A = new SquirrelMonkey();
	@Test
	public void testGetFoodNum() {
		assertEquals(A.getFoodNum(),5);
	}

	@Test
	public void testGetRender() {
		assertEquals(A.getRender(),'V');
	}

	@Test
	public void testGetEnemy() {
		assertEquals(A.getEnemy(),' ');
	}

	@Test
	public void testGetBerat() {
		assertEquals(A.getBerat(),10);
	}

	@Test
	public void testGetJenisMakanan() {
		assertEquals(A.getJenisMakanan(),1);
	}

	@Test
	public void testGetSpecies() {
		assertEquals(A.getSpecies(),"Saimiri sciureus");
	}

	@Test
	public void testGetFamili() {
		assertEquals(A.getFamili(),"Cercopithecidae");
	}

	@Test
	public void testGetIsiExperience() {
		assertEquals(A.getIsiExperience(),"Squirrel monkey is a type of monkey that is very small");
	}

	@Test
	public void testGetType() {
		int [] test = new int[3];
		test[0] = 1;
		test[1] = 0;
		test[2] = 0;
		assertArrayEquals(A.getType(),test);
	}

}
