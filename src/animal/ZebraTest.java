package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZebraTest {
	Zebra A = new Zebra();
	@Test
	public void testGetFoodNum() {
		assertEquals(A.getFoodNum(),1750);
	}

	@Test
	public void testGetRender() {
		assertEquals(A.getRender(),'f');
	}

	@Test
	public void testGetEnemy() {
		assertEquals(A.getEnemy(),' ');
	}

	@Test
	public void testGetBerat() {
		assertEquals(A.getBerat(),3500);
	}

	@Test
	public void testGetJenisMakanan() {
		assertEquals(A.getJenisMakanan(),1);
	}

	@Test
	public void testGetSpecies() {
		assertEquals(A.getSpecies(),"Equus quagga");
	}

	@Test
	public void testGetFamili() {
		assertEquals(A.getFamili(),"Equidae");
	}

	@Test
	public void testGetIsiExperience() {
		assertEquals(A.getIsiExperience(),"Its like a horse but black and white");
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
