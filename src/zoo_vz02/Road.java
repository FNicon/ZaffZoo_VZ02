package zoo_vz02;

/**
 * Kelas Road ini merupakan tempat jalan dari user tersebut
 * <br>Kelas ini tergabung dalam package zoo_vz02
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : Road.java
 */
public class Road {
  private Point p;
  private char cc;

  /**
   * Konstruktor tanpa parameter
   * mengisi cc dengan '-' dan membuat point kosong
   */
  public Road(){
    p = new Point();
    cc = '-';
  }

  /**
   * Konstruktor dengan parameter
   * <br> mengisi point dengan (x,y)
   * @param x sumbu x lokasi point p
   * @param y sumbu y lokasi point p
   */
  public Road(int x, int y){
    cc = '-';
    p = new Point(x,y,cc);
  }

  /**
   * Getter posisi jalan
   * @return posisi jalan
   */
  public Point GetPoint(){
    return p;
  }

  /**
   * Getter karakter render
   * @return karakter yang akan dirender ke layar
   */
  public char GetRender(){
    return cc;
  }
}
