-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 02-Jul-2015 às 02:21
-- Server version: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

 /*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
 /*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
 /*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 /*!40101 SET NAMES utf8 */;

--
-- Database: `hardware`
--

-- --------------------------------------------------------

-- Table structure for `customers`
CREATE TABLE IF NOT EXISTS `customers` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  `complement` varchar(20) DEFAULT NULL,
  `district` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `phone1` int(11) DEFAULT NULL,
  `phone2` int(11) DEFAULT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

-- Dumping data for table `customers`
INSERT INTO `customers` (`customer_id`, `name`, `gender`, `birth_date`, `address`, `number`, `complement`, `district`, `city`, `phone1`, `phone2`) VALUES
(1, 'Ana Santos', 'f', '1995-08-23', 'Rua Pitanga', 45, 'Apto 678', 'Centro', 'Canoas', 111, 1111),
(2, 'Paulo Brittes', 'm', '1987-01-22', 'Av. Goiania', 89, '', 'Ipe', 'Gravatai', 222, 0),
(3, 'Lucas Oliveira', 'm', '1986-05-20', 'Rua Inga', 36, 'Apto 102', 'Ferrari', 'Porto Alegre', 333, 0),
(4, 'Oscar Lima', 'm', '1992-04-12', 'Av. Minas', 76, '', 'Cristal', 'Porto Alegre', 444, 0),
(5, 'Marta Emel', 'f', '1991-06-10', 'Rua Ipe', 85, 'Apto 203', 'Centro', 'Sapucaia', 555, 0),
(6, 'Danilo Silas', 'm', '1978-06-12', 'Av. Bahia', 37, 'Bloco B', 'Pio 23', 'Alvorada', 666, 667),
(7, 'Maria Jarbas', 'f', '1980-07-20', 'Rua Pinho', 91, 'Fundos', 'Centro', 'Alvorada', 777, 0),
(8, 'Carlos Noes', 'm', '1982-05-02', 'Av. Alagoas', 64, 'Apto 302', 'LBV', 'Canoas', 888, 0),
(9, 'Lais Bastos', 'f', '1989-09-03', 'Rua Manga', 68, 'Apto 23', 'Centro', 'Gravatai', 999, 998),
(10, 'Nair Lopes', 'f', '1982-12-11', 'Av. Parana', 23, '', 'Luz', 'Canoas', 100, 0);

-- --------------------------------------------------------

