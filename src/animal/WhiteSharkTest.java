package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class WhiteSharkTest {
	WhiteShark A = new WhiteShark();
	@Test
	public void testGetFoodNum() {
		assertEquals(A.getFoodNum(),1800);
	}

	@Test
	public void testgetRender() {
		assertEquals(A.getRender(),'o');
	}

	@Test
	public void testGetEnemy() {
		assertEquals(A.getEnemy(),'q');
	}

	@Test
	public void testGetBerat() {
		assertEquals(A.getBerat(),9000);
	}

	@Test
	public void testGetJenisMakanan() {
		assertEquals(A.getJenisMakanan(),2);
	}

	@Test
	public void testGetSpecies() {
		assertEquals(A.getSpecies(),"Carcharodon carcharias");
	}

	@Test
	public void testGetfamili() {
		assertEquals(A.getFamili(),"Selachimorpha");
	}

	@Test
	public void testGetIsiExperience() {
		assertEquals(A.getIsiExperience(),"It's a Big Shark");
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
