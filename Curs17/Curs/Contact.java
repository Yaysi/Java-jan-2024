package Curs17.Curs;

public class Contact {

    private String name;
    private String numaru;

    public Contact(String name, String numaru) {
        this.name = name;
        this.numaru = numaru;
    }

    public void setName(String m){
        name=m;

    }
    public void setNumaru(String n){
        numaru=n;
    }
    public String getName(){
        return name;
    }

    public String getNumaru(){
        return numaru;
    }


}




