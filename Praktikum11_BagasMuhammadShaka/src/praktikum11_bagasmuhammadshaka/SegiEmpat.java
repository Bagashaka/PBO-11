package praktikum11_bagasmuhammadshaka;

public class SegiEmpat extends BangunDatar{
    private double sisi;
    
    public SegiEmpat(double sisi,String warna){
    this.sisi = sisi;
    this.warna = warna;
    }
    
    @Override
    public double Luas(){
    return sisi*sisi;
    }
    
    @Override
    public double Keliling(){
    return 4*sisi;
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
    System.out.println("Segiempat");
      System.out.println("Warna :" + warna);
      System.out.println("Luas :" + Luas());
      System.out.println("Keliling :" + Keliling());
    }
    
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
