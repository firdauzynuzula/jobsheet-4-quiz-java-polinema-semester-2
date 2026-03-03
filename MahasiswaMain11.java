public class MahasiswaMain11 {
    public static void main(String[] args) {
        // Membuat objek MataKuliah
        MataKuliah11 mk1 = new MataKuliah11();
        mk1.namaMatakuliah = "Algoritma dan Pemrograman";
        mk1.kodeMatakuliah = "MK001";
        mk1.sks = 3;

        MataKuliah11 mk2 = new MataKuliah11();
        mk2.namaMatakuliah = "Basis Data";
        mk2.kodeMatakuliah = "MK002";
        mk2.sks = 3;

        MataKuliah11 mk3 = new MataKuliah11();
        mk3.namaMatakuliah = "Matematika Diskrit";
        mk3.kodeMatakuliah = "MK003";
        mk3.sks = 2;

        // Membuat objek Mahasiswa
        Mahasiswa11 mahasiswa = new Mahasiswa11("2341720001", "Budi Santoso", 2023);

        // Menambahkan mata kuliah
        mahasiswa.tambahMataKuliah(mk1);
        mahasiswa.tambahMataKuliah(mk2);
        mahasiswa.tambahMataKuliah(mk3);

        // Menampilkan informasi mahasiswa
        System.out.println("\n=== Informasi Mahasiswa ===");
        mahasiswa.tampilkanInfo();

        // Menampilkan total SKS
        System.out.println("\nTotal SKS yang diambil: " + mahasiswa.hitungTotalSKS());
    }
}
