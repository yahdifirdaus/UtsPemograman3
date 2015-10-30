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
@Table(name = "pembayaran", catalog = "futsal", schema = "")
@NamedQueries({
    @NamedQuery(name = "Pembayaran_1.findAll", query = "SELECT p FROM Pembayaran_1 p"),
    @NamedQuery(name = "Pembayaran_1.findByKodePenjualan", query = "SELECT p FROM Pembayaran_1 p WHERE p.kodePenjualan = :kodePenjualan"),
    @NamedQuery(name = "Pembayaran_1.findByHargaBarang", query = "SELECT p FROM Pembayaran_1 p WHERE p.hargaBarang = :hargaBarang"),
    @NamedQuery(name = "Pembayaran_1.findByJumlahBarang", query = "SELECT p FROM Pembayaran_1 p WHERE p.jumlahBarang = :jumlahBarang"),
    @NamedQuery(name = "Pembayaran_1.findByUang", query = "SELECT p FROM Pembayaran_1 p WHERE p.uang = :uang"),
    @NamedQuery(name = "Pembayaran_1.findByTotalBayar", query = "SELECT p FROM Pembayaran_1 p WHERE p.totalBayar = :totalBayar"),
    @NamedQuery(name = "Pembayaran_1.findByKembalian", query = "SELECT p FROM Pembayaran_1 p WHERE p.kembalian = :kembalian")})
public class Pembayaran_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode_penjualan")
    private String kodePenjualan;
    @Basic(optional = false)
    @Column(name = "harga_barang")
    private int hargaBarang;
    @Basic(optional = false)
    @Column(name = "jumlah_barang")
    private int jumlahBarang;
    @Basic(optional = false)
    @Column(name = "uang")
    private int uang;
    @Basic(optional = false)
    @Column(name = "total_bayar")
    private int totalBayar;
    @Basic(optional = false)
    @Column(name = "kembalian")
    private int kembalian;

    public Pembayaran_1() {
    }

    public Pembayaran_1(String kodePenjualan) {
        this.kodePenjualan = kodePenjualan;
    }

    public Pembayaran_1(String kodePenjualan, int hargaBarang, int jumlahBarang, int uang, int totalBayar, int kembalian) {
        this.kodePenjualan = kodePenjualan;
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
        this.uang = uang;
        this.totalBayar = totalBayar;
        this.kembalian = kembalian;
    }

    public String getKodePenjualan() {
        return kodePenjualan;
    }

    public void setKodePenjualan(String kodePenjualan) {
        String oldKodePenjualan = this.kodePenjualan;
        this.kodePenjualan = kodePenjualan;
        changeSupport.firePropertyChange("kodePenjualan", oldKodePenjualan, kodePenjualan);
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        int oldHargaBarang = this.hargaBarang;
        this.hargaBarang = hargaBarang;
        changeSupport.firePropertyChange("hargaBarang", oldHargaBarang, hargaBarang);
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        int oldJumlahBarang = this.jumlahBarang;
        this.jumlahBarang = jumlahBarang;
        changeSupport.firePropertyChange("jumlahBarang", oldJumlahBarang, jumlahBarang);
    }

    public int getUang() {
        return uang;
    }

    public void setUang(int uang) {
        int oldUang = this.uang;
        this.uang = uang;
        changeSupport.firePropertyChange("uang", oldUang, uang);
    }

    public int getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(int totalBayar) {
        int oldTotalBayar = this.totalBayar;
        this.totalBayar = totalBayar;
        changeSupport.firePropertyChange("totalBayar", oldTotalBayar, totalBayar);
    }

    public int getKembalian() {
        return kembalian;
    }

    public void setKembalian(int kembalian) {
        int oldKembalian = this.kembalian;
        this.kembalian = kembalian;
        changeSupport.firePropertyChange("kembalian", oldKembalian, kembalian);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodePenjualan != null ? kodePenjualan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pembayaran_1)) {
            return false;
        }
        Pembayaran_1 other = (Pembayaran_1) object;
        if ((this.kodePenjualan == null && other.kodePenjualan != null) || (this.kodePenjualan != null && !this.kodePenjualan.equals(other.kodePenjualan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aplikasi.perlengkapan.futsal.Pembayaran_1[ kodePenjualan=" + kodePenjualan + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
