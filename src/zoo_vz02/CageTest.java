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
  void getAniLoc() {
    Cage c = new Cage();
    Point p1 = new Point(1,2,'l');
    int type[] = new int[3];
    type[0] = 1;
    type[1] = 0;
    type[2] = 0;
    c.SetTipeKandang(0);
    String exp = "macan \n uauau";
    c.SetHewan(1,2,type,'m',exp,'l');
    assertTrue(p1.GetX() == c.GetAniLoc(0).GetX());
    assertTrue(p1.GetY() == c.GetAniLoc(0).GetY());
  }

  @Test
  void getAniExp() {
    Cage c = new Cage();
    Point p1 = new Point(1,2,'l');
    int type[] = new int[3];
    type[0] = 1;
    type[1] = 0;
    type[2] = 0;
    c.SetTipeKandang(0);
    String exp = "macan \n uauau";
    c.SetHewan(1,2,type,'m',exp,'l');
    String cmpr = "macan \n uauau";
    assertTrue(Objects.equals(cmpr,c.GetAniExp(0)));
  }

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