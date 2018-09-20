package TugasPraktikum;

public class Tugas1 {

    private int penumpang;
    private int maxPenumpang;
    private double beratPenumpang;
    private double maxBerat;
    private double rataRata;

    public void Bus(int penumpang) {
        this.maxPenumpang = maxPenumpang;
    }

    public boolean setPenumpang(int penumpang) {
        boolean tambah = true;
        int temp;
        temp = this.penumpang + penumpang;
        if (temp > maxPenumpang) {
            System.out.println("Jumlah penumpang melebihi kuota");
            tambah = false;
        } else {
            this.penumpang = temp;
        }
        return tambah;
    }

    public int getPenumpang() {
        return penumpang;
    }

    public boolean setPassword(int password) {
        boolean pass = false;
        if (password == 123) {
            pass = true;
        } else {
            System.out.println("=-=-Password Salah-=-=");
        }
        return pass;
    }

    public void setBeratPenumpang(double berat) {
        this.beratPenumpang += berat;
    }

    public double getBeratPenumpang() {
        return beratPenumpang;
    }

    public double getMaxBerat() {
        return maxBerat;
    }

    public double getRataRata() {
        rataRata = beratPenumpang / penumpang;
        return  rataRata;
    }

    public void cetak() {
        System.out.println("Penumpang Sekarang = " + penumpang);
        System.out.println("Penumpang Maksimal Seharusnya = " + maxPenumpang);
    }
}
