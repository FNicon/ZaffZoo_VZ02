package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class TigerTest {
	Tiger A = new Tiger();
	@Test
	public void testGetFoodNum() {
		assertEquals(A.getFoodNum(),400);
	}

	@Test
	public void testgetRender() {
		assertEquals(A.getRender(),'K');
	}

	@Test
	public void testGetEnemy() {
		assertEquals(A.getEnemy(),' ');
	}

	@Test
	public void testGetBerat() {
		assertEquals(A.getBerat(),2000);
	}

	@Test
	public void testGetJenisMakanan() {
		assertEquals(A.getJenisMakanan(),2);
	}

	@Test
	public void testGetSpecies() {
		assertEquals(A.getSpecies(),"Panthera tigris tigris");
	}

	@Test
	public void testGetfamili() {
		assertEquals(A.getFamili(),"Felidae");
	}

	@Test
	public void testGetIsiExperience() {
		assertEquals(A.getIsiExperience(),"ROAR!");
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
