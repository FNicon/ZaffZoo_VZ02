package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class EagleTest {
	Eagle A = new Eagle();
	@Test
	public void testGetFoodNum() {
		assertEquals(A.getFoodNum(),12);
	}

	@Test
	public void testGetRender() {
		assertEquals(A.getRender(),'j');
	}

	@Test
	public void testGetEnemy() {
		assertEquals(A.getEnemy(),'X');
	}

	@Test
	public void testGetBerat() {
		assertEquals(A.getBerat(),60);
	}

	@Test
	public void testGetJenisMakanan() {
		assertEquals(A.getJenisMakanan(),2);
	}

	@Test
	public void testGetSpecies() {
		assertEquals(A.getSpecies(),"Aquila chrysaetos");
	}

	@Test
	public void testGetFamili() {
		assertEquals(A.getFamili(),"Accipitridae");
	}

	@Test
	public void testGetIsiExperience() {
		assertEquals(A.getIsiExperience(),"screeech!!!");
	}

	@Test
	public void testGetType() {
		int [] test = new int[3];
		test[0] = 0;
		test[1] = 1;
		test[2] = 0;
		assertArrayEquals(A.getType(),test);
	}

}
