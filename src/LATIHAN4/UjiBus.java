package LATIHAN4;

public class UjiBus {

    public static void main(String[] abc) {
        Bus Bus = new Bus(5);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang(2); //tambah 2 penumpang
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang(1); // tambah 1 penumpang
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang(2); // tambah 2 penumpang
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang(2); // tambah 2 penumpang
        Bus.cetakpenumpang();
    }
}
