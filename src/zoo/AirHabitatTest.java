package zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**.
 * Kelas AirHabitatTest ini mengetes fungsionalitas dari kelas AirHabitat
 * <br>Kelas ini tergabung dalam package zoo
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : AirHabitatTest.java
 */
class AirHabitatTest {
  @Test
  void getRender() {
    AirHabitat a = new AirHabitat();
    assertTrue(a.getRender()  ==  '%');
  }

}