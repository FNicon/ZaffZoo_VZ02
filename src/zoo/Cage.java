
package zoo;

import java.util.Random;

/**.
 * Kelas Cage ini menyimpan point mana saja yang terdapat dalam
 * cage beserta hewannya
 * <br>Kelas ini tergabung dalam package zoo
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/26/2017.
 * <br>File Name : Cage.java
 */
public class Cage {
  private Point aniLoc[];
  private StringBuffer ani_exp[];
  private char[] list_musuh;
  private int jumlah_hewan;
  private Point listHabitat[ ];
  private int jumlahHabitat;
  private int tipeKandang;
  private int totalMakanan[ ];
  private final int maxHewan = 20;
  private final int maxHabitat = 50;

  /**.
   * Konstruktor tanpa parameter
   * <br>Nilai dari jumlah_hewan diset ke 0, menandakan array kosong pertama berada di 0
   * <br>Inisialisasi array aniLoc dan ani_exp
   * <br>selain itu, mengeset total makanan[] menjadi 0
   */
  public Cage() {
    jumlah_hewan = 0;
    aniLoc = new Point[maxHewan];
    ani_exp = new StringBuffer[maxHewan];
    list_musuh = new char[maxHewan];
    listHabitat = new Point[maxHabitat];
    totalMakanan = new int[4];
    int i;
    for (i = 0; i < 4; i++) {
      totalMakanan[i] = 0;
    }
    jumlahHabitat = 0;
    tipeKandang = -1;
  }

  /**.
   * Getter Point dari indeks tertentu
   * @param i Indeks hewan yang akan dilihat
   * @return Point dari hewan dengan indeks ke i
   */
  public Point GetAniLoc(int i) {
    return aniLoc[i];
  }

  /**.
   * Getter Animal Experience dari hewan yang berada di kandang tersebut
   * @param i indeks hewan tersebut dalam kandang
   * @return Experience hewan berindeks i terebut
   */
  public StringBuffer GetAniExp(int i) {
    return ani_exp[i];
  }

  /**.
   * Mengeset tipe kandang
   * <br> tipe kandang yang tersedia adalah: 0 untuk darat, 1 untuk udara, dan 2 untuk air
   * @param i tipe kandang. Dilakukan pengecekan terlebih dahulu
   */
  public void SetTipeKandang(int i) {
    if ((i  ==  0) || (i  ==  1) || (i  ==  2)) {
      tipeKandang = i;
    }
  }

  /**.
   * Getter jumlah hewan dalam suatu kandang
   * @return banyaknya hewan dalam kandang tersebut
   */
  public int GetJumlahHewan() {
    return jumlah_hewan;
  }

  /**.
   * Getter tipe kandang
   * @return tipe kandang dalam kandang tersebut, apakah darat, air, ataupun udara
   */
  public int GetTipeKandang() {
    return tipeKandang;
  }

  /**.
   * Getter jumlah habitat
   * @return jumlah habitat yang telah terisi ke dalam kandang tersebut
   */
  public int GetJumlahHabitat() {
    return jumlahHabitat;
  }

  /**.
   * Setter habitat.
   * <br> Memasukkan habitat ke dalam kandang
   * @param x sumbu x tempat habitat tersebut berada
   * @param y sumbu y tempat habitat tersebut berada
   * @param render karakter render dari habitat tersebut
   * @param tipe_habitat tipe dari habitat tersebut, 0:darat, 1:udara, 2:air
   */
  public void SetHabitat(int x, int y, char render, int tipe_habitat) {
    if (tipe_habitat  ==  tipeKandang) {
      listHabitat[jumlahHabitat] = new Point(x,y,render);
      jumlahHabitat++;
    }
  }

  /**.
   * Getter Habitat
   * @param idx indeks habitat tersebut berada
   * @return Point dari habitat berindeks i
   */
  public Point GetHabitat(int idx) {
    return (listHabitat[idx]);
  }

