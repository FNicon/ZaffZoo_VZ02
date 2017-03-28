/**
 * Kelas Main ini ....
 * <br>Kelas ini tergabung dalam package PACKAGE_NAME
 * <br>Created by 13515017 / Putu Arya Pradipta on 3/27/2017.
 * <br>File Name : Main.java
 */

import animal.*;
import zoo_vz02.*;

import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Entrance ent = new Entrance(0,0);
    Exit ext = new Exit(14,9);
    Cell zoo = new Cell(15,10,20,100,ent,ext);
    // inisialisasi jalan
    int i, j;
    Road rd;
    for(i = 1; i < 15; i++){
      rd = new Road(i,0);
      zoo.SetRoad(rd);
    }
    for(i = 0; i < 5; i++){
      rd = new Road(i,2);
      zoo.SetRoad(rd);
    }
    for(i = 4; i < 12; i++){
      rd = new Road(i,5);
      zoo.SetRoad(rd);
    }
    for(i = 0; i < 14; i++){
      rd = new Road(i,9);
      zoo.SetRoad(rd);
    }
    for(i = 1; i < 10; i++){
      rd = new Road(0,i);
      zoo.SetRoad(rd);
    }
    for(i = 0; i < 9; i++){
      rd = new Road(14,i);
      zoo.SetRoad(rd);
    }
    for(i = 2; i < 9; i++){
      rd = new Road(4,i);
      zoo.SetRoad(rd);
    }
    for(i = 0; i < 6; i++){
      rd = new Road(8,i);
      zoo.SetRoad(rd);
    }
    for(i = 6; i < 9; i++){
      rd = new Road(11,i);
      zoo.SetRoad(rd);
    }
    LandHabitat lh = new LandHabitat();
    WaterHabitat wh = new WaterHabitat();
    AirHabitat ah = new AirHabitat();

    Cage cg = new Cage();
    cg.SetTipeKandang(0);
    for (i = 1; i < 3; i++){
      for (j = 3; j < 9; j++){
        cg.SetHabitat(i,j,lh.GetRender(),0);
      }
    }
    cg.SetHabitat(3,7,lh.GetRender(),0);
    cg.SetHabitat(3,8,lh.GetRender(),0);
    AfricanElephant ae = new AfricanElephant();
    cg.SetHewan(1,4,ae.getType(),ae.getRender(),ae.getExperience(),ae.getEnemy(),ae.getJenisMakanan(),ae.getFoodNum());
    Anoa an = new Anoa();
    cg.SetHewan(2,5,an.getType(),an.getRender(),an.getExperience(),an.getEnemy(),an.getJenisMakanan(),an.getFoodNum());
    Bear br = new Bear();
    cg.SetHewan(2,7,br.getType(),br.getRender(),br.getExperience(),br.getEnemy(),br.getJenisMakanan(),br.getFoodNum());
    Girrafe gf = new Girrafe();
    cg.SetHewan(3,8,gf.getType(),gf.getRender(),gf.getExperience(),gf.getEnemy(),gf.getJenisMakanan(),gf.getFoodNum());
    zoo.SetCage(cg);

    cg = new Cage();
    cg.SetTipeKandang(2);
    for(i = 3; i < 7; i++){
      cg.SetHabitat(3,i,wh.GetRender(),2);
    }
    Whale we = new Whale();
    cg.SetHewan(3,4,we.getType(),we.getRender(),we.getExperience(),we.getEnemy(),we.getJenisMakanan(),we.getFoodNum());
    zoo.SetCage(cg);


    cg = new Cage();
    cg.SetTipeKandang(2);
    for(i=1;i<5;i++){
      cg.SetHabitat(i,1,wh.GetRender(),2);
    }
    WhiteShark ws = new WhiteShark();
    cg.SetHewan(2,1,ws.getType(),ws.getRender(),ws.getExperience(),ws.getEnemy(),ws.getJenisMakanan(),ws.getFoodNum());
    zoo.SetCage(cg);

    cg = new Cage();
    cg.SetTipeKandang(0);
    for(i=5;i<7;i++){
      for(j=1;j<5;j++){
        cg.SetHabitat(i,j,lh.GetRender(),0);
      }
    }
    IndianPython ip = new IndianPython();
    cg.SetHewan(5,3,ip.getType(),ip.getRender(),ip.getExperience(),ip.getEnemy(),ip.getJenisMakanan(),ip.getFoodNum());

    Tiger ti = new Tiger();
    cg.SetHewan(6,2,ti.getType(),ti.getRender(),ti.getExperience(),ti.getEnemy(),ti.getJenisMakanan(),ti.getFoodNum());
    zoo.SetCage(cg);

    cg = new Cage();
    cg.SetTipeKandang(1);
    for(i = 1; i < 5; i++){
      cg.SetHabitat(7,i,ah.GetRender(),1);
    }
    Eagle ea = new Eagle();
    cg.SetHewan(7,3,ea.getType(),ea.getRender(),ea.getExperience(),ea.getEnemy(),ea.getJenisMakanan(),ea.getFoodNum());
    zoo.SetCage(cg);

    cg = new Cage();
    cg.SetTipeKandang(2);
    for(i=5;i<7;i++){
      for(j=6;j<9;j++){
        cg.SetHabitat(i,j,wh.GetRender(),2);
      }
    }
    cg.SetHabitat(7,6,wh.GetRender(),2);
    Penguin pu = new Penguin();
    cg.SetHewan(5,8,pu.getType(),pu.getRender(),pu.getExperience(),pu.getEnemy(),pu.getJenisMakanan(),pu.getFoodNum());
    Seadragon sd = new Seadragon();
    cg.SetHewan(6,6,sd.getType(),sd.getRender(),sd.getExperience(),sd.getEnemy(),sd.getJenisMakanan(),sd.getFoodNum());
    zoo.SetCage(cg);

    cg = new Cage();
    cg.SetTipeKandang(0);
    for(i=8;i<11;i++){
      for(j=6;j<9;j++){
        cg.SetHabitat(i,j,lh.GetRender(),0);
      }
    }
    cg.SetHabitat(7,7,lh.GetRender(),0);
    cg.SetHabitat(7,8,lh.GetRender(),0);
    Fox fx = new Fox();
    cg.SetHewan(7,8,fx.getType(),fx.getRender(),fx.getExperience(),fx.getEnemy(),fx.getJenisMakanan(),fx.getFoodNum());
    Reindeer ri = new Reindeer();
    cg.SetHewan(8,7,ri.getType(),ri.getRender(),ri.getExperience(),ri.getEnemy(),ri.getJenisMakanan(),ri.getFoodNum());
    SquirrelMonkey sq = new SquirrelMonkey();
    cg.SetHewan(10,7,sq.getType(),sq.getRender(),sq.getExperience(),sq.getEnemy(),sq.getJenisMakanan(),sq.getFoodNum());
    zoo.SetCage(cg);

    cg= new Cage();
    cg.SetTipeKandang(0);
    for(i=9;i<11;i++){
      for(j=1;j<5;j++){
        cg.SetHabitat(i,j,lh.GetRender(),0);
      }
    }
    Zebra zb = new Zebra();
    cg.SetHewan(9,4,zb.getType(),zb.getRender(),zb.getExperience(),zb.getEnemy(),zb.getJenisMakanan(),zb.getFoodNum());
    Rhino rh = new Rhino();
    cg.SetHewan(10,2,rh.getType(),rh.getRender(),rh.getExperience(),rh.getEnemy(),rh.getJenisMakanan(),rh.getFoodNum());
    zoo.SetCage(cg);

    cg = new Cage();
    cg.SetTipeKandang(2);
    for(i=1;i<5;i++){
      cg.SetHabitat(11,i,wh.GetRender(),2);
    }
    Stingray sr = new Stingray();
    cg.SetHewan(11,3,sr.getType(),sr.getRender(),sr.getExperience(),sr.getEnemy(),sr.getJenisMakanan(),sr.getFoodNum());
    zoo.SetCage(cg);

    cg= new Cage();
    cg.SetTipeKandang(0);
    for(i=12;i<14;i++){
      for(j=1;j<7;j++){
        cg.SetHabitat(i,j,lh.GetRender(),0);
      }
    }
    Lion li = new Lion();
    cg.SetHewan(12,2,li.getType(),li.getRender(),li.getExperience(),li.getEnemy(),li.getJenisMakanan(),li.getFoodNum());
    Gorilla go = new Gorilla();
    cg.SetHewan(13,3,go.getType(),go.getRender(),go.getExperience(),go.getEnemy(),go.getJenisMakanan(),go.getFoodNum());
    Panda pd = new Panda();
    cg.SetHewan(13,5,pd.getType(),pd.getRender(),pd.getExperience(),pd.getEnemy(),pd.getJenisMakanan(),pd.getFoodNum());
    zoo.SetCage(cg);

    cg= new Cage();
    cg.SetTipeKandang(1);
    for(i=12;i<14;i++){
      for(j=7;j<9;j++){
        cg.SetHabitat(i,j,ah.GetRender(),1);
      }
    }
    Peacock pc = new Peacock();
    cg.SetHewan(12,7,pc.getType(),pc.getRender(),pc.getExperience(),pc.getEnemy(),pc.getJenisMakanan(),pc.getFoodNum());
    zoo.SetCage(cg);

    // Menu
    Scanner sc;
    char cc;
    do {
      System.out.println("Selamat datang di ZAFF-ZOO");
      System.out.println("Menu yang tersedia :");
      System.out.println("1. Display Zoo Map");
      System.out.println("2. Tour Zoo");
      System.out.println("3. Display Makanan");
      System.out.println("4. Exit");
      System.out.println("Masukkan angka yang diinginkan : ");
      sc = new Scanner(System.in);
      cc = sc.next().charAt(0);
      if (cc == '1'){
        zoo.PrintMap();
      } else if (cc == '2'){
        zoo.Tour();
      } else if (cc == '3'){
        zoo.PrintFoodReq();
      }

    } while (cc != '4');
  }
}
