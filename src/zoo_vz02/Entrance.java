package zoo_vz02;

/**
 * Kelas Entrance ini meyimpan informasi tentang pintu masuk dari sebuah zoo
 * <br>Kelas ini tergabung dalam package zoo_vz02
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : Entrance.java
 */
public class Entrance {
  private Point p;
  private char cc;

  /**
   * Konstruktor tanpa parameter
   * mengisi cc dengan '-' dan p dengan 0,0
   */
  public Entrance() {
    p = new Point();
    cc = '-';
  }

  /**
   * Konstruktor dengan parameter
   * <br> mengisi point dengan (x,y)
   * @param x sumbu x lokasi point p
   * @param y sumbu y lokasi point p
   */
  public Entrance(int x, int y){
    cc = '-';
    p = new Point(x,y,cc);
  }

  /**
   * Getter dari lokasi entrance
   * @return lokasi entrance
   */
  public Point GetPoint(){
    return p;
  }

  /**
   * Getter karakter render
   * @return karakter yang akan dirender ke layar
   */
  public char GetRender() {
    return cc;
  }
}
