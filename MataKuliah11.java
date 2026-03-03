public class MataKuliah11 {
   public String namaMatakuliah;
    public String kodeMatakuliah;
    public int sks;
    

    public void tampilkanInfoMatakuliah() {
        System.out.println("Nama Matakuliah: " + namaMatakuliah);
        System.out.println("Kode Matakuliah: " + kodeMatakuliah);
        System.out.println("SKS: " + sks);
    }
    
    public String ubahNamaMatakuliah(String namaMatakuliah) {
        this.namaMatakuliah = namaMatakuliah;
        return "Nama mata kuliah berhasil diubah.";
    }

    public int ubahSks(int sks) {

        if (sks  <= 2) {
            System.out.println("SKS tidak valid. SKS harus kurang dari 2.");
        } else {
            this.sks = sks;
        }
        return this.sks;
    }
}