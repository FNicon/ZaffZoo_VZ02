package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class PeacockTest {
	Peacock A = new Peacock();
	@Test
	public void testGetFoodNum() {
		assertEquals(A.getFoodNum(),15);
	}

	@Test
	public void testgetRender() {
		assertEquals(A.getRender(),'l');
	}

	@Test
	public void testGetEnemy() {
		assertEquals(A.getEnemy(),' ');
	}

	@Test
	public void testGetBerat() {
		assertEquals(A.getBerat(),50);
	}

	@Test
	public void testGetJenisMakanan() {
		assertEquals(A.getJenisMakanan(),3);
	}

	@Test
	public void testGetSpecies() {
		assertEquals(A.getSpecies(),"Afropavo congensis");
	}

	@Test
	public void testGetfamili() {
		assertEquals(A.getFamili(),"Phasianidae");
	}

	@Test
	public void testGetIsiExperience() {
		assertEquals(A.getIsiExperience(),"Rainbow Bird");
	}

	@Test
	public void testgetType() {
		int [] test = new int[3];
		test[0] = 0;
		test[1] = 1;
		test[2] = 0;
		assertArrayEquals(A.getType(),test);
	}

}
