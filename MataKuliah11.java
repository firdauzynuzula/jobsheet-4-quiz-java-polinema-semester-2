public class MataKuliah11 {
   public String namaMatakuliah;
    public String kodeMatakuliah;
    public int sks;
    

    public void tampilkanInfoMatakuliah() {
        System.out.println("Nama Matakuliah: " + namaMatakuliah);
        System.out.println("Kode Matakuliah: " + kodeMatakuliah);
        System.out.println("SKS: " + sks);
    }
    
    public String ubahMataKuliah(String namaMatakuliah, int sks) {
        this.namaMatakuliah = namaMatakuliah;
        this.sks = sks;
        return "Mata kuliah berhasil diubah.";
    }
}