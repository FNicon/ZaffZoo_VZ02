package zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**.
 * Kelas RestaurantTest ini ....
 * <br>Kelas ini tergabung dalam package zoo
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : RestaurantTest.java
 */
class RestaurantTest {
  @Test
  void getRender() {
    Restaurant r = new Restaurant();
    assertTrue(r.getRender()  ==  'R');
  }

}