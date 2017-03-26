package zoo_vz02;

/**
 * Kelas Cell ini menyimpan informasi x, y, dan isi karakter dari titik tersebut
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : Cell.java
 */
public class Point {
  private int x;
  private int y;
  private char cc;
  /**
   * Konstruktor tanpa parameter
   */
  public Point(){
    x = 0;
    y = 0;
    cc = ' ';
  }
  /** Konstruktor dengan parameter
   * @param _x nilai absis yang akan diinputkan
   * @param _y nilai ordinat yang akan diinputkan
   * @param _cc karakter yang akan diisikan
   */
  public Point(int _x, int _y, char _cc){
    x = _x;
    y = _y;
    cc = _cc;
  }
  /** Getter x
   * @return besarnya nilai x
   */
  public int GetX(){
    return x;
  }
  /** Getter y
   *  @return besarnya nilai y
   */
  public int GetY(){
    return y;
  }
  /**
   * Getter karakter
   * @return karakter pada point tersebut
   */
  public char GetChar(){
    return cc;
  }
  /**
   * Setter karakter
   * @param c karakter yang akan dimasukkan
   */
  public void SetChar(char c){
    cc = c;
  }
  /** Setter x
   * @param _x nilai x yang baru
   */
  public void SetX(int _x){
    x = _x;
  }
  /** Setter y
   * @param _y nilai y yang baru
   */
  public void SetY(int _y){
    y = _y;
  }
}