-- Table structure for `delivery_person`
CREATE TABLE IF NOT EXISTS `delivery_person` (
  `delivery_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `contact` int(11) DEFAULT NULL,
  PRIMARY KEY (`delivery_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

-- Dumping data for table `delivery_person`
INSERT INTO `delivery_person` (`delivery_id`, `name`, `contact`) VALUES
(1, 'Bernardo Gomes', 123),
(2, 'Breno Gaspar', 456),
(3, 'Altair Almeida', 654),
(4, 'Gustavo Nover', 321),
(5, 'Leandro Tormes', 789);

-- --------------------------------------------------------

-- Table structure for `inventory`
CREATE TABLE IF NOT EXISTS `inventory` (
  `code` int(11) NOT NULL AUTO_INCREMENT,
  `item` varchar(100) DEFAULT NULL,
  `unit` varchar(5) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `supplier_id` int(11) NOT NULL,
  PRIMARY KEY (`code`),
  KEY `supplier_id` (`supplier_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

-- Dumping data for table `inventory`
INSERT INTO `inventory` (`code`, `item`, `unit`, `price`, `supplier_id`) VALUES
(1, 'Caneta', 'UN', 2, 3),
(2, 'Borracha', 'UN', 2.33, 3),
(3, 'Papel A4', 'RSM', 10, 2),
(4, 'Tinta para Carimbo', 'TB', 4.56, 5),
(5, 'Lápis de cor', 'CX', 8, 7),
(6, 'Grampeador', 'UN', 8.78, 4),
(7, 'Papel manteiga', 'DZ', 5, 2),
(8, 'Compasso', 'UN', 3, 1),
(9, 'Régua', 'UN', 1.1, 6),
(10, 'Apagador', 'UN', 6, 2);

-- --------------------------------------------------------

-- Table structure for `supplier_phones`
CREATE TABLE IF NOT EXISTS `supplier_phones` (
  `supplier_id` int(11) NOT NULL,
  `area_code` int(11) DEFAULT NULL,
  `phone_number` int(11) DEFAULT NULL,
  KEY `supplier_id` (`supplier_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table `supplier_phones`
INSERT INTO `supplier_phones` (`supplier_id`, `area_code`, `phone_number`) VALUES
(1, 51, 9999),
(1, 51, 8888),
(1, 51, 7777),
(2, 51, 6666),
(2, 51, 5555),
(7, 51, 4444),
(7, 51, 3333),
(7, 51, 2222),
(3, 51, 1111),
(4, 51, 9998),
(4, 51, 8887),
(5, 51, 7776),
(5, 51, 6665),
(5, 51, 5554),
(6, 51, 4443),
(5, 51, 3332),
(6, 51, 2221),
(3, 51, 1110);

-- --------------------------------------------------------

-- Table structure for `suppliers`
CREATE TABLE IF NOT EXISTS `suppliers` (
  `supplier_id` int(11) NOT NULL AUTO_INCREMENT,
  `supplier_name` varchar(150) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  `complement` varchar(20) DEFAULT NULL,
  `district` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`supplier_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=8 ;

-- Dumping data for table `suppliers`
INSERT INTO `suppliers` (`supplier_id`, `supplier_name`, `address`, `number`, `complement`, `district`, `city`) VALUES
(1, 'Ferrara LTDA', 'Rua Agostinho', 154, 'Bloco A', 'Sarandi', 'Gravatai'),
(2, 'Tabajara S/A', 'Av. Parque Jardim', 365, '', 'Pq. Jardim', 'Porto Alegre'),
(3, 'Liptos LTDA', 'Rua Kennedy', 233, '', 'Centro', 'Canoas'),
(4, 'Bruno Miles', 'Av. Matinho Lutero', 854, '2andar', 'Restinga', 'Porto Alegre'),
(5, 'Canoas distribuidora', 'Av. Matias Velho', 523, '', 'Floresta', 'Porto Alegre'),
(6, 'Gebasa LTDA', 'Rua Angelita', 25, 'Sala 102', 'Luiz IV', 'Canoas'),
(7, 'Atacado Jarbas', 'Av. Brasil', 452, '', 'Cristal', 'Porto Alegre');

-- --------------------------------------------------------

-- Table structure for `invoices`
CREATE TABLE IF NOT EXISTS `invoices` (
  `invoice_id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `delivery_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  PRIMARY KEY (`invoice_id`),
  KEY `delivery_id` (`delivery_id`),
  KEY `customer_id` (`customer_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

-- Dumping data for table `invoices`
INSERT INTO `invoices` (`invoice_id`, `date`, `delivery_id`, `customer_id`) VALUES
(1, '2012-06-04', 1, 8),
(2, '2012-06-04', 2, 9),
(3, '2012-06-05', 3, 3),
(4, '2012-06-05', 4, 4),
(5, '2012-06-06', 5, 5),
(6, '2012-06-06', 1, 1),
(7, '2012-06-08', 2, 2),
(8, '2012-06-08', 3, 7),
(9, '2012-06-09', 4, 6),
(10, '2012-06-09', 4, 4);

-- --------------------------------------------------------

-- Table structure for `orders`
CREATE TABLE IF NOT EXISTS `orders` (
  `item_code` int(11) NOT NULL,
  `invoice_id` int(11) NOT NULL,
  `quantity` int(11) DEFAULT NULL,
  KEY `item_code` (`item_code`),
  KEY `invoice_id` (`invoice_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table `orders`
INSERT INTO `orders` (`item_code`, `invoice_id`, `quantity`) VALUES
(1, 1, 1),
(2, 1, 2),
(5, 1, 1),
(3, 2, 2),
(8, 2, 1),
(5, 2, 2),
(3, 3, 2),
(5, 3, 1),
(8, 3, 2),
(4, 4, 1),
(3, 4, 2),
(6, 4, 3),
(8, 4, 1),
(5, 4, 2),
(3, 5, 3),
(5, 5, 2),
(7, 5, 1),
(8, 6, 1),
(5, 7, 2),
(5, 7, 3),
(9, 7, 3),
(10, 8, 2),
(5, 8, 1),
(7, 8, 1),
(8, 9, 2),
(4, 9, 3),
(5, 10, 2),
(7, 10, 3);

-- --------------------------------------------------------

-- Constraints for tables with ON DELETE CASCADE

ALTER TABLE `inventory`
  ADD CONSTRAINT `fk_inventory_supplier` FOREIGN KEY (`supplier_id`) REFERENCES `suppliers` (`supplier_id`) ON DELETE CASCADE;

ALTER TABLE `supplier_phones`
  ADD CONSTRAINT `fk_supplier_phones` FOREIGN KEY (`supplier_id`) REFERENCES `suppliers` (`supplier_id`) ON DELETE CASCADE;

ALTER TABLE `invoices`
  ADD CONSTRAINT `fk_invoices_customer` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`customer_id`) ON DELETE CASCADE,
  ADD CONSTRAINT `fk_invoices_delivery` FOREIGN KEY (`delivery_id`) REFERENCES `delivery_person` (`delivery_id`) ON DELETE CASCADE;

ALTER TABLE `orders`
  ADD CONSTRAINT `fk_orders_item` FOREIGN KEY (`item_code`) REFERENCES `inventory` (`code`) ON DELETE CASCADE,
  ADD CONSTRAINT `fk_orders_invoice` FOREIGN KEY (`invoice_id`) REFERENCES `invoices` (`invoice_id`) ON DELETE CASCADE;

 /*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
 /*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
 /*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
