package LATIHAN2;

public class Bus {
    private int penumpang;
    private int maxPenumpang;

//Konstruktor kelas BusBag
    public Bus(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
//method mutator untu menambahkan penumpang

    public void addPenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp >= maxPenumpang) {
            System.out.println("Penumpang Melebihi kuota");
        } else {
            this.penumpang = temp;
        }
    }

    public void cetak() {
        System.out.println("Penumpang Bus Sekarang adalah" + penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah" + maxPenumpang);
    }
}


