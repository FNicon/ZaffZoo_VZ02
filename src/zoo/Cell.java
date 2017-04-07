package zoo;

import java.util.Scanner;

/**.
 * Kelas Cell ini menyimpan informasi tentang sebuah Zoo 
 * dan juga kumpulan kandang dan juga jalannya.
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : Cell.java.
 */
public class Cell {
  /**.
   * Matriks of point dari zoo tersebut.
   */
  private Point[][] p;
  /**.
   * Ukuran sumbu x cell.
   */
  private int sizeX;
  /**.
   * Ukuran sumbu y cell.
   */
  private int sizeY;
  /**.
   * Pintu masuk dari cell.
   */
  private Entrance masuk;
  /**.
   * Pintu keluar dari cell.
   */
  private Exit keluar;
  /**.
   * Array of cage yang berisi info kandang.
   */
  private Cage kandang[ ];
  /**.
   * jumlah kandang saat ini pada cell tersebut.
   */
  private int jumlahKandang;
  /**.
   * sebuah integer final yang berisi jumlah maksimal kandang.
   */
  private final int maxKandang;
  /**.
   * Array of road yang berisi kumpulan jalan dari cell tersebut.
   */
  private Road[] rd;
  /**.
   * jumlah jalan saat ini pada cell tersebut.
   */
  private int jumlahRoad;
  /**.
   * sebuah integer final yang berisi jumlah maksimal jalan.
   */
  private final int maxRoad;


  /**.
   * Konstruktor Cell tanpa parameter.
   * <br> ukuran cell default adalah 50x50.
   * <br> banyaknya kandang default adalah 30.
   * <br> isi default karakter nya adalah blank.
   */
  public Cell() {
    sizeX = 50;
    sizeY = 50;
    maxKandang = 30;
    maxRoad = 30;
    kandang = new Cage[maxKandang];
    jumlahKandang = 0;
    jumlahRoad = 0;
    rd = new Road[maxRoad];
    p = new Point[sizeX][sizeY];
    int i, j;
    for (i = 0; i < sizeX; i++) {
      for (j = 0; j < sizeY; j++) {
        p[i][j] = new Point(i, j, ' ');
      }
    }
  }


  /**.
   * Konstruktor Cell dengan parameter.
   * <br> isi default karakter nya adalah blank.
   * @param _X ukuran absis cell.
   * @param _Y ukuran ordinat cell.
   * @param mkandang jumlah maksimal kandang dalam cell.
   * @param mroad jumlah maksimal jalan dalam cell.
   * @param ent pintu masuk.
   * @param ext pintu keluar.
   */
  public Cell(int _X, int _Y, int mkandang, int mroad, Entrance ent, Exit ext) {
    sizeX = _X;
    sizeY = _Y;
    maxKandang = mkandang;
    maxRoad = mroad;
    jumlahKandang = 0;
    jumlahRoad = 0;
    masuk = ent;
    keluar = ext;
    rd = new Road[maxRoad];
    kandang = new Cage[maxKandang];
    p = new Point[sizeX][sizeY];
    int i, j;
    for (i = 0; i < sizeX; i++) {
      for (j = 0; j < sizeY; j++) {
        p[i][j] = new Point(i, j, ' ');
      }
    }
    // entrance dan exit sbg jalan

    Road msk = new Road(ent.GetPoint().GetX(), ent.GetPoint().GetY());
    rd[jumlahRoad] = msk;
    jumlahRoad++;
    Road klr = new Road(ext.GetPoint().GetX(), ext.GetPoint().GetY());
    rd[jumlahRoad] = klr;
    jumlahRoad++;
  }

  /**.
   * Mengeset sebuah point dengan animal tertentu.
   * @param i absis objek tersebut.
   * @param j ordinat objek tersebut.
   * @param cc karakter render objek tersebut.
   */
  public void setPoint(int i, int j, char cc) {
    p[i][j].SetChar(cc);
  }

  /**.
   * Mengeset sebuah kandang ke dalam cell dan menambah jumlah kandangnya.
   * @param cg kandang yang akan dimasukkan.
   */
  public void setCage(Cage cg) {
    kandang[jumlahKandang] = cg;
    jumlahKandang++;
  }

