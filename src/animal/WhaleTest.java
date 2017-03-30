package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class WhaleTest {
	Whale A = new Whale();
	@Test
	public void testGetFoodNum() {
		assertEquals(A.getFoodNum(),450000);
	}

	@Test
	public void testGetRender() {
		assertEquals(A.getRender(),'r');
	}

	@Test
	public void testGetEnemy() {
		assertEquals(A.getEnemy(),' ');
	}

	@Test
	public void testGetBerat() {
		assertEquals(A.getBerat(),1500000);
	}

	@Test
	public void testGetJenisMakanan() {
		assertEquals(A.getJenisMakanan(),3);
	}

	@Test
	public void testGetSpecies() {
		assertEquals(A.getSpecies(),"Balaenoptera musculus");
	}

	@Test
	public void testGetFamili() {
		assertEquals(A.getFamili(),"Cetacea");
	}

	@Test
	public void testGetIsiExperience() {
		assertEquals(A.getIsiExperience(),"MASSIVE SEA-CREATURE!");
	}

	@Test
	public void testGetType() {
		int [] test = new int[3];
		test[0] = 0;
		test[1] = 0;
		test[2] = 1;
		assertArrayEquals(A.getType(),test);
	}

}
