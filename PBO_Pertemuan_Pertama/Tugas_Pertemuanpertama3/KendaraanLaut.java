/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_Pertemuanpertama3;

/**
 *
 * @author Lenovo IP 330-14IKB
 */
public class KendaraanLaut {

    /**
     * @return the jenisMuatan
     */
    protected String getJenisMuatan() {
        return jenisMuatan;
    }

    /**
     * @param jenisMuatan the jenisMuatan to set
     */
    protected void setJenisMuatan(String jenisMuatan) {
        this.jenisMuatan = jenisMuatan;
    }

    /**
     * @return the warnaKendaraan
     */
    protected String getWarnaKendaraan() {
        return warnaKendaraan;
    }

    /**
     * @param warnaKendaraan the warnaKendaraan to set
     */
    protected void setWarnaKendaraan(String warnaKendaraan) {
        this.warnaKendaraan = warnaKendaraan;
    }

    /**
     * @return the jumlahBalingBaling
     */
    protected int getJumlahBalingBaling() {
        return jumlahBalingBaling;
    }

    /**
     * @param jumlahBalingBaling the jumlahBalingBaling to set
     */
    protected void setJumlahBalingBaling(int jumlahBalingBaling) {
        this.jumlahBalingBaling = jumlahBalingBaling;
    }
    private int jumlahBalingBaling;
    private String warnaKendaraan;
    private String jenisMuatan;
}