  /**.
   * Mengeset sebuah jalan ke dalam cell dan menambah jumlah jalannya.
   * @param jalan Jalan yang akan dimasukkan ke dalam cell.
   */
  public void setRoad(Road jalan) {
    rd[jumlahRoad] = jalan;
    jumlahRoad++;
  }

  /**.
   * Mengisi matriks p sesuai dengan state terbaru dari cell.
   */
  public void displayMap() {
    // masukkan semua kandang ke dalam cell gambar
    int i, j;
    for (i = 0; i < jumlahKandang; i++) {
      for (j = 0; j < kandang[i].GetJumlahHabitat(); j++) {
        p[kandang[i].GetHabitat(j).GetX()][kandang[i].GetHabitat(j).GetY()].SetChar(kandang[i].GetHabitat(j).GetChar());
      }
    }
    for (i = 0; i < jumlahKandang; i++) {
      for (j = 0; j < kandang[i].GetJumlahHewan(); j++) {
        p[kandang[i].GetAniLoc(j).GetX()][kandang[i].GetAniLoc(j).GetY()].SetChar(kandang[i].GetAniLoc(j).GetChar());
      }
    }
    // masukkan semua road
    for (i = 0; i < jumlahRoad; i++) {
      p[rd[i].GetPoint().GetX()][rd[i].GetPoint().GetY()].SetChar(rd[i].getRender());
    }
    // masukkan entrance dan exit
    p[masuk.GetPoint().GetX()][masuk.GetPoint().GetY()].SetChar(masuk.getRender());
    p[keluar.GetPoint().GetX()][keluar.GetPoint().GetY()].SetChar(keluar.getRender());
    // asumsi semua sudah masuk
    // print
  }

  /**.
   * Mencetak isi matriks p ke layar.
   */
  public void printMatriks() {
    int i, j;
    for (i = 0; i < sizeX; i++) {
      for (j = 0; j < sizeY; j++) {
        System.out.print(p[i][j].GetChar());
      }
      System.out.print('\n');
    }
  }

  /**.
   * Menampilkan isi dari matriks tersebut untuk menu display map.
   */
  public void printMap() {
    displayMap();
    printMatriks();
  }

  /**.
   * Menghitung jumlah makanan yang dibutuhkan oleh suatu cell.
   * @return array of integer yang berisi kebutuhan makanan.
   */
  public int[] getFoodReq() {
    int i, j;
    int retval[ ] = new int[4];
    for (i = 0; i < 4; i++) {
      retval[i] = 0;
    }
    for (i = 0; i < jumlahKandang; i++) {
      for (j = 1; j < 4; j++) {
        retval[j] = retval[j] + kandang[i].GetTotalMakan()[j];
      }
    }
    return retval;
  }

  /**.
   * Mencetak data kebutuhan makanan ke layar beserta keterangannya.
   */
  public void printFoodReq() {
    System.out.print("Kebutuhan makanan herbivora sebesar : ");
    System.out.println(getFoodReq()[1]);
    System.out.print("Kebutuhan makanan karnivora sebesar : ");
    System.out.println(getFoodReq()[2]);
    System.out.print("Kebutuhan makanan omnivora sebesar : ");
    System.out.println(getFoodReq()[3]);
  }

