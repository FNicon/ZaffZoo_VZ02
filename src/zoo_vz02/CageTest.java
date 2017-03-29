package zoo_vz02;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Kelas CageTest ini ....
 * <br>Kelas ini tergabung dalam package zoo_vz02
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : CageTest.java
 */
class CageTest {




  @Test
  void setTipeKandang() {
    Cage c = new Cage();
    c.SetTipeKandang(0);
    assertTrue(c.GetTipeKandang() == 0);
  }


  @Test
  void getHabitat() {
    Cage c = new Cage();
    c.SetTipeKandang(0);
    c.SetHabitat(1,2,'L',0);
    Point p = new Point(1,2,'L');
    assertTrue(p.GetX() == c.GetHabitat(0).GetX());
  }

}