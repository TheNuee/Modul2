package LATIHAN1;

public class UjiBus {

    public static void main(String[] args) {
        //Membuat Objek busMini dari kelas Bus1
        Bus1 busMini = new Bus1();
        //Memasukan nilai jumlah penumpang dan penumpang maksimal kedalam objek busMini
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        // Memanggil method cetan pada kelas Bus1
        busMini.cetak();

        //Menambahkan penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 5;
        //Memanggil method cetak pada kelas Bus1
        busMini.cetak();

        //Mengurangi Jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();

        //Menambah jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 5;
        busMini.cetak();

    }
}
