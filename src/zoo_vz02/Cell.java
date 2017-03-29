package zoo_vz02;

import java.util.Scanner;

/**
 * Kelas Cell ini menyimpan informasi tentang sebuah Zoo dan juga kumpulan kandang dan juga jalannya
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : Cell.java
 */
public class Cell {
  /**
   * Matriks of point dari zoo tersebut
   */
  private Point P[][];
  /**
   * Ukuran sumbu x cell
   */
  private int Size_X;
  /**
   * Ukuran sumbu y cell
   */
  private int Size_Y;
  /**
   * Pintu masuk dari cell
   */
  private Entrance masuk;
  /**
   * Pintu keluar dari cell
   */
  private Exit keluar;
  /**
   * Array of cage yang berisi info kandang
   */
  private Cage kandang[];
  /**
   * jumlah kandang saat ini pada cell tersebut
   */
  private int jumlah_kandang;
  /**
   * sebuah integer final yang berisi jumlah maksimal kandang
   */
  private final int max_kandang;
  /**
   * Array of road yang berisi kumpulan jalan dari cell tersebut
   */
  private Road rd[];
  /**
   * jumlah jalan saat ini pada cell tersebut
   */
  private int jumlah_road;
  /**
   * sebuah integer final yang berisi jumlah maksimal jalan
   */
  private final int max_road;


