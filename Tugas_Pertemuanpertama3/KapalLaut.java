/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pertemuanpertama3;

/**
 *
 * @author Lenovo IP 330-14IKB
 */
public class KapalLaut extends KendaraanLaut {
    
    public static void main(String[] args) {
        KapalLaut p = new KapalLaut();
        p.setJumlahBalingBaling(2);
        p.setWarnaKendaraan("Putih");
        p.setJenisMuatan("Manusia");
        System.out.println("Jumlah Baling-Baling : " +p.getJumlahBalingBaling());
        System.out.println("Warna Kendaraan : " +p.getWarnaKendaraan());
        System.out.println("Jenis Muatan : " +p.getJenisMuatan());
    }
}
