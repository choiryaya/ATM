/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes_atm;

/**
 *
 * @author choiryaya
 */
import java.util.Scanner;
public class Tubes_ATM {
    static int saldo = 10000000;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String jawaban;
        int pin = 12345;
        int coba=1;
       Tubes_ATM.masukanpin(pin);
    }
  private static void masukanpin(int pin) {
      Scanner input = new Scanner(System.in);
        int coba=1;
        do{
            System.out.println("MASUKKAN PIN");
            pin = input.nextInt();
             if(pin == 12345){
                        String x = Tubes_ATM.pinbenar(pin);
                        coba = 3;
                    }
                else{
                    System.out.println("MAAF PIN SALAH");
                    }
            coba++;
                    }
        while(coba<=3);
               

    }   
    private static String pinbenar(int pin) {
               String pinbenar = " ";
            Scanner input = new Scanner(System.in);
            int transfer = 0,tarik = 0,rekening;
            int pilih;
         
            
            if(pin==12345){
                System.out.println("PILIH TRANSAKSI YANG DIINGINKAN: \n 1. TRANSFER \n 2. TARIK \n 3. CEK SALDO");
                System.out.println("-------------------------------");
                System.out.print("PILIH NO: "); pilih = input.nextInt();
                System.out.println("-------------------------------");
                
                    switch(pilih){
                        
                        case 1:
                            System.out.println(" Masukkan nomor Rekening tujuan");
                            System.out.print("    "); rekening = input.nextInt();
                            System.out.println("-------------------------------");
                            System.out.println("      Masukkan jumlah uang");
                            System.out.println("--------------****-------------");
                            System.out.print("           Rp."); transfer = input.nextInt();
                            System.out.println("--------------****-------------");
                            if(transfer<=saldo){
                                saldo -= transfer;
                            System.out.println("      | Transaksi berhasil |");
                            System.out.println("saldo terakhir " + saldo);
                            }
                            else{
                                System.out.println("*Saldo anda tidak mencukupi");
                            }
                            Tubes_ATM.keputusan();
                        break;
                        case 2:
                            System.out.println("      Masukkan jumlah uang");
                            System.out.println("--------------****-------------");
                            System.out.print("           Rp."); tarik = input.nextInt();
                            System.out.println("--------------****-------------");
                            if(tarik<=saldo){
                                saldo -=tarik;
                                System.out.println("      | Transaksi berhasil |");
                            System.out.println("saldo terakhir " + saldo);
                            
                            }
                            else{
                                System.out.println("*Saldo anda tidak mencukupi");
                            }
                            Tubes_ATM.keputusan();
                        break;
                        case 3:
                            saldo-= tarik+transfer;
                            System.out.println("saldo terakhir " + saldo);
                            Tubes_ATM.keputusan();
                        break;
                                }
        }
            return pinbenar;
            
    }

    private static void keputusan() {
        int pin = 12345;
         Scanner input = new Scanner(System.in);
         String jawaban;
         System.out.print("apakah anda ingin melanjutkan transaksi lagi(y/n)");
         jawaban = input.next();    
         if(jawaban.equals("y")){            
        Tubes_ATM.masukanpin(pin);
        }
    }
    
}