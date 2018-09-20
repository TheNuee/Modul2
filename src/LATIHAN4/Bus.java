package LATIHAN4;

public class Bus {

    public int penumpang;
    public int maxpenumpang;

    public Bus(int maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
// Method Mutator

    public void addpenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp > maxpenumpang) {
            System.out.println("Penumpang Melebihi kuota");
        } else {
            this.penumpang = temp;
        }
    }

    public void getpenumpang(int password) {
        if (password == 24) {
            System.out.println("Password Benar");
        } else {
            System.out.println("Pswword Salah");
        }
    }

    public void cetakpenumpang() {
        System.out.println("penumpang Bus Sekarang = " + penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = " + maxpenumpang);

    }
}
