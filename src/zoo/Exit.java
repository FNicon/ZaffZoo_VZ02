package zoo;




/**.
 * Kelas Exit ini menyimpan data terkait pintu keluar dari suatu zoo
 * <br>Kelas ini tergabung dalam package zoo
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : Exit.java
 */
public class Exit {
  private Point p;
  private char cc;

  /**.
   * Konstruktor tanpa parameter
   * mengisi cc dengan '-' dan p dengan (0,0)
   */
  public Exit() {
    p = new Point();
    cc = '-';
  }

  /**.
   * Konstruktor dengan parameter
   * <br> mengisi point dengan (x,y)
   * @param x sumbu x lokasi point p
   * @param y sumbu y lokasi point p
   */
  public Exit(int x, int y) {
    cc = '-';
    p = new Point (x,y,cc);
  }

  /**.
   * Getter lokasi exit
   * @return lokasi exit
   */
  public Point GetPoint() {
    return p;
  }

  /**.
   * Getter karakter render
   * @return karakter yang akan dirender ke layar
   */
  public char getRender() {
    return cc;
  }
}
