package rentalmobil;

import java.sql.ResultSet;

public class Pelanggan {
    private String id; 
    private String nama; 
    private String alamat; 
    private String cp; 
    private String username;
    private String password;
    private String kode;
    
    public Pelanggan(){ }
    
    public String getId(){ 
        return id; 
    } 
    
    public String getNama(){ 
        return nama; 
    }
    
    public String getAlamat(){ 
        return alamat; 
    }
    
    public String getCp(){ 
        return cp; 
    }
    
    public String getUsername(){ 
        return username; 
    } 
    
    public String getPassword(){ 
        return password; 
    } 
    
    public String getKode(){ 
        return kode; 
    } 
    
    public void setId(String id){ 
    this.id = id; 
    
    } 
    
    public void setNama(String nama){ 
        this.nama = nama; 
    } 
    
    public void setAlamat(String alamat){ 
        this.alamat = alamat; 
    } 
    
    public void setCp(String cp){ 
        this.cp = cp; 
    } 
    
    public void setUsername(String username){ 
        this.username = username; 
    } 
    
    public void setPassword(String password){ 
        this.password = password; 
    } 
    
    public void setKode(String kode){ 
        this.kode = kode; 
    } 
    
    public void insertPelanggan() {
        Koneksi kon = new Koneksi();
        String s = "insert into user values ('" + this.id + "', '"+this.nama+"', '"+this.alamat+"', '"+this.cp+"', '"+this.username+"', '"+this.password+"', '2')";
        kon.query(s);
    }
    public void updatePelanggan() {
        Koneksi kon = new Koneksi();
        String s = "update user set nama  = '"+this.nama+"', cp = '"+this.cp+"', alamat = '"+
                this.alamat+"', username ='"+this.username+"', password = '"+
                this.password+"', kode = '"+this.kode+"' where id_user = '"+this.id+"'";
        kon.query(s);
    }
    public void deletePelanggan() {
        Koneksi kon = new Koneksi();
        String s = "delete from user where id_user = '"+this.id+"'";
        kon.query(s);
    }
    public ResultSet getPelanggan() {
        ResultSet r = null;
        Koneksi kon = new Koneksi();
        String s = "insert into user values ('" + this.id + "', '"+this.nama+
                "', '"+this.alamat+"', '"+this.cp+"', '"+this.username+"','"+this.password+"', '1')";
        kon.query(s);
        return r;
    }
}
