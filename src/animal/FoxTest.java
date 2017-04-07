package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class FoxTest {
	Fox A = new Fox();
	@Test
	public void testGetFoodNum() {
		assertEquals(A.getFoodNum(),12);
	}

	@Test
	public void testgetRender() {
		assertEquals(A.getRender(),'B');
	}

	@Test
	public void testGetEnemy() {
		assertEquals(A.getEnemy(),' ');
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
		assertEquals(A.getSpecies(),"Vulpes lagopus");
	}

	@Test
	public void testGetfamili() {
		assertEquals(A.getFamili(),"Canidae");
	}

	@Test
	public void testGetIsiExperience() {
		assertEquals(A.getIsiExperience(),"MIKOOOOOOOOOOOOOOOOOOOOOOOON!");
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
