package zoo_vz02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Kelas LandHabitatTest ini mengetes fungsionalitas dari LandHabitat
 * <br>Kelas ini tergabung dalam package zoo_vz02
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : LandHabitatTest.java
 */
class LandHabitatTest {
  @Test
  void getRender() {
    LandHabitat L = new LandHabitat();
    assertTrue('*' == L.GetRender());
  }

}