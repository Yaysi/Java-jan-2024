package Curs17.Curs;

public class postal {

    int nr;

    public int metodacalculeazacodepostal(int valoare){
      int primit = valoare;
     int codeposta= primit* this.nr;
     return codeposta;
    }

    static int superfata = 10;
}
