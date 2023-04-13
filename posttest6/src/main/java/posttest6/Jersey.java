
package posttest6;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Jersey extends TokoBaju implements barang {
    private final String kodeJry = "Jry";
    private long noKodeJry;
    
    Jersey(String namaJry, String ukuran, int stokAwal, int stokMasuk, int stokKeluar, int hargaBeli, int hargaJual, long noKodeJry){
        super(namaJry,ukuran,stokAwal,stokMasuk,stokKeluar,hargaBeli,hargaJual,noKodeJry);
    }
    
    
    Jersey() {
        //UNTUK MENGATASI EROR DI MAIN
    }
    
    Jersey Jry;
    ArrayList<TokoBaju> JryList = new ArrayList<>();
    InputStreamReader isr = new InputStreamReader (System.in);
    BufferedReader br = new BufferedReader(isr);
    Scanner inp = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    
    
    @Override
    public void tambahBarang () {
        boolean ulang=true;
        System.out.println("\t|==================================================|");
        System.out.println("\t|                 TAMBAH JERSEY                    |");
        System.out.println("\t|==================================================|");
        System.out.print("Nama Jersey : ");
        namaJry = inp.nextLine();
        System.out.print("ukuran : ");
        ukuran = inp.nextLine();
        System.out.print("Stok Awal  : ");
        String strstokAwal=inp.nextLine();
        System.out.print("Stok Masuk  : ");
        String strstokMasuk=inp.nextLine();
        System.out.print("Stok Keluar  : ");
        String strstokKeluar=inp.nextLine();
        
        
        while(ulang){
            System.out.print("Harga Beli Jersey [ukuran] : ");
            String strHargaBeli=inp.nextLine();
            System.out.print("Harga Jual Jersey [ukuran] : ");
            String strHargaJual=inp.nextLine();
            if (strHargaJual.equals("0")){
                System.err.println("Data Ini Tidak Boleh Bernilai 0");
            }else if(strHargaBeli.equals("0")){
                System.err.println("Data Ini Tidak Boleh Bernilai 0");
            }
            else{
                try{
                    stokAwal = (Integer.parseInt(strstokAwal));
                    stokMasuk = (Integer.parseInt(strstokMasuk));
                    stokKeluar = (Integer.parseInt(strstokKeluar));
                    hargaBeli = (Integer.parseInt(strHargaBeli));
                    hargaJual = (Integer.parseInt(strHargaJual));
                    noKodeJry++;
                    System.out.println("No Kode Barang : " + kodeJry + noKodeJry);
                    Jry = new Jersey(namaJry, ukuran, stokAwal, stokMasuk, stokKeluar, hargaBeli, hargaJual, noKodeJry); // OBJEK ke - 1
                    JryList.add(Jry);
                    System.out.println("\n>> Tambah Data Jersey Berhasil <<");
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
        System.out.println("\t|                   TAMPIL JERSEY                  |");
        System.out.println("\t|==================================================|");
        for (int i=0; i<JryList.size(); i++){
            System.out.println("|===============================================================|");
            System.out.println("\tNo Kode Jersey : " + kodeJry + JryList.get(i).getNoKodeJry());
            System.out.println("\tNama Barang : " + JryList.get(i).getNamaJry());
            System.out.println("\tJenis ukuran : " + JryList.get(i).getukuran());
            System.out.println("\tStok Awal : " + JryList.get(i).getStokAwal());
            System.out.println("\tStok Masuk : " + JryList.get(i).getStokMasuk());
            System.out.println("\tStok Keluar : " + JryList.get(i).getStokKeluar());
            System.out.println("\tStok Akhir : " + (JryList.get(i).getStokAwal()+JryList.get(i).getStokMasuk()-JryList.get(i).getStokKeluar()));
            System.out.println("\tHarga Beli Jersey [ukuran] : Rp" + JryList.get(i).hargaBeli);
            System.out.println("\tHarga Jual Jersey [ukuran] : Rp" + JryList.get(i).hargaJual);
            System.out.println("|===============================================================|");
            System.out.println(" ");
        }
    }
    
    @Override
    public ArrayList<TokoBaju> ubahBarang(ArrayList<TokoBaju> Jrylist)  {
        int ubah;
        System.out.println("\t|==================================================|");
        System.out.println("\t|                     UBAH JERSEY                  |");
        System.out.println("\t|==================================================|");
        for (int i=0; i<JryList.size(); i++){
            System.out.println("No Kode Jersey : " + kodeJry +
            JryList.get(i).getNoKodeJry());
            System.out.println("Nama Jersey : " + JryList.get(i).getNamaJry());
            System.out.println(" ");
        }
        if (JryList.size() == 1){
            ubah = 0;
        } else {
            System.out.print("\nInput No Kode untuk Mengubah Data [Input Angka Saja] : ");
            ubah = inputInt.nextInt();
            ubah--;
        }
        System.out.print("\nUbah Nama Jersey : ");
        JryList.get(ubah).namaJry = (inp.nextLine());
        System.out.print("Ubah Jenis ukuran : ");
        JryList.get(ubah).ukuran = (inp.nextLine());
        System.out.print("Ubah Stok Awal : ");
        JryList.get(ubah).stokAwal = (inp.nextInt());
        System.out.print("Ubah Stok Masuk : ");
        JryList.get(ubah).stokMasuk = (inp.nextInt());
        System.out.print("Ubah Stok Keluar : ");
        JryList.get(ubah).stokKeluar = (inp.nextInt());
        System.out.print("Ubah Harga Beli Jersey [ukuran] : ");
        JryList.get(ubah).hargaBeli= (inp.nextInt());
        System.out.print("Ubah Harga Jual Jersey [ukuran] : ");
        JryList.get(ubah).hargaJual = (inp.nextInt());
        System.out.println("\n>> Data Jersey Berhasil Di Ubah <<\n");

        
        return JryList;
    }
    
    @Override
    public ArrayList<TokoBaju> hapusBarang(ArrayList<TokoBaju> Jrylist) {
        System.out.println("\t|==================================================|");
        System.out.println("\t|                   HAPUS JERSEY                   |");
        System.out.println("\t|==================================================|");
        for (int i=0; i<JryList.size(); i++){
            System.out.println("No Kode Jersey : " + kodeJry +
            JryList.get(i).getNoKodeJry());
            System.out.println("Nama Jersey : " + JryList.get(i).getNamaJry());
            System.out.println(" ");
        }
        int hapus;
        System.out.print("\nMasukan No Kode untuk Hapus Barang [Input Angka Belakang] : ");
        hapus = inputInt.nextInt();
        hapus--;
        JryList.remove(hapus);
        System.out.println("\n>> Data Jersey Berhasil di Hapus <<\n");
        return JryList;
    }
     @Override
    public String getNamaJry(){
        return "adidas";
    }
    @Override
    public String getukuran(){
        return "M";
    }


}

