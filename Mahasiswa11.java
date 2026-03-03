public class Mahasiswa11 {
    public String nim;
    public String nama;
    public int tahunMasuk;
    public MataKuliah11[] mataKuliahDiambil;
    private int jumlahMataKuliah;

    // Konstruktor
    public Mahasiswa11(String nim, String nama, int tahunMasuk) {
        this.nim = nim;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.mataKuliahDiambil = new MataKuliah11[10]; // kapasitas maksimal 10
        this.jumlahMataKuliah = 0;
    }

    // Menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("NIM         : " + nim);
        System.out.println("Nama        : " + nama);
        System.out.println("Tahun Masuk : " + tahunMasuk);
        System.out.println("Total SKS   : " + hitungTotalSKS());
        System.out.println("Mata Kuliah Diambil:");
        if (jumlahMataKuliah == 0) {
            System.out.println("  (belum ada mata kuliah)");
        } else {
            for (int i = 0; i < jumlahMataKuliah; i++) {
                MataKuliah11 mk = mataKuliahDiambil[i];
                System.out.println("  - " + mk.namaMatakuliah + " (" + mk.kodeMatakuliah + ") - " + mk.sks + " SKS");
            }
        }
    }

    // Menambahkan mata kuliah yang diambil
    public void tambahMataKuliah(MataKuliah11 mataKuliah) {
        if (jumlahMataKuliah >= mataKuliahDiambil.length) {
            System.out.println("Gagal: kapasitas mata kuliah sudah penuh.");
            return;
        }
        mataKuliahDiambil[jumlahMataKuliah] = mataKuliah;
        jumlahMataKuliah++;
        System.out.println("Mata kuliah '" + mataKuliah.namaMatakuliah + "' berhasil ditambahkan.");
    }

    // Menghitung total SKS yang diambil
    public int hitungTotalSKS() {
        int total = 0;
        for (int i = 0; i < jumlahMataKuliah; i++) {
            total += mataKuliahDiambil[i].sks;
        }
        return total;
    }
}
