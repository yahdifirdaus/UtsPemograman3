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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author seven
 */
@Entity
@Table(name = "pelanggan", catalog = "futsal", schema = "")
@NamedQueries({
    @NamedQuery(name = "Pelanggan.findAll", query = "SELECT p FROM Pelanggan p"),
    @NamedQuery(name = "Pelanggan.findByKodePelanggan", query = "SELECT p FROM Pelanggan p WHERE p.kodePelanggan = :kodePelanggan"),
    @NamedQuery(name = "Pelanggan.findByNamaPelanggan", query = "SELECT p FROM Pelanggan p WHERE p.namaPelanggan = :namaPelanggan"),
    @NamedQuery(name = "Pelanggan.findByTelp", query = "SELECT p FROM Pelanggan p WHERE p.telp = :telp")})
public class Pelanggan implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode_pelanggan")
    private String kodePelanggan;
    @Basic(optional = false)
    @Column(name = "nama_pelanggan")
    private String namaPelanggan;
    @Basic(optional = false)
    @Lob
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @Column(name = "telp")
    private int telp;

    public Pelanggan() {
    }

    public Pelanggan(String kodePelanggan) {
        this.kodePelanggan = kodePelanggan;
    }

    public Pelanggan(String kodePelanggan, String namaPelanggan, String alamat, int telp) {
        this.kodePelanggan = kodePelanggan;
        this.namaPelanggan = namaPelanggan;
        this.alamat = alamat;
        this.telp = telp;
    }

    public String getKodePelanggan() {
        return kodePelanggan;
    }

    public void setKodePelanggan(String kodePelanggan) {
        String oldKodePelanggan = this.kodePelanggan;
        this.kodePelanggan = kodePelanggan;
        changeSupport.firePropertyChange("kodePelanggan", oldKodePelanggan, kodePelanggan);
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        String oldNamaPelanggan = this.namaPelanggan;
        this.namaPelanggan = namaPelanggan;
        changeSupport.firePropertyChange("namaPelanggan", oldNamaPelanggan, namaPelanggan);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        String oldAlamat = this.alamat;
        this.alamat = alamat;
        changeSupport.firePropertyChange("alamat", oldAlamat, alamat);
    }

    public int getTelp() {
        return telp;
    }

    public void setTelp(int telp) {
        int oldTelp = this.telp;
        this.telp = telp;
        changeSupport.firePropertyChange("telp", oldTelp, telp);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodePelanggan != null ? kodePelanggan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pelanggan)) {
            return false;
        }
        Pelanggan other = (Pelanggan) object;
        if ((this.kodePelanggan == null && other.kodePelanggan != null) || (this.kodePelanggan != null && !this.kodePelanggan.equals(other.kodePelanggan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "aplikasi.perlengkapan.futsal.Pelanggan[ kodePelanggan=" + kodePelanggan + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
