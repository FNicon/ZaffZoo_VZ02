package zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**.
 * Kelas WaterHabitatTest ini mengetes fungsionalitas dari kelas WaterHabitat
 * <br>Kelas ini tergabung dalam package zoo
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : WaterHabitatTest.java
 */
class WaterHabitatTest {
  @Test
  void getRender() {
    WaterHabitat w = new WaterHabitat();
    assertTrue(w.getRender()  ==  '$');
  }

}