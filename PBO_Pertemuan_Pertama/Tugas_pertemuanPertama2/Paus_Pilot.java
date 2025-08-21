/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_pertemuanPertama2;

/**
 *
 * @author Lenovo IP 330-14IKB
 */
public class Paus_Pilot extends Mamalia {

    public static void main(String[] args) {
        Mamalia Paus_Pilot = new Paus_Pilot();
        Paus_Pilot.setJumlahKaki(0);
        Paus_Pilot.setWarnaKulit("Hitam");
        Paus_Pilot.setJumlahMata(2);
        System.out.println("Jumlah Kaki : " + Paus_Pilot.getJumlahKaki());
        System.out.println("Warna Kulit : " + Paus_Pilot.getWarnaKulit());
        System.out.println("Jumlah Mata : " + Paus_Pilot.getJumlahMata());
    }
}
