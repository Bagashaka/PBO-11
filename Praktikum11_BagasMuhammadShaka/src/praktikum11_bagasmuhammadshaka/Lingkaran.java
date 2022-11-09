package praktikum11_bagasmuhammadshaka;

public class Lingkaran extends BangunDatar{
    private double jari;
    
    
    public Lingkaran(double jari,String warna){
    this.jari = jari;
    this.warna = warna;
    }
        
    @Override
    public double Luas(){
    return Math.PI *jari*jari;
    }
    
    @Override
    public double Keliling(){
    return 2*Math.PI*jari;
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
    System.out.println("Lingkaran");
      System.out.println("Warna :" + warna);
      System.out.println("Luas :" + Luas());
      System.out.println("Keliling :" + Keliling());
    }
    
    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }
    
}
