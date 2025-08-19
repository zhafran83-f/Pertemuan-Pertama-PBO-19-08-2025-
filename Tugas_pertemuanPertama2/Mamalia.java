/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_pertemuanPertama2;

/**
 *
 * @author Lenovo IP 330-14IKB
 */
public class Mamalia extends Hewan2 {

    public static void main(String[] args) {
        Mamalia p = new Mamalia();
        p.setJumlahKaki(4);
        p.setWarnaKulit("Hitam");
        p.setJumlahMata(2);
        System.out.println("Jumlah Kaki : " + p.getJumlahKaki());
        System.out.println("Warna Kulit : " + p.getWarnaKulit());
        System.out.println("Jumlah Mata : " + p.getJumlahMata());
    }
}
