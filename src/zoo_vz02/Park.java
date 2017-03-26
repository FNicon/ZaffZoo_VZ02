package zoo_vz02;

/**
 * Kelas Park ini menyimpan info tentang taman pada zoo
 * <br>Kelas ini tergabung dalam package zoo_vz02
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : Park.java
 */
public class Park {
  private char cc;
  /**
   * Konstruktor tanpa parameter
   * mengisi cc dengan 'P'
   */
  public Park(){
    cc = 'P';
  }
  /**
   * Getter karakter render
   * @return karakter yang akan dirender ke layar
   */
  public char GetRender(){
    return cc;
  }
}
