/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_pertemuanPertama;

/**
 *
 * @author Lenovo IP 330-14IKB
 */
public class Burung extends Hewan {

    public static void main(String[] args) {
        Burung p = new Burung();
        p.setJumlahKaki(2);
        p.setWarnaBulu("Abu-abu");
        p.setJumlahSayap(2);
        System.out.println("Jumlah Kaki : " + p.getJumlahKaki());
        System.out.println("Warna Bulu : " + p.getWarnaBulu());
        System.out.println("Jumlah Sayap : " + p.getJumlahSayap());

    }
}
