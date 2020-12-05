import a.j.f.E;

public class MusabakaTest {
    public static void main(String[] args) {
        Ekip a = new Ekip();
        Ekip b= new Ekip();
        Musabaka ab = new Musabaka();
        a.al("Sergen","Beşiktaş",11);
        b.al("Rıdvan","Altay",11);
        ab.al(a.getEkipName(),b.getEkipName(),"20:00 11-29-2020",90);
        ab.maç(a,b,ab);
    }
}

class Ekip{
    private String Lider;
    private String EkipName;
    private int üyeler;

    public void  al(String Lider,String EkipName,int üyeler){
        this.EkipName=EkipName;
        this.Lider=Lider;
        this.üyeler=üyeler;
    }

    public int getÜyeler() {
        return üyeler;
    }

    public String getEkipName() {
        return EkipName;
    }

    public String getLider() {
        return Lider;
    }

    public void setEkipName(String ekipName) {
        EkipName = ekipName;
    }

    public void setLider(String lider) {
        Lider = lider;
    }

    public void setÜyeler(int üyeler) {
        this.üyeler = üyeler;
    }

}

class Musabaka{
    private String Ekip1;
    private String Ekip2;
    private String YerTarih;
    private int süre;

    public void  al(String Ekip1,String Ekip2,String YerTarih,int süre){
        this.Ekip1=Ekip1;
        this.Ekip2=Ekip2;
        this.YerTarih=YerTarih;
        this.süre=süre;
    }

    public int getSüre() {
        return süre;
    }

    public String getEkip1() {
        return Ekip1;
    }

    public String getEkip2() {
        return Ekip2;
    }

    public String getYerTarih() {
        return YerTarih;
    }

    public void setEkip1(String ekip1) {
        Ekip1 = ekip1;
    }

    public void setEkip2(String ekip2) {
        Ekip2 = ekip2;
    }

    public void setSüre(int süre) {
        this.süre = süre;
    }

    public void setYerTarih(String yerTarih) {
        YerTarih = yerTarih;
    }

    public void maç(Ekip a,Ekip b,Musabaka as1){

        System.out.println(a.getEkipName()+" ve "+b.getEkipName()+" takımları "+as1.getYerTarih()+" saat ve tarihinde müsabak yapacaklardır");
    }


}






