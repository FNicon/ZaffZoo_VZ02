package zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**.
 * Kelas ExitTest ini ....
 * <br>Kelas ini tergabung dalam package zoo
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : ExitTest.java
 */
class ExitTest {
  @Test
  void getRender() {
    Exit e = new Exit();
    assertTrue(e.getRender()  ==  '-');
  }

}