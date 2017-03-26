package zoo_vz02;

/**
 * Kelas AirHabitat ini menyimpan data tentang habitat udara dari suatu zoo
 * <br>Kelas ini tergabung dalam package zoo_vz02
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : AirHabitat.java
 */
public class AirHabitat {
  private char cc;

  /**
   * Konstruktor tanpa parameter
   * <br> mengisi cc dengan '%'
   */
  public AirHabitat(){
    cc = '%';
  }

  /**
   * Getter karakter render
   * @return karakter yang akan dirender ke layar
   */
  public char GetRender(){
    return cc;
  }
}
