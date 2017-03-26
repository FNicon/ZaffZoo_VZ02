package zoo_vz02;

/**
 * Kelas Point ini menyimpan info x dan y dari suatu titik.
 * @author 13515017 / Putu Arya Pradipta
 * @since 2017-03-06
 */
public class Point {
  private int X;
  private int Y;
  /**
   * Konstruktor tanpa parameter
   *
   */
  public Point(){
    X = 0;
    Y = 0;
  }
  /** Konstruktor dengan parameter
   * @param _X nilai absis yang akan diinputkan
   * @param _Y nilai ordinat yang akan diinputkan
   */
  public Point(int _X, int _Y){
    X = _X;
    Y = _Y;
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
