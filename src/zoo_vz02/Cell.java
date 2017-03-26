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
  private Cage kandang[];
  private int jumlah_kandang;

  /**
   * Konstruktor Cell tanpa parameter
   * <br> ukuran cell default adalah 50x50
   * <br> banyaknya kandang default adalah 30
   * <br> isi default karakter nya adalah blank
   */
  public Cell(){
    Size_X = 50;
    Size_Y = 50;
    jumlah_kandang = 30;
    kandang = new Cage[30];
    P = new Point[Size_X][Size_Y];
    int i, j;
    for (i=0; i<Size_X; i++){
      for(j=0; j<Size_Y; j++){
        P[i][j] = new Point(i,j,' ');
      }
    }
  }

  /**
   * Konstruktor Cell dengan parameter
   * <br> isi default karakter nya adalah blank
   * @param _X ukuran absis cell
   * @param _Y ukuran ordinat cell
   * @param jkandang jumlah kandang dalam cell
   */
  public Cell(int _X, int _Y, int jkandang){
    Size_X = _X;
    Size_Y = _Y;
    jumlah_kandang = jkandang;
    kandang = new Cage[jumlah_kandang];
    P = new Point[Size_X][Size_Y];
    int i, j;
    for (i=0; i<Size_X; i++){
      for(j=0; j<Size_Y; j++){
        P[i][j] = new Point(i,j,' ');
      }
    }
  }

  /**
   * Mengeset sebuah point dengan animal tertentu
   * @param i absis objek tersebut
   * @param j ordinat objek tersebut
   * @param cc karakter render objek tersebut
   */
  public void SetPoint(int i, int j, char cc){
    P[i][j].SetChar(cc);
  }
}