  /**.
   * Setter hewan ke dalam cage
   * @param i lokasi x hewan tersebut
   * @param j lokasi y hewan tersebut
   * @param tipe_hewan tipe habitat dari hewan tersebut
   * @param render karakter dari hewan tersebut
   * @param exp experience yang dihasilkan
   * @param l_musuh musuh dari hewan yang akan diset ke dalam cage
   * @param tipe_makanan tipe makanan dari hewan tersebut (1 herbi 2 karni 3 omni)
   * @param jumlah_makanan jumlah banyaknya kebutuhan makanan
   */
  public void SetHewan(int i, int j,int[] tipe_hewan, char render, StringBuffer exp, char l_musuh, int tipe_makanan, int jumlah_makanan) {
    // cek apakah hewan tersebut dapat dimasukkan ke dalam kandang
    if(tipe_hewan[tipeKandang]  ==  1) {
      // cari musuh
      boolean musuh = false;
      int k = 0;
      while ((!musuh) && (k < jumlah_hewan)) {
        if(list_musuh[k]  ==  render) {
          musuh = true;
        } else {
          k++;
        }
      }
      if (!musuh) {
        if((int)(jumlahHabitat * 0.3) > (jumlah_hewan)) {
          aniLoc[jumlah_hewan] = new Point(i, j, render);
          ani_exp[jumlah_hewan] = exp;
          list_musuh[jumlah_hewan] = l_musuh;
          jumlah_hewan++;
          totalMakanan[tipe_makanan] = totalMakanan[tipe_makanan] + jumlah_makanan;
        }
      }
    }
  }

  /**.
   * Getter TotalMakanan
   * @return Total makanan dari seluruh hewan dalam kandang tersebut
   */
  public int[] GetTotalMakan() {
    return totalMakanan;
  }

  /**.
   * Getter experience
   * @return StringBuffer berisi experience semua hewan dalam kandang tersebut
   */
  public StringBuffer GetExperience() {
    StringBuffer str = new StringBuffer();
    int i;
    str.append("");
    for (i = 0; i < jumlah_hewan; i++) {
      str.append(ani_exp[i]);
      str.append('\n');
    }
    return (str);
  }

  /**.
   * Menggerakkan semua hewan dalam kandang
   */
  public void SemuaGerak() {
    int i;
    for(i = 0; i < jumlah_hewan; i++) {
      HewanGerak(i);
    }
  }

  /**.
   * Menggerakkan hewan berindeks i dalam kandang
   * @param id indeks hewan yang ingin digerakkan
   */
  public void HewanGerak(int id) {
    Random rn = new Random();
    int rand = rn.nextInt(4);
    if(rand  ==  0) {
      // gerak keatas (baris-1)
      if(AvailGerak(aniLoc[id].GetX() - 1, aniLoc[id].GetY())) {
          aniLoc[id].SetX(aniLoc[id].GetX()-1);
      }
    } else if (rand  ==  2) {
      // gerak kebawah (baris+1)
      if(AvailGerak(aniLoc[id].GetX() + 1, aniLoc[id].GetY())) {
        aniLoc[id].SetX(aniLoc[id].GetX() + 1);
      }
    } else if (rand  ==  1) {
      // gerak kekanan (kolom+1)
      if (AvailGerak(aniLoc[id].GetX(), aniLoc[id].GetY() + 1)) {
        aniLoc[id].SetY(aniLoc[id].GetY() + 1);
      }
    } else if (rand  ==  3) {
      // gerak kekiri (kolom - 1)
      if(AvailGerak(aniLoc[id].GetX(), aniLoc[id].GetY()-1)) {
        aniLoc[id].SetY(aniLoc[id].GetY() - 1);
      }
    }
  }

  /**.
   * Mengecek apakah x dan y merupakan tempat yang kosong
   * @param x sumbu x lokasi yang ingin dicek
   * @param y sumbu y lokasi yang ingin dicek
   * @return true jika tempat tersebut kosong
   */
  public boolean AvailGerak(int x, int y) {
    // cari apakah terdapat hewan
    int i = 0;
    boolean avail = true;
    boolean slotava = false;
    while ((avail) && (i < jumlah_hewan)) {
      if ((aniLoc[i].GetX()  ==  x) && (aniLoc[i].GetY()  ==  y)) {
        avail = false;
      } else {
        i++;
      }
    }
    if (avail) {
      // cek apakah ada slot
      i = 0;
      while((!slotava) && (i < jumlahHabitat)) {
        if ((listHabitat[i].GetX()  ==  x) && (listHabitat[i].GetY()  ==  y)) {
          slotava = true;
        } else {
          i++;
        }
      }
    }
    return (slotava && avail);
  }

  /**.
   * Mengecek apakah habitat berindeks x dan y merupakan anggota dari kandang tersebut
   * @param x sumbu x lokasi yang ingin dicek
   * @param y sumbu y lokasi yang ingin dicek
   * @return true jika lokasi tersebut terdapat dalam listHabitat
   */
  public boolean IsXYHabitat(int x, int y) {
    boolean found = false;
    int i = 0;
    while((!found) && (i < jumlahHabitat)) {
      if ((listHabitat[i].GetX()  ==  x) && (listHabitat[i].GetY()  ==  y)) {
        found = true;
      } else {
        i++;
      }
    }
    return found;
  }


}
