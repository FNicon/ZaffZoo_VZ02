package zoo_vz02;

/**
 * Kelas Restaurant ini ....
 * <br>Kelas ini tergabung dalam package zoo_vz02
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : Restaurant.java
 */
public class Restaurant {
  private char cc;
  /**
   * Konstruktor tanpa parameter
   * mengisi cc dengan 'R'
   */
  public Restaurant(){
    cc = 'R';
  }

  /**
   * Getter karakter render
   * @return karakter yang akan dirender ke layar
   */
  public char GetRender(){
    return cc;
  }
}
