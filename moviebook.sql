-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 16, 2022 at 09:44 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `moviebook`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `email` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`email`, `username`, `password`) VALUES
('admin@email.com', 'admin', 'admin1234'),
('check@email.com', 'admin2', 'admin2345');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(100) NOT NULL,
  `type` varchar(100) NOT NULL,
  `total` double NOT NULL,
  `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `type`, `total`, `date`) VALUES
(1, 'good', 40, '2022-12-16'),
(3, 'Senior Citizen £30 (3 Pcs)', 30, '2022-12-06'),
(9, 'Adult £45 (3 Pcs)', 45, '2022-12-16'),
(12, 'Adult £45 (3 Pcs) & Student £28 (4 Pcs)', 73, '2022-12-16'),
(13, 'Adult £15.0 (1 Pcs)', 15, '2022-12-16'),
(14, 'Student £14.0 (2 Pcs) AND Adult £15.0 (1 Pcs)', 29, '2022-12-16');

-- --------------------------------------------------------

--
-- Table structure for table `customer_info`
--

CREATE TABLE `customer_info` (
  `id` int(100) NOT NULL,
  `customer_id` int(100) NOT NULL,
  `type` varchar(100) NOT NULL,
  `total` double NOT NULL,
  `movieTitle` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer_info`
--

INSERT INTO `customer_info` (`id`, `customer_id`, `type`, `total`, `movieTitle`) VALUES
(2, 13, 'Adult £15.0 (1 Pcs)', 15, 'Thor: Love and Thunder'),
(3, 14, 'Student £14.0 (2 Pcs) AND Adult £15.0 (1 Pcs)', 29, 'avater');

-- --------------------------------------------------------

--
-- Table structure for table `movie`
--

CREATE TABLE `movie` (
  `id` int(255) NOT NULL,
  `movieTitle` varchar(100) NOT NULL,
  `genre` varchar(100) NOT NULL,
  `duration` varchar(100) NOT NULL,
  `image` varchar(500) NOT NULL,
  `date` date DEFAULT NULL,
  `current` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `movie`
--

INSERT INTO `movie` (`id`, `movieTitle`, `genre`, `duration`, `image`, `date`, `current`) VALUES
(1, 'The Avengers', 'Adventure/Action', '2h 23m', 'A:\\Netbeans Projects\\movie\\src\\image\\avengers.jpg', '2012-12-11', 'Showing'),
(2, 'avater', 'Sci-fi', '2 Hour', 'A:\\Netbeans Projects\\movie\\src\\image\\avater.jpg', '2009-07-08', 'Showing'),
(3, 'Shan-Chi', 'Sci-fi', '2 hour', 'A:\\Netbeans Projects\\movie\\src\\image\\sang chi.jpg', '2022-10-19', 'Showing'),
(4, 'Guardians of the Galaxy', 'Fantasy', '40 min', 'A:\\Netbeans Projects\\movie\\src\\image\\guard.jpg', '2022-11-14', ''),
(5, 'Thor: Love and Thunder', 'Action/Adventure ', '1h 59m', 'A:\\Netbeans Projects\\movie\\src\\image\\p_thorloveandthunder_639_593cb642.jpeg', '2022-08-03', 'Showing'),
(6, 'Doctor Strange', ' Action/Adventure', '1h 55m', 'A:\\Netbeans Projects\\movie\\src\\image\\standard_incredible.jpg', '2016-12-13', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `customer_info`
--
ALTER TABLE `customer_info`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `movie`
--
ALTER TABLE `movie`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `customer_info`
--
ALTER TABLE `customer_info`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `movie`
--
ALTER TABLE `movie`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
