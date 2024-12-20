/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package akademik;

/**
 *
 * @author uday9
 */
public class nilai {
    private String nim;
    private String kodeMatkul;
    private double tugas1;
    private double tugas2;
    private double tugas3;
    private double quiz;
    private double uts;
    private double uas;

    public nilai(String nim, String kodeMatkul, double tugas1, double tugas2, double tugas3, double quiz, double uts, double uas) {
        this.nim = nim;
        this.kodeMatkul = kodeMatkul;
        this.tugas1 = tugas1;
        this.tugas2 = tugas2;
        this.tugas3 = tugas3;
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }

    // Getter dan Setter
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKodeMatkul() {
        return kodeMatkul;
    }

    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }

    public double getTugas1() {
        return tugas1;
    }

    public void setTugas1(double tugas1) {
        this.tugas1 = tugas1;
    }

    public double getTugas2() {
        return tugas2;
    }

    public void setTugas2(double tugas2) {
        this.tugas2 = tugas2;
    }

    public double getTugas3() {
        return tugas3;
    }

    public void setTugas3(double tugas3) {
        this.tugas3 = tugas3;
    }

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }
}


