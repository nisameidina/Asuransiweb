package model;
// Generated Apr 13, 2018 1:39:18 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Nasabah generated by hbm2java
 */
public class Nasabah  implements java.io.Serializable {


     private long noPolis;
     private Admin admin;
     private String ktp;
     private String nmNasabah;
     private Date tglLahir;
     private String status;
     private String pekerjaan;
     private String penghasilan;
     private String alamat;
     private Set<Pembayaran> pembayarans = new HashSet<Pembayaran>(0);

    public Nasabah() {
    }

	
    public Nasabah(long noPolis) {
        this.noPolis = noPolis;
    }
    public Nasabah(long noPolis, Admin admin, String ktp, String nmNasabah, Date tglLahir, String status, String pekerjaan, String penghasilan, String alamat, Set<Pembayaran> pembayarans) {
       this.noPolis = noPolis;
       this.admin = admin;
       this.ktp = ktp;
       this.nmNasabah = nmNasabah;
       this.tglLahir = tglLahir;
       this.status = status;
       this.pekerjaan = pekerjaan;
       this.penghasilan = penghasilan;
       this.alamat = alamat;
       this.pembayarans = pembayarans;
    }
   
    public long getNoPolis() {
        return this.noPolis;
    }
    
    public void setNoPolis(long noPolis) {
        this.noPolis = noPolis;
    }
    public Admin getAdmin() {
        return this.admin;
    }
    
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    public String getKtp() {
        return this.ktp;
    }
    
    public void setKtp(String ktp) {
        this.ktp = ktp;
    }
    public String getNmNasabah() {
        return this.nmNasabah;
    }
    
    public void setNmNasabah(String nmNasabah) {
        this.nmNasabah = nmNasabah;
    }
    public Date getTglLahir() {
        return this.tglLahir;
    }
    
    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public String getPekerjaan() {
        return this.pekerjaan;
    }
    
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
    public String getPenghasilan() {
        return this.penghasilan;
    }
    
    public void setPenghasilan(String penghasilan) {
        this.penghasilan = penghasilan;
    }
    public String getAlamat() {
        return this.alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public Set<Pembayaran> getPembayarans() {
        return this.pembayarans;
    }
    
    public void setPembayarans(Set<Pembayaran> pembayarans) {
        this.pembayarans = pembayarans;
    }




}

