package praktikum11_bagasmuhammadshaka;

public class Praktikum11_BagasMuhammadShaka {

    public static void main(String[] args) {
      BangunDatar lingkaran = new Lingkaran(10,"Merah");
      BangunDatar segiTiga = new SegiTiga(13,5,"Biru");
      BangunDatar segiEmpat = new SegiEmpat(5,"Hitam");
      
      BangunDatar[] bangunDatar = new BangunDatar[3];
      bangunDatar[0] = lingkaran;
      bangunDatar[1] = segiTiga;
      bangunDatar[2] = segiEmpat;
      
      for(int i = 0; i < 3; i++){
      bangunDatar[i].print();
      }
    }  
}
