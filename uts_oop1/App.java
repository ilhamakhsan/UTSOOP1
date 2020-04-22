
package uts_oop1;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(final String args[]) {
        final App app = new App();
        final Scanner scan = new Scanner(System.in);
        while(true) {
            app.tampilMenu();
            final int Pilihan = scan.nextInt();
            switch(Pilihan) {
                case 1:
                    System.out.println("Menampilkan Data");
                    app.tapilData();    
                    break;
                case 2:
                    System.out.println("Tambah Data");
                    app.tambahData();
                    break;
                case 3:
                    System.out.println("Ubah Data");
                    app.ubahData();
                    break;
                case 4:
                    System.out.println("Hapus Data");
                    app.hapusData();
                    break;
                case 5:
                    return;
                }
            }
        }
    
    public void tapilData() {
        final List<Data> Tampilan = funtion.getListData();
        for(int i=0; i<Tampilan.size(); i++) {
            System.out.println();
            System.out.println("ID - " + (i+1));
            System.out.println("---------------------------------------");
            System.out.println("  NIM : " + Tampilan.get(i).getNIM());
            System.out.println("  Nama : " + Tampilan.get(i).getNama());
            System.out.println("  Kelas : " + Tampilan.get(i).getKelas());
             
        }
    }
    public void tambahData() {
        final Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.print("NIM: "); final String NIM = scan.nextLine();
        System.out.print("Nama: "); final String Nama = scan.nextLine();
        System.out.print("Kelas: "); final String Kelas = scan.nextLine();
        System.out.print("Alamat: "); final String Alamat = scan.nextLine();
        funtion.addData(new Data(NIM, Nama, Kelas, Alamat));
    }
        
    


    public void ubahData() {
        final Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.print("id data yang akan diubah: "); final int id = Integer.parseInt(scan.nextLine());
        System.out.println("---------------------------------------");
        System.out.print("NIM : "); final String NIM = scan.nextLine();
        System.out.print("Nama : "); final String Nama = scan.nextLine();
        System.out.print("Kelas : "); final String Kelas = scan.nextLine();
        System.out.print("Alamat : "); final String Alamat = scan.nextLine();
        funtion.editData(new Data(NIM, Nama, Kelas, Alamat), id-1);
    }

    public void hapusData() {
        final Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.print("id data yang akan dihapus: "); final int id = Integer.parseInt(scan.nextLine());
        funtion.deleteData(id-1);
    }

    public void tampilMenu() {
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("APLIKASI DATA MAHASISWA");
        System.out.println("---------------------------------------");
        System.out.println("Menu :");
        System.out.println("1. Lihat Data");
        System.out.println("2. Tambah Data");
        System.out.println("3. Ubah Data");
        System.out.println("4. Hapus Data");
        System.out.println("5. Keluar");
        System.out.print("Pilihan : ");
    }
    
}
