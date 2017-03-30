package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class GorillaTest {
	Gorilla A = new Gorilla();
	@Test
	public void testGetFoodNum() {
		assertEquals(A.getFoodNum(),800);
	}

	@Test
	public void testGetRender() {
		assertEquals(A.getRender(),'T');
	}

	@Test
	public void testGetEnemy() {
		assertEquals(A.getEnemy(),' ');
	}

	@Test
	public void testGetBerat() {
		assertEquals(A.getBerat(),1600);
	}

	@Test
	public void testGetJenisMakanan() {
		assertEquals(A.getJenisMakanan(),1);
	}

	@Test
	public void testGetSpecies() {
		assertEquals(A.getSpecies(),"Gorilla");
	}

	@Test
	public void testGetFamili() {
		assertEquals(A.getFamili(),"Hominidae");
	}

	@Test
	public void testGetIsiExperience() {
		assertEquals(A.getIsiExperience(),"There was a gorilla named Harambe");
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
