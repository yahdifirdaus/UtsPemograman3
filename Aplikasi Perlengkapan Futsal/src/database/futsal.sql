-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 30, 2015 at 05:23 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `futsal`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE IF NOT EXISTS `barang` (
  `kode_barang` varchar(5) NOT NULL DEFAULT '',
  `nama_barang` varchar(50) NOT NULL,
  `stok` int(50) NOT NULL,
  `harga` int(50) NOT NULL,
  PRIMARY KEY (`kode_barang`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`kode_barang`, `nama_barang`, `stok`, `harga`) VALUES
('b1', 'Diadora', 11, 790000),
('b2', 'Nike', 12, 900000),
('b4', 'puma', 14, 890000),
('b6', 'adidast', 13, 800000);

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE IF NOT EXISTS `pelanggan` (
  `kode_pelanggan` varchar(5) NOT NULL DEFAULT '',
  `nama_pelanggan` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `telp` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`kode_pelanggan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`kode_pelanggan`, `nama_pelanggan`, `alamat`, `telp`) VALUES
('k1', 'Fazri', 'sawangan', '89235'),
('k2', 'yahdi', 'depok', '81'),
('k4', 'Rahmat', 'Bekasi', '89345678'),
('k5', 'winky', 'pondok kopi, jakarta selatan', '4'),
('k6', 'in', 'depok', '089');

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE IF NOT EXISTS `pembayaran` (
  `kode_penjualan` varchar(50) NOT NULL DEFAULT '',
  `harga_barang` int(50) NOT NULL,
  `jumlah_barang` int(50) NOT NULL,
  `uang` int(50) NOT NULL,
  `total_bayar` int(50) NOT NULL,
  `kembalian` int(50) NOT NULL,
  PRIMARY KEY (`kode_penjualan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pembayaran`
--

INSERT INTO `pembayaran` (`kode_penjualan`, `harga_barang`, `jumlah_barang`, `uang`, `total_bayar`, `kembalian`) VALUES
('p1', 700000, 800000, 700000, 7000000, 5000000),
('p2', 800000, 1, 1000000, 800000, 200000),
('p3', 9000, 1, 10000, 9000, 1000),
('p4', 90000, 1, 1000000, 90000, 910000),
('p5', 65000, 1, 70000, 65000, 5000),
('p6', 9000, 1, 10000, 9000, 1000),
('p7', 90000, 1, 100000, 90000, 10000),
('p8', 8900, 1, 9000, 8900, 100);

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE IF NOT EXISTS `penjualan` (
  `kode_penjualan` varchar(5) NOT NULL DEFAULT '0',
  `kode_barang` varchar(5) NOT NULL,
  `kode_pelanggan` varchar(5) NOT NULL,
  `tanggal_penjualan` varchar(20) NOT NULL,
  `jumlah_barang` int(11) NOT NULL,
  `total_harga` int(20) NOT NULL,
  PRIMARY KEY (`kode_penjualan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`kode_penjualan`, `kode_barang`, `kode_pelanggan`, `tanggal_penjualan`, `jumlah_barang`, `total_harga`) VALUES
('p1', 'b1', 'k1', '10-10-2015', 10, 50000),
('p2', 'b2', 'k2', '17-10-2015', 8, 900000),
('p3', 'b3', 'k3', '28-09-2015', 9, 800000),
('p4', 'b2', 'k1', '18-10-2015', 1, 80000),
('p5', 'b3', 'k3', '28-09-2015', 9, 800000);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
