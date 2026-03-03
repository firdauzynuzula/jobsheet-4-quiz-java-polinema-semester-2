// import java.util.Scanner;
public class MataKuliahMain11 {
    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);


        MataKuliah11 matakuliah1 = new MataKuliah11();
        matakuliah1.namaMatakuliah = "halo";
        matakuliah1.sks = 2;
        matakuliah1.kodeMatakuliah = "MK001";
        matakuliah1.tampilkanInfoMatakuliah();
        String namaBaru = "Matematika";
        int sksBaru = 4;
        String hasilUbah = matakuliah1.ubahMataKuliah(namaBaru, sksBaru);
        System.out.println(hasilUbah);
        
        System.out.println("\nInformasi Matakuliah setelah diubah:");
        matakuliah1.tampilkanInfoMatakuliah();
    }
}
