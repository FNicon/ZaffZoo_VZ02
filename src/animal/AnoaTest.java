package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnoaTest {
	Anoa A = new Anoa();
	@Test
	public void testGetFoodNum() {
		assertEquals(A.getFoodNum(),440);
	}

	@Test
	public void testGetRender() {
		assertEquals(A.getRender(),'K');
	}

	@Test
	public void testGetEnemy() {
		assertEquals(A.getEnemy(),' ');
	}

	@Test
	public void testGetBerat() {
		assertEquals(A.getBerat(),2200);
	}

	@Test
	public void testGetJenisMakanan() {
		assertEquals(A.getJenisMakanan(),2);
	}

	@Test
	public void testGetSpecies() {
		assertEquals(A.getSpecies(),"Anoa");
	}

	@Test
	public void testGetFamili() {
		assertEquals(A.getFamili(),"Bovidae");
	}

	@Test
	public void testGetIsiExperience() {
		assertEquals(A.getIsiExperience(),"The anoa is eating grass");
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
