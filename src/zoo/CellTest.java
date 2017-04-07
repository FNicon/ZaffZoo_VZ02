package zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**.
 * Kelas CellTest ini ....
 * <br>Kelas ini tergabung dalam package zoo
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/28/2017.
 * <br>File Name : CellTest.java
 */
class CellTest {
  @Test
  void checkAvail() {
    Cell c = new Cell();
    Road rd = new Road(1,1);
    c.setRoad(rd);
    assertTrue(c.checkAvail(1,1));
  }

}