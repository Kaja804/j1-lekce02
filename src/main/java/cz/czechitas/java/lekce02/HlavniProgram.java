package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    //TODO tady bude kód
    zofka.turnRight(90);
    nakresliDomecek();
    zofka.penUp();
    zofka. turnLeft(45);
    zofka.move(100);
    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnRight(180);
    zofka.penDown();
    nakresliPrasatko();


    }
    public void nakresliDomecek () {
      for (int i = 0; i < 4; i++) {
        zofka.move(100);
        zofka.turnRight(90);
      }
      zofka.turnLeft(45);
      zofka.move(71);
      zofka.turnRight(90);
      zofka.move(71);

 /* public void nakresliCtverecek(int delkaStrany) {
    for (int i = 0; i < 4; i++) {
      zofka.move(delkaStrany);
      zofka.turnRight(90);
//      tento kod umí vytvořit různě velký čtverec dle aktuálního zadání
    }*/
   /* public void nakresliCtverecek() {       pevně daná velikost čtverce
      for (int i = 0; i < 4; i++) {
        zofka.move(100);
        zofka.turnRight(90);
      }*/
  }
  public void nakresliNozicky() {
    zofka.move(50);
    zofka.turnRight(180);
    zofka.move(50);
    zofka.turnRight(90);
    zofka.move(50);
    zofka.turnRight(180);
    zofka.move(50);
  }
  public void nakresliPrasatko() {
    nakresliDomecek();
    zofka.penUp();
    zofka.turnRight(135);
    zofka.move(100);
    zofka.penDown();
    zofka.turnRight(45);
    nakresliNozicky();
    zofka.turnRight(135);
    zofka.move(100);
    zofka.turnRight(135);
    nakresliNozicky();
    zofka.turnRight(45);
  }

}
