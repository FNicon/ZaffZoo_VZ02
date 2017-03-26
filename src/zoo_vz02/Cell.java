package zoo_vz02;

/**
 * Kelas Cell ini menyimpan informasi tentang matriks dari point
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : Cell.java
 */
public class Cell {
  private Point P[][];
  private int Size_X;
  private int Size_Y;
  public Cell(){
    Size_X = 50;
    Size_Y = 50;
    P = new Point[Size_X][Size_Y];
    int i, j;
    for (i=0; i<Size_X; i++){
      for(j=0; j<Size_Y; j++){
        P[i][j] = new Point(i,j,' ');
      }
    }
  }
  public Cell(int _X, int _Y){
    Size_X = _X;
    Size_Y = _Y;
    P = new Point[Size_X][Size_Y];
    int i, j;
    for (i=0; i<Size_X; i++){
      for(j=0; j<Size_Y; j++){
        P[i][j] = new Point(i,j,' ');
      }
    }
  }
  public void SetPoint(int i, int j, char cc){
    P[i][j].SetChar(cc);
  }
}
