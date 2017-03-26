package zoo_vz02;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Kelas PointTest ini ....
 * <br>Kelas ini tergabung dalam package zoo_vz02
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : PointTest.java
 */
class PointTest {
  @Test
  void getX() {
    Point p = new Point(5,6,'l');
    assertTrue(p.GetX() == 5);
  }

  @org.junit.jupiter.api.Test
  void getY() {
    Point p = new Point(5,6,'l');
    assertTrue(p.GetY() == 6);
  }

  @org.junit.jupiter.api.Test
  void getChar() {
    Point p = new Point(5,6,'l');
    assertTrue(p.GetChar() == 'l');
  }

  @org.junit.jupiter.api.Test
  void setChar() {
    Point p = new Point(5,6,'l');
    p.SetChar('m');
    assertTrue(p.GetChar() == 'm');
  }

  @org.junit.jupiter.api.Test
  void setX() {
    Point p = new Point(5,6,'l');
    p.SetX(7);
    assertTrue(p.GetX() == 7);
  }

  @org.junit.jupiter.api.Test
  void setY() {
    Point p = new Point(5,6,'l');
    p.SetY(7);
    assertTrue(p.GetY() == 7);
  }

}