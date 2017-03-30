package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class LionTest {
	Lion A = new Lion();
	@Test
	public void testGetFoodNum() {
		assertEquals(A.getFoodNum(),360);
	}

	@Test
	public void testGetRender() {
		assertEquals(A.getRender(),'F');
	}

	@Test
	public void testGetEnemy() {
		assertEquals(A.getEnemy(),'K');
	}

	@Test
	public void testGetBerat() {
		assertEquals(A.getBerat(),1800);
	}

	@Test
	public void testGetJenisMakanan() {
		assertEquals(A.getJenisMakanan(),2);
	}

	@Test
	public void testGetSpecies() {
		assertEquals(A.getSpecies(),"Panthera leo");
	}

	@Test
	public void testGetFamili() {
		assertEquals(A.getFamili(),"Felidae");
	}

	@Test
	public void testGetIsiExperience() {
		assertEquals(A.getIsiExperience(),"ROAAARRR!");
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
