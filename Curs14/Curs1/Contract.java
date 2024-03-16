package Curs14.Curs1;

public class Contract {
    int id;
    String pagini;

   static void intretinere(){
       System.out.println("Je suis tres riche et le bloc c est a moi");
   } ;
    static String nomdebloc = "Bloc 25 c";
    public Contract(int id, String pagini) {
        this.id = id;
        this.pagini = pagini;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPagini(String pagini) {
        this.pagini = pagini;
    }


    int getId(){
        return id;
    }
    String getPagini(){
        return pagini;

    }
}
