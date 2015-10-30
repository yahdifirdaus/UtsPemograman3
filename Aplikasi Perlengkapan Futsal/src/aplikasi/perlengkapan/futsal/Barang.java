/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.perlengkapan.futsal;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author seven
 */
@Entity
@Table(name = "barang", catalog = "futsal", schema = "")
@NamedQueries({
    @NamedQuery(name = "Barang.findAll", query = "SELECT b FROM Barang b"),
    @NamedQuery(name = "Barang.findByKodeBarang", query = "SELECT b FROM Barang b WHERE b.kodeBarang = :kodeBarang"),
    @NamedQuery(name = "Barang.findByNamaBarang", query = "SELECT b FROM Barang b WHERE b.namaBarang = :namaBarang"),
    @NamedQuery(name = "Barang.findByStok", query = "SELECT b FROM Barang b WHERE b.stok = :stok"),
    @NamedQuery(name = "Barang.findByHarga", query = "SELECT b FROM Barang b WHERE b.harga = :harga")})
public class Barang implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode_barang")
    private String kodeBarang;
    @Basic(optional = false)
    @Column(name = "nama_barang")
    private String namaBarang;
    @Basic(optional = false)
    @Column(name = "stok")
    private int stok;
    @Basic(optional = false)
    @Column(name = "harga")
    private int harga;

    public Barang() {
    }

    public Barang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public Barang(String kodeBarang, String namaBarang, int stok, int harga) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.harga = harga;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        String oldKodeBarang = this.kodeBarang;
        this.kodeBarang = kodeBarang;
        changeSupport.firePropertyChange("kodeBarang", oldKodeBarang, kodeBarang);
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        String oldNamaBarang = this.namaBarang;
        this.namaBarang = namaBarang;
        changeSupport.firePropertyChange("namaBarang", oldNamaBarang, namaBarang);
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        int oldStok = this.stok;
        this.stok = stok;
        changeSupport.firePropertyChange("stok", oldStok, stok);
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        int oldHarga = this.harga;
        this.harga = harga;
        changeSupport.firePropertyChange("harga", oldHarga, harga);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodeBarang != null ? kodeBarang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Barang)) {
            return false;
        }
        Barang other = (Barang) object;
        if ((this.kodeBarang == null && other.kodeBarang != null) || (this.kodeBarang != null && !this.kodeBarang.equals(other.kodeBarang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aplikasi.perlengkapan.futsal.Barang[ kodeBarang=" + kodeBarang + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
