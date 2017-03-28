/**
 * 
 */
package animal;

/**
 * @author Fathur
 *
 */
public class Eagle {
  /**  Type habitat hewan. 0 : darat, 1 : udara, 2 : air
    */
  private int[] Type = new int[3];
  /**  Family hewan
    */
  private StringBuffer Famili;
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
   * @brief Inisialisasi Hewan  
   */
  public Eagle(){ 
    Type[0] = 0;
    Type[1] = 1;
    Type[2] = 0;
    Famili = new StringBuffer("Accipitridae");
    Species = new StringBuffer("Aquila chrysaetos");
    Experience = new StringBuffer("screeech!!!");
    JenisMakanan = 2;
    Berat = 60;
    AniChar = 'j';
    EnemyChar = 'X'; 
  }
  /**
   * @brief Komunikasi dengan hewan
   * @return Experience dari hewan
   */
  public StringBuffer getExperience(){
    StringBuffer str = new StringBuffer("Hewan ini tinggal di : ");
    if (Type[0]==1){
      str.append("darat ");
    }
    if (Type[1]==1){
      str.append("udara ");
    }
    if (Type[2]==1){
      str.append("air ");
    }
    str.append("\n");
    str.append("Hewan ini tergabung di famili ");
    str.append(Famili);
    str.append(" dan dengan nama spesies ");
    str.append(Species);
    str.append("\n");
    str.append(Experience);
    str.append("\n");
    return str;
  }
  /**
   * @brief Jumlah makanan
   * @return Jumlah makanan
   */
  public int getFoodNum(){
    return(2*Berat/10);
  }
  /**
   * @brief Print karakter
   * @return char dari animal
   */
  public char getRender(){
    return(AniChar);
  }
  /**
   * @brief Getter Musuh hewan
   * @return Char dari Musuh animal
   */
  public char getEnemy(){
    return(EnemyChar);
  }
  /**
   * @brief Getter berat
   * @return int berat
   */
  public int getBerat(){
    return(Berat);
  }
  /**
   * @brief Getter jenis makanan
   * @return int jenis makanan
   */
  public short getJenisMakanan(){
    return(JenisMakanan);
  }
  /**
   * @brief Getter Species
   * @return StringBuffer species
   */
  public StringBuffer getSpecies(){
    return(Species);
  }
  /**
   * @brief Getter Famili
   * @return StringBuffer Famili
   */
  public StringBuffer getFamili(){
    return(Famili);
  }
  /**
   * @brief Getter Experience
   * @return StringBuffer Experience
   */
  public StringBuffer getIsiExperience(){
    return(Experience);
  }
  /**
   * @brief Getter Type
   * @return Array of Int Type
   */
  public int[] getType(){
    return(Type);
  }
}
