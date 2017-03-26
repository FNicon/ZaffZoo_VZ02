package zoo_vz02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Kelas WaterHabitatTest ini mengetes fungsionalitas dari kelas WaterHabitat
 * <br>Kelas ini tergabung dalam package zoo_vz02
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : WaterHabitatTest.java
 */
class WaterHabitatTest {
  @Test
  void getRender() {
    WaterHabitat w = new WaterHabitat();
    assertTrue(w.GetRender() == '$');
  }

}