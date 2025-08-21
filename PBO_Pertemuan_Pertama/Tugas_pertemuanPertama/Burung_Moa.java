/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_pertemuanPertama;

/**
 *
 * @author Lenovo IP 330-14IKB
 */
public class Burung_Moa extends Burung {

    public static void main(String[] args) {
        Burung Moa = new Burung();
        Moa.setJumlahKaki(2);
        Moa.setWarnaBulu("Abu-abu");
        Moa.setJumlahSayap(0);
        System.out.println("Jumlah Kaki : " + Moa.getJumlahKaki());
        System.out.println("Warna Bulu : " + Moa.getWarnaBulu());
        System.out.println("Jumlah Sayap : " + Moa.getJumlahSayap());

    }
}
