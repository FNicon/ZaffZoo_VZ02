package animal;

public class AfricanElephantTest {
	AfricanElephant A = new AfricanElephant();
	@Test
	public void testGetFoodNum() {
		assertEquals(A.getFoodNum(),30000);
	}

	@Test
	public void testGetRender() {
		assertEquals(A.getRender(),'z');
	}

	@Test
	public void testGetEnemy() {
		assertEquals(A.getEnemy(),' ');
	}

	@Test
	public void testGetBerat() {
		assertEquals(A.getBerat(),60000);
	}

	@Test
	public void testGetJenisMakanan() {
		assertEquals(A.getJenisMakanan(),1);
	}

	@Test
	public void testGetSpecies() {
		assertEquals(A.getSpecies(),"Loxodonta");
	}

	@Test
	public void testGetFamili() {
		assertEquals(A.getFamili(),"Elephantidae");
	}

	@Test
	public void testGetIsiExperience() {
		assertEquals(A.getIsiExperience(),"This elephant originated from africa");
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
