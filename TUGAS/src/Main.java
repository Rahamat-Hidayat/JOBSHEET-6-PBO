public class Main {
    public static void main(String[] args) {
        DaftarGaji daftar = new DaftarGaji(5);

        Dosen dosen1 = new Dosen("111123", "Rahmat Hidayat", "JL.Simpang Kh Yusuf A16");
        dosen1.jumlahSKS = 12;

        Dosen dosen2 = new Dosen("111127", "Messi Goat", "Jl.Santiago");
        dosen2.jumlahSKS = 14;

        Dosen dosen3 = new Dosen("111145", "Ronaldo Goat", "Jl.Camp Nou");
        dosen3.jumlahSKS = 16;
        
        daftar.addPegawai(dosen1);
        daftar.addPegawai(dosen2);
        daftar.addPegawai(dosen3);
        daftar.printPegawai();
    }
}