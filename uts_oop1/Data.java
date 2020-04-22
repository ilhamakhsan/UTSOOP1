
package uts_oop1;

public class Data {
    private String NIM;
    private String Nama;
    private String Kelas;
  

    public Data() {
        NIM = "";
        Nama = "";
        Kelas = "";
        
    }

    public Data(String NIM, String Nama, String Kelas, String Alamat) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Kelas = Kelas;
        
    }

    Data(String NIM, String Nama, String Kelas) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNIM() { return NIM; }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() { return Nama; }

    public void setKelas(String Kelas) {
        this.Kelas = Kelas;
    }

    public String getKelas() { return Kelas; }

    
}
