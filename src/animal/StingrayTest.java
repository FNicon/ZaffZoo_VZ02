package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class StingrayTest {
	Stingray A = new Stingray();
	@Test
	public void testGetFoodNum() {
		assertEquals(A.getFoodNum(),480);
	}

	@Test
	public void testGetRender() {
		assertEquals(A.getRender(),'q');
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
		assertEquals(A.getJenisMakanan(),3);
	}

	@Test
	public void testGetSpecies() {
		assertEquals(A.getSpecies(),"Manta birostris");
	}

	@Test
	public void testGetFamili() {
		assertEquals(A.getFamili(),"Myliobatidae");
	}

	@Test
	public void testGetIsiExperience() {
		assertEquals(A.getIsiExperience(),"Wide Fish");
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
