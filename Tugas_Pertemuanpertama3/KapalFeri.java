/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pertemuanpertama3;

/**
 *
 * @author Lenovo IP 330-14IKB
 */
public class KapalFeri extends KapalLaut{
    
    public static void main(String[] args) {
        KapalLaut KapalFeri = new KapalLaut();
        KapalFeri.setJumlahBalingBaling(2);
        KapalFeri.setWarnaKendaraan("Hitam");
        KapalFeri.setJenisMuatan("Manusia dan Kendaraan Darat");
        System.out.println("Jumlah Baling-Baling : " +KapalFeri.getJumlahBalingBaling());
        System.out.println("Warna Kendaraan : " +KapalFeri.getWarnaKendaraan());
        System.out.println("Jenis Muatan : " +KapalFeri.getJenisMuatan());
    }
}
