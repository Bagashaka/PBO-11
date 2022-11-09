package praktikum11_bagasmuhammadshaka;

public class SegiTiga extends BangunDatar{
    private double alas;
    private double tinggi;
    
    
    public SegiTiga(double alas,double tinggi,String warna){
    this.alas = alas;
    this.tinggi = tinggi;
    this.warna = warna;
    }
    
    @Override
    public double Luas(){
    return 0.5*getAlas()*getTinggi();
    }
    
    @Override
    public double Keliling(){
    return 3*alas;
    }
    
    @Override
    public String getWarna(){
    return this.warna;
    }
    
    @Override
    public void setWarna(String warna){
    this.warna = warna;
    }
    
    @Override
    public void print(){
    System.out.println("Segitiga");
      System.out.println("Warna :" + warna);
      System.out.println("Luas :" + Luas());
      System.out.println("Keliling :" + Keliling());
    }
    
    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