  /**.
   * Melakukan tour di dalam cell tersebut.
   */
  public void tour() {
    boolean exit = false;
    int i;
    Point curPos = masuk.GetPoint();
    curPos.SetChar('#');
    Scanner s;
    char cc;
    while(!exit) {
      displayMap();
      // entri posisi sekarang
      setPoint(curPos.GetX(), curPos.GetY(), curPos.GetChar());
      printMatriks();
      setPoint(curPos.GetX(), curPos.GetY(), '-');
      // cari cage dengan titik tertentu
      System.out.println(findCage(curPos));
      // print nearby exit
      if ((curPos.GetX() - 1  ==  keluar.GetPoint().GetX()) &&
          (curPos.GetY()  ==  keluar.GetPoint().GetY())) {
        System.out.println("Di atas anda adalah pintu keluar");
      } else if ((curPos.GetX() + 1  ==  keluar.GetPoint().GetX()) && (curPos.GetY()  ==  keluar.GetPoint().GetY())) {
        System.out.println("Di bawah anda adalah pintu keluar");
      } else if ((curPos.GetX()  ==  keluar.GetPoint().GetX()) && (curPos.GetY() - 1  ==  keluar.GetPoint().GetY())) {
        System.out.println("Di kiri anda adalah pintu keluar");
      } else if ((curPos.GetX()  ==  keluar.GetPoint().GetX()) && (curPos.GetY() + 1  ==  keluar.GetPoint().GetY())) {
        System.out.println("Di kanan anda adalah pintu keluar");
      }
      // baca sintaks selanjutnya
      System.out.println("Masukkan karakter selanjutnya (w/a/s/d)");
      s = new Scanner(System.in);
      cc = s.next().charAt(0);
      if (cc  ==  'w') {
        if (checkAvail(curPos.GetX() - 1, curPos.GetY())) {
          curPos.SetX(curPos.GetX() - 1);
        }
      } else if (cc  ==  's') {
        if (checkAvail(curPos.GetX() + 1, curPos.GetY())) {
          curPos.SetX(curPos.GetX() + 1);
        }
      } else if (cc  ==  'a') {
        if (checkAvail(curPos.GetX(), curPos.GetY() - 1)) {
          curPos.SetY(curPos.GetY() - 1);
        }
      } else if (cc  ==  'd') {
        if (checkAvail(curPos.GetX(), curPos.GetY() + 1)) {
          curPos.SetY(curPos.GetY() + 1);
        }
      }
      // check exit
      if ((curPos.GetX()  ==  keluar.GetPoint().GetX()) && (curPos.GetY()  ==  keluar.GetPoint().GetY())) {
        exit = true;
      }
      for (i = 0;i < jumlahKandang; i++) {
        kandang[i].SemuaGerak();
      }
    }
  }

  /**.
   * Mengecek apakah koordinat x dan y merupakan jalan.
   * @param x sumbu x jalan selanjutnya.
   * @param y sumbu y jalan selanjutnya.
   * @return true jika koordinat x dan y merupakan jalan.
   */
  public boolean checkAvail(int x, int y) {
    boolean found = false;
    int i = 0;
    while ((!found) && (i < jumlahRoad)) {
      if ((rd[i].GetPoint().GetX()  ==  x) && (rd[i].GetPoint().GetY()  ==  y)) {
        found = true;
      } else {
        i++;
      }
    }
    return found;
  }

  /**.
   * Mencetak semua kandang yang bersinggungan dengan titik p.
   * @param p Point yang akan dicari kandang yang bersinggungannya.
   * @return StringBuffer berisi semua experience kandang yg bersinggungan.
   */
  public StringBuffer findCage(Point p) {
    // iterasi semua peluang?01
    StringBuffer str = new StringBuffer();
    boolean found;
    int i;
    // cek atas
    if (p.GetY() - 1 > 0) {
      found = false;
      i = 0;
      while ((!found) && (i < jumlahKandang)) {
        if (kandang[i].IsXYHabitat(p.GetX(), p.GetY() - 1)) {
          found = true;
          str.append(kandang[i].GetExperience());
        } else {
          i++;
        }
      }
    }
    if (p.GetY() + 1 < sizeY) {
      found = false;
      i = 0;
      while ((!found) && (i < jumlahKandang)) {
        if (kandang[i].IsXYHabitat(p.GetX(), p.GetY() + 1)) {
          found = true;
          str.append(kandang[i].GetExperience());
        } else {
          i++;
        }
      }
    }
    if (p.GetX() - 1 > 0) {
      found = false;
      i = 0;
      while ((!found) && (i < jumlahKandang)) {
        if (kandang[i].IsXYHabitat(p.GetX() - 1, p.GetY())) {
          found = true;
          str.append(kandang[i].GetExperience());
        } else {
          i++;
        }
      }
    }
    if (p.GetX() + 1 < sizeX) {
      found = false;
      i = 0;
      while ((!found) && (i < jumlahKandang)) {
        if (kandang[i].IsXYHabitat(p.GetX() + 1, p.GetY())) {
          found = true;
          str.append(kandang[i].GetExperience());
        } else {
          i++;
        }
      }
    }
    return str;
  }
}
