public class Nilai {
    private String nama;
    private String nim;
    private double nilaiTubes;
    private double nilaiQuiz;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;
    
    public Nilai(String nama, String nim, double nilaiTubes, double nilaiQuiz, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.nilaiTubes = nilaiTubes;
        this.nilaiQuiz = nilaiQuiz;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    
    public double hitungTotalNilai() {
        double totalNilai = (0.30 * nilaiTubes) + (0.10 * nilaiQuiz) + (0.10 * nilaiTugas) + (0.25 * nilaiUTS) + (0.25 * nilaiUAS);
        return totalNilai;
    }
    
    public String hitungGrade() {
        double totalNilai = hitungTotalNilai();
        if (totalNilai >= 80) {
            return "A";
        } else if (totalNilai >= 70) {
            return "B";
        } else if (totalNilai >= 60) {
            return "C";
        } else if (totalNilai >= 50) {
            return "D";
        } else {
            return "E";
        }
    }
    
    public void cetakNilai() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai Tubes: " + nilaiTubes);
        System.out.println("Nilai Quiz: " + nilaiQuiz);
        System.out.println("Nilai Tugas: " + nilaiTugas);
        System.out.println("Nilai UTS: " + nilaiUTS);
        System.out.println("Nilai UAS: " + nilaiUAS);
        
        double totalNilai = hitungTotalNilai();
        String grade = hitungGrade();
        
        System.out.println("Nilai Matakuliah Pemrograman Berorientasi Objek:");
        System.out.println("Total Nilai: " + totalNilai);
        System.out.println("Grade: " + grade);
    }
}
