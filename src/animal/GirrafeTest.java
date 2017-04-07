package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class GirrafeTest {
	Girrafe A = new Girrafe();
	@Test
	public void testGetFoodNum() {
		assertEquals(A.getFoodNum(),600);
	}

	@Test
	public void testgetRender() {
		assertEquals(A.getRender(),'Q');
	}

	@Test
	public void testGetEnemy() {
		assertEquals(A.getEnemy(),' ');
	}

	@Test
	public void testGetBerat() {
		assertEquals(A.getBerat(),1200);
	}

	@Test
	public void testGetJenisMakanan() {
		assertEquals(A.getJenisMakanan(),1);
	}

	@Test
	public void testGetSpecies() {
		assertEquals(A.getSpecies(),"Giraffa camelopardalis");
	}

	@Test
	public void testGetfamili() {
		assertEquals(A.getFamili(),"Girrafidae");
	}

	@Test
	public void testGetIsiExperience() {
		assertEquals(A.getIsiExperience(),"Girrafes live in africa");
	}

	@Test
	public void testgetType() {
		int [] test = new int[3];
		test[0] = 1;
		test[1] = 0;
		test[2] = 0;
		assertArrayEquals(A.getType(),test);
	}

}
