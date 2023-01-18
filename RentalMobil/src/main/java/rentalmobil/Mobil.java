package rentalmobil;

import java.sql.ResultSet;

public class Mobil {
    private String id;
    private String jenis;
    private String sewa;
    private String stok;
    public Mobil() {}
    public String getId() {
        return id;
    }
    public String getJenis() {
        return jenis;
    }
    public String getSewa() {
        return sewa;
    }
    public String getStok() {
        return stok;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public void setSewa(String sewa) {
        this.sewa = sewa;
    }
    public void setStok(String stok) {
        this.stok = stok;
    }
    public void insertMobil() {
        Koneksi kon = new Koneksi();
        String s = "insert into mobil values ('" + this.id + "', '"+this.jenis+"', '"+this.sewa+"', '"+this.stok+"')";
        kon.query(s);
    }
    public void updateMobil() {
        Koneksi kon = new Koneksi();
        String s = "update mobil set jenis = '"+ this.jenis+"', sewa = '"+this.sewa+"', stok = '"+this.stok+"' where id_mobil ='"+this.id+"'";
        kon.query(s);
    }
    public void deleteMobil() {
        Koneksi kon = new Koneksi();
        String s = "delete from mobil where id_mobil = '"+this.id+"'";
        kon.query(s);
    }
    public ResultSet getMobil() {
        ResultSet r = null;
        Koneksi kon = new Koneksi();
        String s = "insert into mobil values ('" + this.id + "', '"+this.jenis+"', '"+this.sewa+"', '"+this.stok+"')";
        kon.query(s);
        return r;
    }

}