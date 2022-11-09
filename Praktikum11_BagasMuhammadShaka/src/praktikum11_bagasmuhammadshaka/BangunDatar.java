package praktikum11_bagasmuhammadshaka;

public abstract class BangunDatar implements ViewData {
    protected  String warna;
    
    public abstract double Luas();
    public abstract double Keliling();

  
    public String getWarna() {
        return warna;
    }

  
    public void setWarna(String warna) {
        this.warna = warna;
    }
       
}
