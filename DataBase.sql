-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 25, 2020 at 11:07 PM
-- Server version: 8.0.13-4
-- PHP Version: 7.2.24-0ubuntu0.18.04.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
--

-- --------------------------------------------------------

--
-- Table structure for table `clef`
--

CREATE TABLE `clef` (
  `dbclef` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `clef`
--

INSERT INTO `clef` (`dbclef`) VALUES
('123');

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

CREATE TABLE `client` (
  `dbncin` varchar(8) COLLATE utf8_unicode_ci NOT NULL,
  `dbnom` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `dbprenom` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `dbadresse` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `dbnumtel` varchar(8) COLLATE utf8_unicode_ci NOT NULL,
  `dbncinphoto` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `location`
--

CREATE TABLE `location` (
  `dbmatricule` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `dbdate` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `dbduree` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `tarif` float NOT NULL,
  `dbncin` varchar(8) COLLATE utf8_unicode_ci NOT NULL,
  `dbdatefinloc` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `dbvalide` varchar(2) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `logs`
--

CREATE TABLE `logs` (
  `datalogs` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `notification`
--

CREATE TABLE `notification` (
  `notif` text COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `dbusername` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `dbpass` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `dbtype` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `voiture`
--

CREATE TABLE `voiture` (
  `dbmatricule` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `dbmarque` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `dbcolor` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `dbprice` float NOT NULL,
  `dbstate` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `dbphoto` blob NOT NULL,
  `dbkilo` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
COMMIT;
