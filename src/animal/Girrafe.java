/**
 * 
 */
package animal;

/**
 * @author Fathur
 *
 */
public class Girrafe {
  /**  type habitat hewan. 0 : darat, 1 : udara, 2 : air
    */
  private int[] type = new int[3];
  /**  Family hewan
    */
  private StringBuffer famili;
  /**  Species hewan
    */
  private StringBuffer Species;
  /**  Experience hewan
    */
  private StringBuffer Experience;
  /**  Jenis Makanan hewan. 1 : herbifor, 2 : karnivor, 3 : omnifor
    */
  private short JenisMakanan;
  /**  Berat hewan
    */
  private int Berat;
  /**  Char yang digunakan untuk render
    */
  private char AniChar;
  /**  Char yang berisi musuhnya
    */
  private char EnemyChar;
  /** 
   *
   */
  public Girrafe() {
    type[0] = 1;
    type[1] = 0;
    type[2] = 0;
    famili = new StringBuffer("Girrafidae");
    Species = new StringBuffer("Giraffa camelopardalis");
    Experience = new StringBuffer("Girrafes live in africa");
    JenisMakanan = 1;
    Berat = 1200;
    AniChar = 'Q';
    EnemyChar = ' '; 
  }
  /**
   * @return Experience dari hewan
   */
  public StringBuffer getExperience() {
    StringBuffer str = new StringBuffer("Hewan ini tinggal di : ");
    if (type[0] == 1) {
      str.append("darat ");
    }
    if (type[1] == 1) {
      str.append("udara ");
    }
    if (type[2] == 1) {
      str.append("air ");
    }
    str.append("\n");
    str.append("Hewan ini tergabung di famili ");
    str.append(famili);
    str.append(" dan dengan nama spesies ");
    str.append(Species);
    str.append("\n");
    str.append(Experience);
    str.append("\n");
    return str;
  }
  /**
   * @return Jumlah makanan
   */
  public int getFoodNum() {
    return (5*Berat/10);
  }
  /**
   * @return char dari animal
   */
  public char getRender() {
    return (AniChar);
  }
  /**
   * @return Char dari Musuh animal
   */
  public char getEnemy() {
    return (EnemyChar);
  }
  /**
   * @return int berat
   */
  public int getBerat() {
    return (Berat);
  }
  /**
   * @return int jenis makanan
   */
  public short getJenisMakanan() {
    return (JenisMakanan);
  }
  /**
   * @return StringBuffer species
   */
  public StringBuffer getSpecies() {
    return (Species);
  }
  /**
   * @return StringBuffer famili
   */
  public StringBuffer getFamili() {
    return (famili);
  }
  /**
   * @return StringBuffer Experience
   */
  public StringBuffer getIsiExperience() {
    return (Experience);
  }
  /**
   * @return Array of Int type
   */
  public int[] getType() {
    return (type);
  }
}
