package zoo_vz02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Kelas ParkTest ini mengetes fungsionalitas dari kelas Park
 * <br>Kelas ini tergabung dalam package zoo_vz02
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : ParkTest.java
 */
class ParkTest {
  @Test
  void getRender() {
    Park p = new Park();
    assertTrue(p.GetRender() == 'P');
  }

}