package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class RhinoTest {
	Rhino A = new Rhino();
	@Test
	public void testGetFoodNum() {
		assertEquals(A.getFoodNum(),11500);
	}

	@Test
	public void testGetRender() {
		assertEquals(A.getRender(),'N');
	}

	@Test
	public void testGetEnemy() {
		assertEquals(A.getEnemy(),' ');
	}

	@Test
	public void testGetBerat() {
		assertEquals(A.getBerat(),23000);
	}

	@Test
	public void testGetJenisMakanan() {
		assertEquals(A.getJenisMakanan(),1);
	}

	@Test
	public void testGetSpecies() {
		assertEquals(A.getSpecies(),"Ceratotherium simum");
	}

	@Test
	public void testGetFamili() {
		assertEquals(A.getFamili(),"Cervidae");
	}

	@Test
	public void testGetIsiExperience() {
		assertEquals(A.getIsiExperience(),"The rhino have a sharp horn");
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
