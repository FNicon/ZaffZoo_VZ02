/**
 * 
 */
package animal;

/**
 * @author Fathur
 *
 */
public class SquirrelMonkey {
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
   *
   */
  public SquirrelMonkey(){
    Type[0] = 1;
    Type[1] = 0;
    Type[2] = 0;
    Famili = new StringBuffer("Cercopithecidae");
    Species = new StringBuffer("Saimiri sciureus");
    Experience = new StringBuffer("Squirrel monkey is a type of monkey that is very small");
    JenisMakanan = 1;
    Berat = 10;
    AniChar = 'V';
    EnemyChar = ' '; 
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
    return(5*Berat/10);
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
