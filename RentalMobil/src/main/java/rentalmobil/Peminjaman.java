package rentalmobil;

import java.sql.ResultSet;

public class Peminjaman {
  private String peminjaman;
  private String pelanggan;
  private String mobil;
  private String jenisMobil;
  private String petugas;
  private String ptanggal;
  private String pbulan;
  private String ptahun;
  private String lama;
  private String ktahun;
  private String biaya;
  private String telat;
  private String denda;
  
  public Peminjaman() {}
  
  public String getPem() {
    return peminjaman;
  }
  
  public String getPel() {
    return pelanggan;
  }
  
  public String getMobil() {
    return mobil;
  }
  
  public String getJenisMobil() {
    return jenisMobil;
  }
  
  public String getPetugas() {
    return petugas;
  }
  
  public String getPtanggal() {
    return ptanggal;
  }
  
  public String getPbulan() {
    return pbulan;
  }
  
  public String getPtahun() {
    return ptahun;
  }
  
  public String getLama() {
    return lama;
  }
  
  public String getKtahun() {
    return ktahun;
  }
  
  public String getBiaya() {
    return biaya;
  }
    
  public String getTelat() {
    return telat;
  }
    
  public String getDenda() {
    return denda;
  }
  
  public void setPeminjaman(String peminjaman) {
    this.peminjaman = peminjaman;
  }
  public void setPelanggan(String pelanggan) {
    this.pelanggan = pelanggan;
  }
  public void setMobil(String mobil) {
    this.mobil = mobil;
  }
  public void setJenisMobil(String jenisMobil) {
    this.jenisMobil = jenisMobil;
  }
  public void setPetugas(String petugas) {
    this.petugas = petugas;
  }
  public void setPtanggal(String ptanggal) {
    this.ptanggal = ptanggal;
  }
  public void setPbulan(String pbulan) {
    this.pbulan = pbulan;
  }
  public void setPtahun(String ptahun) {
    this.ptahun = ptahun;
  }
  public void setLama(String lama) {
    this.lama = lama;
  }
  public void setKtahun(String ktahun) {
    this.ktahun = ktahun;
  }
  
  public void setBiaya(String biaya) {
    this.biaya = biaya;
  }
  
  public void setTelat(String telat) {
    this.telat = telat;
  }
  
  public void setDenda(String denda) {
    this.denda = denda;
  }

  public void insertPeminjaman() {
    Koneksi kon = new Koneksi();
    String s = "insert into peminjaman values('" + this.peminjaman+
            "', '"+this.pelanggan+"', '" + this.mobil + "', '"+ this.jenisMobil + "', '"+this.petugas+
            "', '"+this.ptahun+"-"+this.pbulan+"-"+this.ptanggal+
            "', '"+this.ktahun+"', '"+this.lama+"', '0', '"+this.biaya+"', '0')"; 
    kon.query(s);
  }
  public void updatePeminjaman() {
    Koneksi kon = new Koneksi();
    String s = "update peminjaman set telat = '" + this.telat +
            "', denda = '"+this.denda+"' where id_peminjaman = '"+this.peminjaman+"'";
    kon.query(s);
  }
  public void deletePeminjaman() {
    Koneksi kon = new Koneksi();
    String s = "delete from peminjaman where id_peminjaman = '"+this.peminjaman+"'";
    kon.query(s);
  }
  public ResultSet getPeminjaman() {
    ResultSet r = null;
    Koneksi kon = new Koneksi();
    String s = "insert into peminjaman values ( '" + this.peminjaman +
            "', '"+this.pelanggan+"', '"+this.mobil+"','" + this.jenisMobil + "', '"+
            this.petugas+"', ' " + this.ptahun+"-" +
            this.pbulan+"-"+this.ptanggal+" ', '" + this.ktahun +
            "', '" + this.lama + "', '0', '" + this.biaya + "', '0')";
    kon.query(s);
    return r;
  }
}