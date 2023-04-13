
package posttest6;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class TokoSepatu extends TokoBaju implements barang {
     private final String kodeTS = "TS";
    private long noKodeTS;
    
    TokoSepatu(String namaJry, String ukuran, int stokAwal, int stokMasuk, int stokKeluar, int hargaBeli, int hargaJual, long noKodeJry){
        super(namaJry,ukuran,stokAwal,stokMasuk,stokKeluar,hargaBeli,hargaJual,noKodeJry);
    }
    
    TokoSepatu() {
        //UNTUK MENGATASI EROR DI MAIN
    }
    
    TokoSepatu TS;
    ArrayList<TokoBaju> TSList = new ArrayList<>();
    InputStreamReader isr = new InputStreamReader (System.in);
    BufferedReader br = new BufferedReader(isr);
    Scanner inp = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    
    @Override
    public void tambahBarang(){
        boolean ulang=true;
        System.out.println("\t|==================================================|");
        System.out.println("\t|               TAMBAH DATA SEPATU                 |");
        System.out.println("\t|==================================================|");
        System.out.print("Nama Sepatu : ");
        namaJry = inp.nextLine();
        System.out.print("ukuran : ");
        ukuran = inp.nextLine();
        System.out.print("Stok Awal  : ");
        stokAwal = inputInt.nextInt();
        System.out.print("Stok Masuk  : ");
        stokMasuk = inputInt.nextInt();
        System.out.print("Stok Keluar  : ");
        stokKeluar = inputInt.nextInt();

        while(ulang){
            System.out.print("Harga Beli Sepatu [ukuran] : ");
            String strHargaBeli=inp.nextLine();
            System.out.print("Harga Jual Sepatu [ukuran] : ");
            String strHargaJual=inp.nextLine();
            if (strHargaJual.equals("0")){
                System.err.println("Data Ini Tidak Boleh Bernilai 0");
            }else if(strHargaBeli.equals("0")){
                System.err.println("Data Ini Tidak Boleh Bernilai 0");
            }
            else{
                try{
                    hargaBeli = (Integer.parseInt(strHargaBeli));
                    hargaJual = (Integer.parseInt(strHargaJual));
                    noKodeJry++;
                    System.out.println("No Kode Barang : " + kodeTS + noKodeTS);
                    TS = new TokoSepatu(namaJry, ukuran, stokAwal, stokMasuk, stokKeluar, hargaBeli, hargaJual, noKodeJry); // OBJEK ke - 1
                    TSList.add(TS);
                    System.out.println("\n>> Tambah Data Sepatu Berhasil <<");
                    ulang=false;
                }catch(NumberFormatException e){
                    System.err.println("Data Yang anda masukkan tidak sesuai");
                }
            }
        }
    }
    
    @Override
    public void tampilBarang(){
        System.out.println("\t|==================================================|");
        System.out.println("\t|               TAMPIL DATA SEPATU                 |");
        System.out.println("\t|==================================================|");
        for (int i=0; i<TSList.size(); i++){
            System.out.println("|===============================================================|");
            System.out.println("\tNo Kode Sepatu : " + kodeTS + TSList.get(i).getNoKodeJry());
            System.out.println("\tNama Sepatu : " + TSList.get(i).getNamaJry());
            System.out.println("\tJenis ukuran : " + TSList.get(i).getukuran());
            System.out.println("\tStok Awal : " + TSList.get(i).getStokAwal());
            System.out.println("\tStok Masuk : " + TSList.get(i).getStokMasuk());
            System.out.println("\tStok Keluar : " + TSList.get(i).getStokKeluar());
            System.out.println("\tStok Akhir : " + (TSList.get(i).getStokAwal()+TSList.get(i).getStokMasuk()-TSList.get(i).getStokKeluar()));
            System.out.println("\tHarga Beli Sepatu [ukuran] : Rp" + TSList.get(i).hargaBeli);
            System.out.println("\tHarga Jual Sepatu [ukuran] : Rp" + TSList.get(i).hargaJual);
            System.out.println("|===============================================================|");
            System.out.println(" ");
        }
    }
    
    @Override
    public ArrayList<TokoBaju> ubahBarang(ArrayList<TokoBaju> Jrylist) {
        int ubah;
        System.out.println("\t|==================================================|");
        System.out.println("\t|                  UBAH DATA SEPATU               |");
        System.out.println("\t|==================================================|");
        for (int i=0; i<TSList.size(); i++){
            System.out.println("No Kode Barang : " + kodeTS +
            TSList.get(i).getNoKodeJry());
            System.out.println("Nama Sepatu : " + TSList.get(i).getNamaJry());
            System.out.println(" ");
        }
        if (TSList.size() == 1){
            ubah = 0;
        } else {
            System.out.print("\nInput No Kode untuk Mengubah Data [Input Angka Saja] : ");
            ubah = inputInt.nextInt();
            ubah--;
        }
        System.out.print("\nUbah Nama Sepatu : ");
        TSList.get(ubah).namaJry = (inp.nextLine());
        System.out.print("Ubah Jenis ukuran : ");
        TSList.get(ubah).ukuran = (inp.nextLine());
        System.out.print("Ubah Stok Awal : ");
        TSList.get(ubah).stokAwal = (inp.nextInt());
        System.out.print("Ubah Stok Masuk : ");
        TSList.get(ubah).stokMasuk = (inp.nextInt());
        System.out.print("Ubah Stok Keluar : ");
        TSList.get(ubah).stokKeluar = (inp.nextInt());
        System.out.print("Ubah Harga Beli Sepatu [ukuran] : ");
        TSList.get(ubah).hargaBeli = (inp.nextInt());
        System.out.print("Ubah Harga Jual Sepatu [ukuran] : ");
        TSList.get(ubah).hargaJual = (inp.nextInt());
        System.out.println("\n>> Data Sepatu Berhasil Di Ubah <<\n");

        return TSList;
    }
    
    @Override
    public ArrayList<TokoBaju> hapusBarang(ArrayList<TokoBaju> TSlist) {
        System.out.println("\t|==================================================|");
        System.out.println("\t|               HAPUS DATA SEPATU                  |");
        System.out.println("\t|==================================================|");
        for (int i=0; i<TSList.size(); i++){
            System.out.println("No Kode Sepatu : " + kodeTS +
            TSList.get(i).getNoKodeJry());
            System.out.println("Nama Sepatu : " + TSList.get(i).getNamaJry());
            System.out.println(" ");
        }
        int hapus;
        System.out.print("\nMasukan No Kode untuk Hapus Data Sepatu [Input Angka Belakang] : ");
        hapus = inputInt.nextInt();
        hapus--;
        TSList.remove(hapus);
        System.out.println("\n>> Data Sepatu Berhasil di Hapus <<\n");
        return TSList;
    }
   
 
    
    @Override
    public String getNamaJry(){
        return "NikeCR";
    }
    @Override
    public String getukuran(){
        return "41";
}
}
