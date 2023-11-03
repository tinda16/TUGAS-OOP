import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama: ");
        String nama = input.nextLine();
        
        System.out.print("NIM: ");
        String nim = input.nextLine();
        
        System.out.print("Nilai Tubes: ");
        double nilaiTubes = input.nextDouble();
        
        System.out.print("Nilai Quiz: ");
        double nilaiQuiz = input.nextDouble();
        
        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        
        System.out.print("Nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        
        System.out.print("Nilai UAS: ");
        double nilaiUAS = input.nextDouble();
        
        Nilai nilaiMahasiswa = new Nilai(nama, nim, nilaiTubes, nilaiQuiz, nilaiTugas, nilaiUTS, nilaiUAS);
        nilaiMahasiswa.cetakNilai();
        
        input.close();
    }
}