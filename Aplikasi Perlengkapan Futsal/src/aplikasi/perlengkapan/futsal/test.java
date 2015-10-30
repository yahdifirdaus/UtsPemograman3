/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.perlengkapan.futsal;

import java.sql.SQLException;  
 import aplikasi.perlengkapan.futsal.koneksi; 
/**
 *
 * @author seven
 */
public class test {
 
   public static void main(String[] args) throws SQLException {  
     koneksi connection = new koneksi();  
     connection.getkoneksi();  
   }  
    }


