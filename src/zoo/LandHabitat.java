package zoo;

/**.
 * Kelas LandHabitat ini menyimpan data tentang habitat darat dari suatu zoo
 * <br>Kelas ini tergabung dalam package zoo
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : LandHabitat.java
 */
public class LandHabitat {
  private char cc;

  /**.
   * Konstruktor tanpa parameter
   * <br> mengisi cc dengan *
   */
  public LandHabitat() {
    cc = '*';
  }

  /**.
   * Getter karakter render
   * @return karakter yang akan dirender ke layar
   */
  public char getRender() {
    return cc;
  }
}
