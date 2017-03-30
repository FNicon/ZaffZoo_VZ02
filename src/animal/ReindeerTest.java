package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReindeerTest {
	Reindeer A = new Reindeer();
	@Test
	public void testGetFoodNum() {
		assertEquals(A.getFoodNum(),850);
	}

	@Test
	public void testGetRender() {
		assertEquals(A.getRender(),'c');
	}

	@Test
	public void testGetEnemy() {
		assertEquals(A.getEnemy(),' ');
	}

	@Test
	public void testGetBerat() {
		assertEquals(A.getBerat(),1700);
	}

	@Test
	public void testGetJenisMakanan() {
		assertEquals(A.getJenisMakanan(),1);
	}

	@Test
	public void testGetSpecies() {
		assertEquals(A.getSpecies(),"Rangifer tarandus");
	}

	@Test
	public void testGetFamili() {
		assertEquals(A.getFamili(),"Cervidae");
	}

	@Test
	public void testGetIsiExperience() {
		assertEquals(A.getIsiExperience(),"It's a Reindeer");
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
