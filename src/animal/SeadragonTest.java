package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class SeadragonTest {
	Seadragon A = new Seadragon();
	@Test
	public void testGetFoodNum() {
		assertEquals(A.getFoodNum(),12);
	}

	@Test
	public void testgetRender() {
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
	public void testGetfamili() {
		assertEquals(A.getFamili(),"Accipitridae");
	}

	@Test
	public void testGetIsiExperience() {
		assertEquals(A.getIsiExperience(),"screeech!");
	}

	@Test
	public void testgetType() {
		int [] test = new int[3];
		test[0] = 0;
		test[1] = 0;
		test[2] = 1;
		assertArrayEquals(A.getType(),test);
	}

}
