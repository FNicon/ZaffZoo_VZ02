package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class BearTest {
	Bear A = new Bear();
	@Test
	public void testGetFoodNum() {
		assertEquals(A.getFoodNum(),1410);
	}

	@Test
	public void testgetRender() {
		assertEquals(A.getRender(),'H');
	}

	@Test
	public void testGetEnemy() {
		assertEquals(A.getEnemy(),' ');
	}

	@Test
	public void testGetBerat() {
		assertEquals(A.getBerat(),4700);
	}

	@Test
	public void testGetJenisMakanan() {
		assertEquals(A.getJenisMakanan(),3);
	}

	@Test
	public void testGetSpecies() {
		assertEquals(A.getSpecies(),"Ursus arctos");
	}

	@Test
	public void testGetfamili() {
		assertEquals(A.getFamili(),"Ursoidea");
	}

	@Test
	public void testGetIsiExperience() {
		assertEquals(A.getIsiExperience(),"BROAARGH");
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
