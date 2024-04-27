package Curs23.Curs;

public class Agenda <Marriage> {

    public Marriage tip;

    public <Marriage> void noter (Marriage marriage){

        System.out.println(marriage);
    }

    public Marriage getTip() {
        return this.tip;
    }

    public  void setTip(Marriage marriage) {
        this.tip = marriage;
    }
}
