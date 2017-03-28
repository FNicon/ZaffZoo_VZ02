package zoo_vz02;




/**
 * Kelas Exit ini ....
 * <br>Kelas ini tergabung dalam package zoo_vz02
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : Exit.java
 */
public class Exit {
  private Point p;
  private char cc;

  /**
   * Konstruktor tanpa parameter
   * mengisi cc dengan '-'
   */
  public Exit(){
    p = new Point();
    cc = '-';
  }

  public Exit(int x, int y){
    cc = '-';
    p = new Point (x,y,cc);
  }
  public Point GetPoint(){
    return p;
  }

  /**
   * Getter karakter render
   * @return karakter yang akan dirender ke layar
   */
  public char GetRender(){
    return cc;
  }
}
