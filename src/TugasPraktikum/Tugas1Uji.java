package TugasPraktikum;

import java.util.Scanner;

public class Tugas1Uji {

    public static void main(String[] args) {
        Tugas1 tugas = new Tugas1();
        Scanner masuk = new Scanner(System.in);
        boolean pass, add = true;
        int jmlPenumpang = 0, penumpang, max = 10, pwd;
        String jawab;
        double berat;

        System.out.println("Muhamad Rizky Amiruddin Hakim / XR6 / 32");
        System.out.println("");
        tugas.Bus(max);
        System.out.println("Maksimal Jumlah penumpang : " + max);
        System.out.println("Masukan Password : ");
        pwd = masuk.nextInt();
        pass = tugas.setPassword(pwd);

        if (pass) {
            System.out.println("=-=-=Password Benar=-=-=");
            do {
                System.out.println("Masukan Jumlah Penumpang Yang Akan Ditambah : ");
                penumpang = masuk.nextInt();
                jmlPenumpang += penumpang;

                boolean tambah = tugas.setPenumpang(penumpang);
                if (tambah) {
                    System.out.println("Masukan Berat penumpang (Kg) : ");
                    berat = masuk.nextDouble();
                    tugas.setBeratPenumpang(berat);
                    System.out.println("Total Berat Seluruh Penumpang : " + tugas.getBeratPenumpang() + "Kg");
                    System.out.println("Ingin Menambah Penumpang Anda ? ");
                    System.out.println("Ya/Tidak");
                    System.out.println("Jawab : ");
                    jawab = masuk.next();

                    if (jawab.equalsIgnoreCase("Ya")) {
                        add = true;
                    } else {
                        add = false;
                    }
                }
            } while (add);
            System.out.println("Total Berat Penumpang Sekarang : " + tugas.getBeratPenumpang() + "Kg");
            System.out.println("Total Penumpang Sekarang : " + tugas.getPenumpang());
            System.out.println("Rata rata Berat Seluruh Penumpang : " + tugas.getRataRata() + "Kg");
        } 
    }

}
