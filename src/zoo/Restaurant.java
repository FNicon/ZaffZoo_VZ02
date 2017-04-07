package zoo;

/**.
 * Kelas Restaurant ini menyimpan info terkait restoran pada zoo
 * <br>Kelas ini tergabung dalam package zoo
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : Restaurant.java
 */
public class Restaurant {
  private char cc;
  /**.
   * Konstruktor tanpa parameter
   * mengisi cc dengan 'R'
   */
  public Restaurant() {
    cc = 'R';
  }

  /**.
   * Getter karakter render
   * @return karakter yang akan dirender ke layar
   */
  public char getRender() {
    return cc;
  }
}
