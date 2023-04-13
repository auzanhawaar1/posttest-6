
package posttest6;

//import java.io.IOException;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;


public class menu {
    static String option, admin;
    static Scanner input = new Scanner(System.in);
    static Jersey Jry = new Jersey();//OBJEK
    static ArrayList<TokoBaju> JryList;//ARRAYLIST
    static TokoSepatu TS = new TokoSepatu();//OBJEK
    static ArrayList<TokoBaju> TSList;//ARRAYLIST
    
    public static void menu (boolean admin1) throws IOException{
        Boolean ulang,ulang2;
        System.out.println("|==================================================================|");
        System.out.println("|                  SELAMAT DATANG DI APLIKASI JERSEY               |");
        System.out.println("|==================================================================|");
        ulang = true;
        while (ulang) {
            menuPertama();
            switch (option) {
                case "1":
                ulang2=true;
                while(ulang2){
                menuKedua();
                    switch (admin){
                        case "1":
                            Jry.tambahBarang();
                            break;
                        case "2":
                            Jry.tampilBarang();
                            break;
                        case "3":
                            Jry.ubahBarang(JryList);
                            break;
                        case "4":
                            Jry.hapusBarang(JryList);
                            break;
                        case "5":
                            ulang2=false;
                            break;
                        case "6":
                            System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                            System.exit(0);
                        default:
                            System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                            break;
                    }
                }
                break;
                case "2":
                ulang2=true;
                while(ulang2){
                menuKetiga();
                    switch (admin){
                        case "1":
                            TS.tambahBarang();
                            break;
                        case "2":
                            TS.tampilBarang();
                            break;
                        case "3":
                            TS.ubahBarang(TSList);
                            break;
                        case "4":
                            TS.hapusBarang(TSList);
                            break;
                        case "5":
                            ulang2=false;
                            break;
                        case "6":
                            System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                            System.exit(0);
                        default:
                            System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                            break;
                    }
                }
                break;
                case "3":
                    System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                    System.exit(0);

                default:
                System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                break;
            }
        } 
    }
    public static String menuKedua (){
        System.out.println();
        System.out.println("\t|==================================================|");
        System.out.println("\t|           PROGRAM PENDATAAN JERSEY              |");
        System.out.println("\t|==================================================|");
        System.out.println("\t|                  PILIH MENU                      |");
        System.out.println("\t|==================================================|");
        System.out.println("\t|                                                  |");
        System.out.println("\t|                 1. TAMBAH DATA JERSEY            |");
        System.out.println("\t|                 2. TAMPIL DATA JERSEY            |");
        System.out.println("\t|                 3. UBAH DATA JERSEY              |");
        System.out.println("\t|                 4. DELETE DATA JERSEY            |");
        System.out.println("\t|                 5. KEMBALI KE MENU AWAL          |");
        System.out.println("\t|                 6. EXIT PROGRAM                  |");
        System.out.println("\t|==================================================|");
        System.out.print("Masukan Pilihan menu : ");
        admin = input.nextLine();
        return admin;
    }
    
     public static String menuKetiga (){
        System.out.println();
        System.out.println("\t|==================================================|");
        System.out.println("\t|            PROGRAM PENDATAAN SEPATU              |");
        System.out.println("\t|==================================================|");
        System.out.println("\t|==================================================|");
        System.out.println("\t|                  TOKO SEPATU                     |");
        System.out.println("\t|==================================================|");
        System.out.println("\t|                  PILIH MENU                      |");
        System.out.println("\t|==================================================|");
        System.out.println("\t|                                                  |");
        System.out.println("\t|                 1. TAMBAH DATA SEPATU            |");
        System.out.println("\t|                 2. TAMPIL DATA SEPATU            |");
        System.out.println("\t|                 3. UBAH DATA SEPATU              |");
        System.out.println("\t|                 4. DELETE DATA SEPATU            |");
        System.out.println("\t|                 5. KEMBALI KE MENU AWAL          |");
        System.out.println("\t|                 6. EXIT PROGRAM                  |");
        System.out.println("\t|==================================================|");
        System.out.print("Masukan Pilihan menu : ");
        admin = input.nextLine();
        return admin;
    }
    
    public static String menuPertama (){
      System.out.println();
      System.out.println("\t|==================================================|");
      System.out.println("\t|         PROGRAM PENDATAAN JERSEY                 |");
      System.out.println("\t|==================================================|");
      System.out.println("\t|                PILIH MENU                        |");
      System.out.println("\t|==================================================|");
      System.out.println("\t|                                                  |");
      System.out.println("\t|           1. TOKO BAJU                          |");
      System.out.println("\t|           2. TOKO SEPATU                         |");
      System.out.println("\t|           3. EXIT PROGRAM                        |");
      System.out.println("\t|==================================================|");
      System.out.print("Masukan Pilihan menu : ");
      option = input.nextLine();
      return option;
    }


public static void main(String[] args) throws IOException  {
        Scanner inp = new Scanner(System.in);
        Login User = new Login(); //OBJEK KE - 2
        System.out.println("|==================================================================|");
        System.out.println("|    SELAMAT DATANG DI APLIKASI PENDATAAN TOKO JERSEY              |");
        System.out.println("|==================================================================|");
        System.out.println("\t|==================================================|");
        System.out.println("\t|          SILAHKAN LOGIN TERLEBIH DAHULU          |");
        System.out.println("\t|==================================================|");
        System.out.print("\t Username : ");
        String uname = input.nextLine();
        System.out.print("\t Password : ");
        String pass = input.nextLine();
        System.out.println("\t|==================================================|");
        boolean admin;

        while(!uname.equals(User.getUsername()) || !pass.equals(User.getPassword())){
            System.err.println("Username atau Password anda salah ");
            System.err.print("\nUsername :");
            uname = input.nextLine();
            System.err.print("\nPassword : ");
            pass = input.nextLine();
        }
        
       admin = true;
       
       menu(admin);
    }
}
