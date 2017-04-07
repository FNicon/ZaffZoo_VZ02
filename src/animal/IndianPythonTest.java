package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class IndianPythonTest {
	IndianPython A = new IndianPython();
	@Test
	public void testGetFoodNum() {
		assertEquals(A.getFoodNum(),6);
	}

	@Test
	public void testgetRender() {
		assertEquals(A.getRender(),'a');
	}

	@Test
	public void testGetEnemy() {
		assertEquals(A.getEnemy(),' ');
	}

	@Test
	public void testGetBerat() {
		assertEquals(A.getBerat(),30);
	}

	@Test
	public void testGetJenisMakanan() {
		assertEquals(A.getJenisMakanan(),2);
	}

	@Test
	public void testGetSpecies() {
		assertEquals(A.getSpecies(),"Python molurus");
	}

	@Test
	public void testGetfamili() {
		assertEquals(A.getFamili(),"Pythonidae");
	}

	@Test
	public void testGetIsiExperience() {
		assertEquals(A.getIsiExperience(),"Hssssssh!");
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
