package zoo_vz02;

/**
 * Kelas Road ini merupakan tempat jalan dari user tersebut
 * <br>Kelas ini tergabung dalam package zoo_vz02
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : Road.java
 */
public class Road {
  private char cc;

  /**
   * Konstruktor tanpa parameter
   * mengisi cc dengan '-'
   */
  public Road(){
    cc = '-';
  }

  /**
   * Getter karakter render
   * @return karakter yang akan dirender ke layar
   */
  public char GetRender(){
    return cc;
  }
}
