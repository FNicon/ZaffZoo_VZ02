package animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class PandaTest {
	Panda A = new Panda();
	@Test
	public void testGetFoodNum() {
		assertEquals(A.getFoodNum(),450);
	}

	@Test
	public void testGetRender() {
		assertEquals(A.getRender(),'I');
	}

	@Test
	public void testGetEnemy() {
		assertEquals(A.getEnemy(),' ');
	}

	@Test
	public void testGetBerat() {
		assertEquals(A.getBerat(),900);
	}

	@Test
	public void testGetJenisMakanan() {
		assertEquals(A.getJenisMakanan(),1);
	}

	@Test
	public void testGetSpecies() {
		assertEquals(A.getSpecies(),"Ailuropoda melanoleuca");
	}

	@Test
	public void testGetFamili() {
		assertEquals(A.getFamili(),"Ursoidea");
	}

	@Test
	public void testGetIsiExperience() {
		assertEquals(A.getIsiExperience(),"The panda is eating bamboos");
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