  /**
   * Konstruktor Cell tanpa parameter
   * <br> ukuran cell default adalah 50x50
   * <br> banyaknya kandang default adalah 30
   * <br> isi default karakter nya adalah blank
   */
  public Cell(){
    Size_X = 50;
    Size_Y = 50;
    max_kandang = 30;
    max_road = 30;
    kandang = new Cage[max_kandang];
    jumlah_kandang = 0;
    jumlah_road = 0;
    rd = new Road[max_road];
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
   * @param mkandang jumlah maksimal kandang dalam cell
   * @param mroad jumlah maksimal jalan dalam cell
   * @param ent pintu masuk
   * @param ext pintu keluar
   */
  public Cell(int _X, int _Y, int mkandang, int mroad, Entrance ent, Exit ext){
    Size_X = _X;
    Size_Y = _Y;
    max_kandang = mkandang;
    max_road = mroad;
    jumlah_kandang = 0;
    jumlah_road = 0;
    masuk = ent;
    keluar = ext;
    rd = new Road[max_road];
    kandang = new Cage[max_kandang];
    P = new Point[Size_X][Size_Y];
    int i, j;
    for (i=0; i<Size_X; i++){
      for(j=0; j<Size_Y; j++){
        P[i][j] = new Point(i,j,' ');
      }
    }
    // entrance dan exit sbg jalan

    Road msk = new Road(ent.GetPoint().GetX(),ent.GetPoint().GetY());
    rd[jumlah_road] = msk;
    jumlah_road++;
    Road klr = new Road(ext.GetPoint().GetX(),ext.GetPoint().GetY());
    rd[jumlah_road] = klr;
    jumlah_road++;
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

  /**
   * Mengeset sebuah kandang ke dalam cell dan menambah jumlah kandangnya
   * @param cg kandang yang akan dimasukkan
   */
  public void SetCage(Cage cg){
    kandang[jumlah_kandang] = cg;
    jumlah_kandang++;
  }

  /**
   * Mengeset sebuah jalan ke dalam cell dan menambah jumlah jalannya
   * @param jalan Jalan yang akan dimasukkan ke dalam cell
   */
  public void SetRoad(Road jalan){
    rd[jumlah_road] = jalan;
    jumlah_road++;
  }

  /**
   * Mengisi matriks P sesuai dengan state terbaru dari cell
   */
  public void DisplayMap(){
    // masukkan semua kandang ke dalam cell gambar
    int i, j;
    for (i = 0; i < jumlah_kandang; i++){
      for (j = 0; j < kandang[i].GetJumlahHabitat(); j++){
        P[kandang[i].GetHabitat(j).GetX()][kandang[i].GetHabitat(j).GetY()].SetChar(kandang[i].GetHabitat(j).GetChar());
      }
    }
    for (i = 0; i < jumlah_kandang; i++){
      for (j = 0; j < kandang[i].GetJumlahHewan(); j++){
        P[kandang[i].GetAniLoc(j).GetX()][kandang[i].GetAniLoc(j).GetY()].SetChar(kandang[i].GetAniLoc(j).GetChar());
      }
    }
    // masukkan semua road
    for (i = 0; i < jumlah_road; i++){
      P[rd[i].GetPoint().GetX()][rd[i].GetPoint().GetY()].SetChar(rd[i].GetRender());
    }
    // masukkan entrance dan exit
    P[masuk.GetPoint().GetX()][masuk.GetPoint().GetY()].SetChar(masuk.GetRender());
    P[keluar.GetPoint().GetX()][keluar.GetPoint().GetY()].SetChar(keluar.GetRender());
    // asumsi semua sudah masuk
    // print
  }

  /**
   * Mencetak isi matriks p ke layar
   */
  public void PrintMatriks(){
    int i, j;
    for (i = 0; i < Size_X; i++){
      for (j = 0; j < Size_Y; j++){
        System.out.print(P[i][j].GetChar());
      }
      System.out.print('\n');
    }
  }

  /**
   * Menampilkan isi dari matriks tersebut untuk menu display map
   */
  public void PrintMap(){
    DisplayMap();
    PrintMatriks();
  }

  /**
   * Menghitung jumlah makanan yang dibutuhkan oleh suatu cell
   * @return array of integer yang berisi kebutuhan makanan
   */
  public int[] GetFoodReq(){
    int i, j;
    int retval[] = new int[4];
    for (i = 0; i < 4; i++){
      retval[i] = 0;
    }
    for (i = 0; i < jumlah_kandang; i++){
      for(j = 1; j < 4; j++){
        retval[j] = retval[j] + kandang[i].GetTotalMakan()[j];
      }
    }
    return retval;
  }

  /**
   * Mencetak data kebutuhan makanan ke layar beserta keterangannya
   */
  public void PrintFoodReq(){
    System.out.print("Kebutuhan makanan herbivora sebesar : ");
    System.out.println(GetFoodReq()[1]);
    System.out.print("Kebutuhan makanan karnivora sebesar : ");
    System.out.println(GetFoodReq()[2]);
    System.out.print("Kebutuhan makanan omnivora sebesar : ");
    System.out.println(GetFoodReq()[3]);
  }

  /**
   * Melakukan tour di dalam cell tersebut
   */
  public void Tour(){
    boolean exit = false;
    int i;
    Point cur_pos = masuk.GetPoint();
    cur_pos.SetChar('Q');
    Scanner s;
    char cc;
    while(!exit) {
      DisplayMap();
      // entri posisi sekarang
      SetPoint(cur_pos.GetX(), cur_pos.GetY(), cur_pos.GetChar());
      PrintMatriks();
      SetPoint(cur_pos.GetX(), cur_pos.GetY(), '-');
      // cari cage dengan titik tertentu
      System.out.println(FindCage(cur_pos));
      // print nearby exit
      if ((cur_pos.GetX()-1 == keluar.GetPoint().GetX()) && (cur_pos.GetY() == keluar.GetPoint().GetY())) {
        System.out.println("Di atas anda adalah pintu keluar");
      } else if ((cur_pos.GetX()+1 == keluar.GetPoint().GetX()) && (cur_pos.GetY() == keluar.GetPoint().GetY())) {
        System.out.println("Di bawah anda adalah pintu keluar");
      } else if ((cur_pos.GetX() == keluar.GetPoint().GetX()) && (cur_pos.GetY()-1 == keluar.GetPoint().GetY())) {
        System.out.println("Di kiri anda adalah pintu keluar");
      } else if ((cur_pos.GetX() == keluar.GetPoint().GetX()) && (cur_pos.GetY()+1 == keluar.GetPoint().GetY())) {
        System.out.println("Di kanan anda adalah pintu keluar");
      }
      // baca sintaks selanjutnya
      System.out.println("Masukkan karakter selanjutnya (W/A/S/D)");
      s = new Scanner(System.in);
      cc = s.next().charAt(0);
      if (cc == 'w') {
        if (CheckAvail(cur_pos.GetX()-1, cur_pos.GetY() )) {
          cur_pos.SetX(cur_pos.GetX() - 1);
        }
      } else if (cc == 's') {
        if (CheckAvail(cur_pos.GetX()+1, cur_pos.GetY())) {
          cur_pos.SetX(cur_pos.GetX() + 1);
        }
      } else if (cc == 'a') {
        if (CheckAvail(cur_pos.GetX(), cur_pos.GetY() - 1)) {
          cur_pos.SetY(cur_pos.GetY() - 1);
        }
      } else if (cc == 'd') {
        if (CheckAvail(cur_pos.GetX(), cur_pos.GetY() + 1)) {
          cur_pos.SetY(cur_pos.GetY() + 1);
        }
      }
      // check exit
      if ((cur_pos.GetX() == keluar.GetPoint().GetX()) && (cur_pos.GetY() == keluar.GetPoint().GetY())) {
        exit = true;
      }
      for(i=0;i<jumlah_kandang;i++){
        kandang[i].SemuaGerak();
      }
    }
  }

  /**
   * Mengecek apakah koordinat x dan y merupakan jalan
   * @param x sumbu x jalan selanjutnya
   * @param y sumbu y jalan selanjutnya
   * @return true jika koordinat x dan y merupakan jalan
   */
  public boolean CheckAvail(int x, int y){
    boolean found = false;
    int i = 0;
    while ((!found) && (i < jumlah_road)){
      if ((rd[i].GetPoint().GetX() == x) && (rd[i].GetPoint().GetY() == y)){
        found = true;
      } else {
        i++;
      }
    }
    return found;
  }

  /**
   * Mencetak semua kandang yang bersinggungan dengan titik p
   * @param p Point yang akan dicari kandang yang bersinggungannya
   * @return StringBuffer berisi semua experience kandang yg bersinggungan
   */
  public StringBuffer FindCage(Point p){
    // iterasi semua peluang?01
    StringBuffer str = new StringBuffer();
    boolean found;
    int i;
    // cek atas
    if (p.GetY() - 1 > 0) {
      found = false;
      i = 0;
      while ((!found) && (i < jumlah_kandang)) {
        if (kandang[i].IsXYHabitat(p.GetX(), p.GetY() - 1)) {
          found = true;
          str.append(kandang[i].GetExperience());
        } else {
          i++;
        }
      }
    }
    if (p.GetY() + 1 < Size_Y) {
      found = false;
      i = 0;
      while ((!found) && (i < jumlah_kandang)) {
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
      while ((!found) && (i < jumlah_kandang)) {
        if (kandang[i].IsXYHabitat(p.GetX()-1, p.GetY())) {
          found = true;
          str.append(kandang[i].GetExperience());
        } else {
          i++;
        }
      }
    }
    if (p.GetX() + 1 < Size_X) {
      found = false;
      i = 0;
      while ((!found) && (i < jumlah_kandang)) {
        if (kandang[i].IsXYHabitat(p.GetX()+1, p.GetY())) {
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
