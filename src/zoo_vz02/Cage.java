package zoo_vz02;

/**
 * Kelas Cage ini menyimpan point mana saja yang terdapat dalam cage beserta hewannya
 * <br>Kelas ini tergabung dalam package zoo_vz02
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : Cage.java
 */
public class Cage {
  private Point ani_loc[];
  private String ani_exp[];
  private int jumlah_hewan;
  private int tipe_kandang;
  private final int max_hewan = 50;

  /**
   * Konstruktor tanpa parameter
   * <br>Nilai dari jumlah_hewan diset ke 0, menandakan array kosong pertama berada di 0
   * <br>Inisialisasi array ani_loc dan ani_exp
   */
  public Cage(){
    jumlah_hewan = 0;
    ani_loc = new Point[max_hewan];
    ani_exp = new String[max_hewan];
  }

  /**
   * Getter Point dari indeks tertentu
   * @param i Indeks hewan yang akan dilihat
   * @return Point dari hewan dengan indeks ke i
   */
  public Point GetAniLoc(int i){
    return ani_loc[i];
  }

  /**
   * Setter hewan ke dalam cage
   * @param i lokasi x hewan tersebut
   * @param j lokasi y hewan tersebut
   * @param render karakter dari hewan tersebut
   * @param exp experience yang dihasilkan
   */
  public void SetHewan(int i, int j, char render, String exp){
    ani_loc[jumlah_hewan] = new Point(i,j,render);
    ani_exp[jumlah_hewan] = exp;
    jumlah_hewan++;
  }

}
