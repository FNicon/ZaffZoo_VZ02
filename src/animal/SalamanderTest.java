package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class SalamanderTest {
	Salamander A = new Salamander();
	@Test
	public void testGetFoodNum() {
		assertEquals(A.getFoodNum(),60);
	}

	@Test
	public void testgetRender() {
		assertEquals(A.getRender(),'X');
	}

	@Test
	public void testGetEnemy() {
		assertEquals(A.getEnemy(),' ');
	}

	@Test
	public void testGetBerat() {
		assertEquals(A.getBerat(),300);
	}

	@Test
	public void testGetJenisMakanan() {
		assertEquals(A.getJenisMakanan(),2);
	}

	@Test
	public void testGetSpecies() {
		assertEquals(A.getSpecies(),"Adnrias japonicus");
	}

	@Test
	public void testGetfamili() {
		assertEquals(A.getFamili(),"Cryptobranchidae");
	}

	@Test
	public void testGetIsiExperience() {
		assertEquals(A.getIsiExperience(),"S-A-L-A-M-A-N-D-E-R");
	}

	@Test
	public void testgetType() {
		int [] test = new int[3];
		test[0] = 1;
		test[1] = 0;
		test[2] = 1;
		assertArrayEquals(A.getType(),test);
	}

}
