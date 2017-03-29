/**
 * 
 */
package animal;

/**
 * @author Fathur
 *
 */
public class Seadragon {
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
  /**  Jenis Makanan hewan. 1 : herbifor, 2 : karnivor, 3 : omnivor
    */
  private short JenisMakanan;
  /**  Berat hewan
    */
  private int Berat;
  /**  Char yang digunakan untuk render
    */
  private char AniChar;
  /**  Array of char yang berisi list musuhnya
    */
  private char EnemyChar;
  /** 
   * 
   */
  public Seadragon(){ 
    Type[0] = 0;
    Type[1] = 0;
    Type[2] = 1;
    Famili = new StringBuffer("Accipitridae");
    Species = new StringBuffer("Aquila chrysaetos");
    Experience = new StringBuffer("screeech!");
    JenisMakanan = 2;
    Berat = 60;
    AniChar = 'j';
    EnemyChar = 'X'; 
  }
  /**
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
   * @return Jumlah makanan
   */
  public int getFoodNum(){
    return(2*Berat/10);
  }
  /**
   * @return char dari animal
   */
  public char getRender(){
    return(AniChar);
  }
  /**
   * @return Char dari Musuh animal
   */
  public char getEnemy(){
    return(EnemyChar);
  }
  /**
   * @return int berat
   */
  public int getBerat(){
    return(Berat);
  }
  /**
   * @return int jenis makanan
   */
  public short getJenisMakanan(){
    return(JenisMakanan);
  }
  /**
   * @return StringBuffer species
   */
  public StringBuffer getSpecies(){
    return(Species);
  }
  /**
   * @return StringBuffer Famili
   */
  public StringBuffer getFamili(){
    return(Famili);
  }
  /**
   * @return StringBuffer Experience
   */
  public StringBuffer getIsiExperience(){
    return(Experience);
  }
  /**
   * @return Array of Int Type
   */
  public int[] getType(){
    return(Type);
  }
}
