/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biodata;

/**
 *
 * @author lenovo
 */
import javax.swing.*;
public class Biodata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("------------------");
        System.out.println("Biodata Mahasiswa");
        System.out.println("STMIK MERCUSUAR");
        System.out.println("TAHUN 2014-2015 ");
        System.out.println("------------------");
        
        String Entry_Data =JOptionPane.showInputDialog("Masukkan NIM :");
        System.out.println("NIM="+Entry_Data);
        String Entry_Data2 =JOptionPane.showInputDialog("Masukkan Nama :");
        System.out.println("Nama="+Entry_Data2);
        String Entry_Data3 =JOptionPane.showInputDialog("Masukkan Jenjang :");
        System.out.println("Jenjang="+Entry_Data3);
        String Entry_Data4 =JOptionPane.showInputDialog("Masukkan Jurusan :");
        System.out.println("Jurusan="+Entry_Data4);
        String Entry_Data5 =JOptionPane.showInputDialog("Masukkan Alamat :");
        System.out.println("Alamat="+Entry_Data5);
        String Entry_Data6 =JOptionPane.showInputDialog("Masukkan Jenkel :");
        System.out.println("Jenkel="+Entry_Data6);
        String Entry_Data7 =JOptionPane.showInputDialog("masukkan Tempat Lahir :");
        System.out.println("TempatLahir="+Entry_Data7);
        String Entry_Data8 =JOptionPane.showInputDialog("Masukkan Tanggal Lahir  :");
        System.out.println("TanggalLahir="+Entry_Data8);
        String Entry_Data9 =JOptionPane.showInputDialog("Masukkan Hobi :");
        System.out.println("Hobi="+Entry_Data9);
        String Entry_Data10 =JOptionPane.showInputDialog("Masukkan No.Telp :");
        System.out.println("No.Telp="+Entry_Data10);
        String Entry_Data11 =JOptionPane.showInputDialog("Masukkan Pekerjaan :");
        System.out.println("Pekerjaan="+Entry_Data11);
        JOptionPane.showMessageDialog (null, "Pengisian Biodata Sukses ! Terimakasih.. ");
    }
    
}
