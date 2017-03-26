package zoo_vz02;

/**
 * Kelas Cell ini menyimpan informasi x, y, dan isi karakter dari titik tersebut
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : Cell.java
 */
public class Point {
  private int X;
  private int Y;
  private char CC;
  /**
   * Konstruktor tanpa parameter
   *
   */
  public Point(){
    X = 0;
    Y = 0;
    CC = ' ';
  }
  /** Konstruktor dengan parameter
   * @param _X nilai absis yang akan diinputkan
   * @param _Y nilai ordinat yang akan diinputkan
   * @param _CC karakter yang akan diisikan
   */
  public Point(int _X, int _Y, char _CC){
    X = _X;
    Y = _Y;
    CC = _CC;
  }
  /** Getter X
   * @return besarnya nilai X
   */
  public int GetX(){
    return X;
  }
  /** Getter Y
   *  @return besarnya nilai Y
   */
  public int GetY(){
    return Y;
  }
  /** Setter X
   * @param _X nilai x yang baru
   */
  public void SetX(int _X){
    X = _X;
  }
  /** Setter Y
   * @param _Y nilai y yang baru
   */
  public void SetY(int _Y){
    Y = _Y;
  }
}
